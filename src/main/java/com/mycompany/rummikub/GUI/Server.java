package com.mycompany.rummikub.GUI;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server {
    private static ArrayList<DataOutputStream> clients = new ArrayList<>();
    private ServerSocket serverSocket;
    private int playersOnline = 0;

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server is running on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                DataOutputStream clientOut = new DataOutputStream(clientSocket.getOutputStream());
                clients.add(clientOut);
                playersOnline++;
                
                System.out.println("Client #" + playersOnline + " joined");

                ClientHandler handler = new ClientHandler(clientSocket);
                new Thread(handler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = 1234;
        new Server(port);
    }

    private static class ClientHandler implements Runnable {
        private Socket socket;
        private DataInputStream din;

        public ClientHandler(Socket clientSocket) {
            socket = clientSocket;
            try {
                din = new DataInputStream(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String message = din.readUTF();
                    broadcastMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void broadcastMessage(String message) {
        for (DataOutputStream client : clients) {
            try {
                client.writeUTF(message);
                client.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

