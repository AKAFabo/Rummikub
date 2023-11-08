
package com.mycompany.rummikub.GUI;

import com.mycompany.rummikub.Player;
import com.mycompany.rummikub.Tile;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Client extends javax.swing.JFrame {

    public Client() {        
        initComponents();
        
        try {
            socket = new Socket("localhost", 1234); // Cambia la dirección IP y el puerto según tu configuración
            din = new DataInputStream(socket.getInputStream());
            dout = new DataOutputStream(socket.getOutputStream());

            new Thread(new ClientHandler()).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        setBoard();
        fillButtonsArray();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PlayerIconPanels = new javax.swing.JPanel();
        Player1Icon = new javax.swing.JLabel();
        Player2Icon = new javax.swing.JLabel();
        Player3Icon = new javax.swing.JLabel();
        Player4Icon = new javax.swing.JLabel();
        GameplayPanel = new javax.swing.JPanel();
        GamechatPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextArea();
        messageTextField = new javax.swing.JTextField();
        sendMessageButton = new javax.swing.JButton();
        PlayerTilesPannel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Slot1 = new javax.swing.JButton();
        Slot4 = new javax.swing.JButton();
        Slot2 = new javax.swing.JButton();
        Slot12 = new javax.swing.JButton();
        Slot3 = new javax.swing.JButton();
        Slot5 = new javax.swing.JButton();
        Slot6 = new javax.swing.JButton();
        Slot7 = new javax.swing.JButton();
        Slot8 = new javax.swing.JButton();
        Slot9 = new javax.swing.JButton();
        Slot10 = new javax.swing.JButton();
        Slot11 = new javax.swing.JButton();
        Slot24 = new javax.swing.JButton();
        Slot13 = new javax.swing.JButton();
        Slot14 = new javax.swing.JButton();
        Slot15 = new javax.swing.JButton();
        Slot17 = new javax.swing.JButton();
        Slot16 = new javax.swing.JButton();
        Slot18 = new javax.swing.JButton();
        Slot19 = new javax.swing.JButton();
        Slot20 = new javax.swing.JButton();
        Slot21 = new javax.swing.JButton();
        Slot22 = new javax.swing.JButton();
        Slot23 = new javax.swing.JButton();
        GameButtonsPanel = new javax.swing.JPanel();
        AddTileButton = new javax.swing.JButton();
        PassButton = new javax.swing.JButton();
        startGameButton = new javax.swing.JButton();
        addPlayerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selectedTileLabel = new javax.swing.JLabel();
        nextPlayerButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rummikub");
        setBackground(new java.awt.Color(0, 102, 204));

        PlayerIconPanels.setBackground(new java.awt.Color(0, 102, 204));

        Player1Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Xtremetech\\Documents\\NetBeansProjects\\Rummikub\\src\\resources\\playerIcons\\Player1.png")); // NOI18N
        Player1Icon.setText("Player1");
        Player1Icon.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Player2Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Xtremetech\\Documents\\NetBeansProjects\\Rummikub\\src\\resources\\playerIcons\\Player2.png")); // NOI18N
        Player2Icon.setText("Player2");

        Player3Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Xtremetech\\Documents\\NetBeansProjects\\Rummikub\\src\\resources\\playerIcons\\Player3.png")); // NOI18N
        Player3Icon.setText("Player3");

        Player4Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Xtremetech\\Documents\\NetBeansProjects\\Rummikub\\src\\resources\\playerIcons\\Player4.png")); // NOI18N
        Player4Icon.setText("Player4");

        javax.swing.GroupLayout PlayerIconPanelsLayout = new javax.swing.GroupLayout(PlayerIconPanels);
        PlayerIconPanels.setLayout(PlayerIconPanelsLayout);
        PlayerIconPanelsLayout.setHorizontalGroup(
            PlayerIconPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerIconPanelsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PlayerIconPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Player4Icon)
                    .addComponent(Player3Icon)
                    .addComponent(Player2Icon)
                    .addComponent(Player1Icon))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PlayerIconPanelsLayout.setVerticalGroup(
            PlayerIconPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerIconPanelsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Player1Icon)
                .addGap(66, 66, 66)
                .addComponent(Player2Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Player3Icon)
                .addGap(68, 68, 68)
                .addComponent(Player4Icon)
                .addGap(80, 80, 80))
        );

        GameplayPanel.setBackground(new java.awt.Color(102, 0, 0));
        GameplayPanel.setLayout(new java.awt.GridBagLayout());

        GamechatPanel.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setText("Chat");

        chatBox.setEditable(false);
        chatBox.setColumns(20);
        chatBox.setRows(5);
        chatBox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(chatBox);

        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });

        sendMessageButton.setText("Send Message");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GamechatPanelLayout = new javax.swing.GroupLayout(GamechatPanel);
        GamechatPanel.setLayout(GamechatPanelLayout);
        GamechatPanelLayout.setHorizontalGroup(
            GamechatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamechatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GamechatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(messageTextField)
                    .addGroup(GamechatPanelLayout.createSequentialGroup()
                        .addGroup(GamechatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(sendMessageButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GamechatPanelLayout.setVerticalGroup(
            GamechatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamechatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendMessageButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PlayerTilesPannel.setBackground(new java.awt.Color(101, 61, 62));

        Slot2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Slot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlayerTilesPannelLayout = new javax.swing.GroupLayout(PlayerTilesPannel);
        PlayerTilesPannel.setLayout(PlayerTilesPannelLayout);
        PlayerTilesPannelLayout.setHorizontalGroup(
            PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(PlayerTilesPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Slot13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Slot14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Slot15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Slot16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Slot17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Slot18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Slot19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Slot20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Slot21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Slot10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Slot11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot23, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Slot12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PlayerTilesPannelLayout.setVerticalGroup(
            PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerTilesPannelLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Slot13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot23, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        GameButtonsPanel.setBackground(new java.awt.Color(0, 120, 204));

        AddTileButton.setText("Add a tile");
        AddTileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTileButtonActionPerformed(evt);
            }
        });

        PassButton.setText("Pass");

        javax.swing.GroupLayout GameButtonsPanelLayout = new javax.swing.GroupLayout(GameButtonsPanel);
        GameButtonsPanel.setLayout(GameButtonsPanelLayout);
        GameButtonsPanelLayout.setHorizontalGroup(
            GameButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GameButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddTileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        GameButtonsPanelLayout.setVerticalGroup(
            GameButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddTileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        startGameButton.setText("Start Game!");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        addPlayerButton.setText("Add player");
        addPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Selected tile: ");

        selectedTileLabel.setText("No selected tile");

        nextPlayerButton.setText("Next Player");
        nextPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPlayerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayerTilesPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(selectedTileLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayerIconPanels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GameplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GameButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GamechatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startGameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addPlayerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(GamechatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GameButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addComponent(PlayerIconPanels, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GameplayPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerTilesPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectedTileLabel))
                            .addComponent(addPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTileButtonActionPerformed
      
        Random tile = new Random();
        int randomIndex = tile.nextInt(availableCards);
        String fileName = cardFileNames.get(randomIndex);             
        playersInGame.get(currentPlayer).addTile(fileName);
        playersInGame.get(currentPlayer).increaseTileCounter();
        availableTiles.remove(randomIndex);
        cardFileNames.remove(randomIndex);
        availableCards--;
        showMaze(currentPlayer);
        
    }//GEN-LAST:event_AddTileButtonActionPerformed

    private void Slot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Slot9ActionPerformed

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        String message = messageTextField.getText();
        sendMessage(message);
        messageTextField.setText("");
    }//GEN-LAST:event_sendMessageButtonActionPerformed

    private void sendMessage(String message) {
        try {
            dout.writeUTF(message); // Envía el mensaje al servidor
            dout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void addPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerButtonActionPerformed
        registerPlayer();
        
    }//GEN-LAST:event_addPlayerButtonActionPerformed

    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        if (playerCount <= 1){ 
            JOptionPane.showMessageDialog(null, "Jugadores insuficientes, " + playerCount + " jugadores registrados", "Rummikub", JOptionPane.INFORMATION_MESSAGE);  
        }
        else {
            startGame();
        }
        
    }//GEN-LAST:event_startGameButtonActionPerformed

    private void nextPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPlayerButtonActionPerformed
        // TODO add your handling code here:
        
            currentPlayer = (currentPlayer + 1) % playersInGame.size();
            showMaze(currentPlayer);
        
    }//GEN-LAST:event_nextPlayerButtonActionPerformed
     
    public void registerPlayer() {
        if (playerCount < 4) {
            String playerName = JOptionPane.showInputDialog("Ingresa el nombre del jugador:");

            if (playerName != null && !playerName.isEmpty()) {
                System.out.println("Jugador registrado: " + playerName);
                playerCount++;     
                switch (playerCount) {
                    case 1:
                        player1 = new Player(playerName, 1);
                        Player1Icon.setText(playerName);
                        playersInGame.add(player1);
                        break;
                    case 2:
                        player2 = new Player(playerName, 2);
                        Player2Icon.setText(playerName);
                        playersInGame.add(player2);
                        break;
                    case 3:
                        player3 = new Player(playerName, 3);
                        Player3Icon.setText(playerName);
                        playersInGame.add(player3);
                        break;
                    case 4:
                        player4 = new Player(playerName, 4);
                        Player4Icon.setText(playerName);
                        playersInGame.add(player4);
                        break;                
                }              
            } else {
                System.out.println("Nombre de jugador no válido.");
            }
        }
    }
    
    public void setBoard(){
        // Configuración del GameplayPanel
        GameplayPanel.setBackground(new java.awt.Color(102, 0, 0));

        GridLayout gridLayout = new GridLayout(numRows, numCols);
        GameplayPanel.setLayout(gridLayout);
        // Rellenar la matriz de botones
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                tiles[i][j] = new JButton();
                tiles[i][j].setBackground(new java.awt.Color(102, 0, 0));
                tiles[i][j].setPreferredSize(new Dimension(0, 0));
                GameplayPanel.add(tiles[i][j]);
        }
    }

    int verticalGap = 5;   // Puedes ajustar este valor según tus preferencias
    gridLayout.setVgap(verticalGap);
    
    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            final int row = i;
            final int col = j;
            tiles[i][j].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        if (!hasTile[row][col]){
                            tiles[row][col].setIcon(selectedIcon);
                            hasTile[row][col] = true;

                            selectedIcon = null;  // Limpia el icono seleccionado
                            selectedTileLabel.setText("No tile selected");
                            selectedTileLabel.setIcon(null);
                            cardButtons.get(tileIndex).setIcon(null);   

                            int mazeSize = playersInGame.get(currentPlayer).getMaze().size();
                                              
                            for (int i = 0; i < mazeSize; i++) {
                                String path = playersInGame.get(currentPlayer).getMaze().get(i);
                                if (selectedPath.equalsIgnoreCase(path)) {
                                    playersInGame.get(currentPlayer).removeTile(i);
                                    System.out.println(playersInGame.get(currentPlayer).getPaths());
                                    break;
                                }
                            }
                        }
                        
                        System.out.println(playersInGame.get(currentPlayer).viewTiles());
                        playersInGame.get(currentPlayer).decreaseTileCounter();

                    }
                }); 
            }
        }
    }
    
    public void startGame(){
  
        
        for (int i = 1; i <= 13; i++) {
            cardFileNames.add("src/resources/tiles/B" + i + "Rummy.png");
            cardFileNames.add("src/resources/tiles/B" + i + "Rummy.png");
            availableTiles.add(new Tile(i, "Black", "src/resources/tiles/B" + i + "Rummy.png"));
            availableTiles.add(new Tile(i, "Black", "src/resources/tiles/B" + i + "Rummy.png"));
            
            cardFileNames.add("src/resources/tiles/R" + i + "Rummy.png");
            cardFileNames.add("src/resources/tiles/R" + i + "Rummy.png");
            availableTiles.add(new Tile(i, "Red", "src/resources/tiles/R" + i + "Rummy.png"));
            availableTiles.add(new Tile(i, "Red", "src/resources/tiles/R" + i + "Rummy.png"));
   
            cardFileNames.add("src/resources/tiles/G" + i + "Rummy.png");
            cardFileNames.add("src/resources/tiles/G" + i + "Rummy.png");
            availableTiles.add(new Tile(i, "Green", "src/resources/tiles/G" + i + "Rummy.png"));
            availableTiles.add(new Tile(i, "Green", "src/resources/tiles/G" + i + "Rummy.png"));
            
            cardFileNames.add("src/resources/tiles/Y" + i + "Rummy.png");
            cardFileNames.add("src/resources/tiles/Y" + i + "Rummy.png");
            availableTiles.add(new Tile(i, "Yellow", "src/resources/tiles/Y" + i + "Rummy.png"));
            availableTiles.add(new Tile(i, "Yellow", "src/resources/tiles/Y" + i + "Rummy.png"));
        }
        cardFileNames.add("src/resources/tiles/BJokerRummy.png");
        cardFileNames.add("src/resources/tiles/RJokerRummy.png");
        availableTiles.add(new Tile(14, "Black", "src/resources/tiles/BJokerRummy.png"));
        availableTiles.add(new Tile(14, "Yellow", "src/resources/tiles/RJokerRummy.png"));
                  
        for (Player player : playersInGame){
                 
        
            for (int i = 0; i < 12; i++) {
                Random tile = new Random();
                int randomIndex = tile.nextInt(availableCards);

                String fileName = cardFileNames.get(randomIndex);
                player.addTile(fileName);
                player.increaseTileCounter();
                availableTiles.remove(randomIndex);
                cardFileNames.remove(randomIndex);
                availableCards--;
               
            }
            System.out.println(player.getMaze().size());
            System.out.println(player.getPaths());
            
            
        }
        showMaze(currentPlayer);
    }
    
    public void showMaze(int currentPlayer) {
        Player player = playersInGame.get(currentPlayer);
        
        for (int j = 0; j < cardButtons.size(); j++){
            cardButtons.get(j).setIcon(null);
        }
        
        System.out.println(player.getMaze().size());
        for (int i = 0; i < player.getMaze().size(); i++) {
            final int buttonIndex = i;

            String fileName = player.getTile(i);
            ImageIcon tileImage = new ImageIcon(fileName);
            cardButtons.get(i).setIcon(tileImage);

            cardButtons.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedIcon = (ImageIcon) cardButtons.get(buttonIndex).getIcon();
                    selectedPath = (selectedIcon.getDescription());
                    selectedTileLabel.setText(null);
                    selectedTileLabel.setIcon(selectedIcon);
                    tileIndex = buttonIndex;
                    
                }
            });
        }
    }
   
    public void fillButtonsArray(){ //Horrible method but idc
        cardButtons.add(Slot1);
        cardButtons.add(Slot2);
        cardButtons.add(Slot3);
        cardButtons.add(Slot4);
        cardButtons.add(Slot5);
        cardButtons.add(Slot6);
        cardButtons.add(Slot7);
        cardButtons.add(Slot8);
        cardButtons.add(Slot9);
        cardButtons.add(Slot10);
        cardButtons.add(Slot11);
        cardButtons.add(Slot12);
        cardButtons.add(Slot13);
        cardButtons.add(Slot14);
        cardButtons.add(Slot15);
        cardButtons.add(Slot16);
        cardButtons.add(Slot17);
        cardButtons.add(Slot18);
        cardButtons.add(Slot19);
        cardButtons.add(Slot20);
        cardButtons.add(Slot21);
        cardButtons.add(Slot22);
        cardButtons.add(Slot23);
        cardButtons.add(Slot24);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Client().setVisible(true);
                }
             });

        }
    
    private class ClientHandler implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    String message = din.readUTF();
                    chatBox.append(message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Extra Variables

    private int numRows = 6;
    private int numCols = 14;
    private JButton[][] tiles = new JButton[numRows][numCols];
    private Tile[][] tilesInBoard = new Tile[numRows][numCols];
    private boolean[][] hasTile = new boolean[numRows][numCols];

    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;

    private int currentPlayer = 0;
    int availableCards = 106; 
    
    private ArrayList<Player> playersInGame = new ArrayList<>();
    ArrayList<String> cardFileNames = new ArrayList<>();
    ArrayList<Tile> availableTiles = new ArrayList<>();
    
    private int playerCount = 0;
    private ImageIcon selectedIcon;
    private String selectedPath;
    private int tileIndex;
    
    private Socket socket;
    private DataInputStream din;
    private DataOutputStream dout;
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTileButton;
    private javax.swing.JPanel GameButtonsPanel;
    private javax.swing.JPanel GamechatPanel;
    private javax.swing.JPanel GameplayPanel;
    private javax.swing.JButton PassButton;
    private javax.swing.JLabel Player1Icon;
    private javax.swing.JLabel Player2Icon;
    private javax.swing.JLabel Player3Icon;
    private javax.swing.JLabel Player4Icon;
    private javax.swing.JPanel PlayerIconPanels;
    private javax.swing.JPanel PlayerTilesPannel;
    private javax.swing.JButton Slot1;
    private javax.swing.JButton Slot10;
    private javax.swing.JButton Slot11;
    private javax.swing.JButton Slot12;
    private javax.swing.JButton Slot13;
    private javax.swing.JButton Slot14;
    private javax.swing.JButton Slot15;
    private javax.swing.JButton Slot16;
    private javax.swing.JButton Slot17;
    private javax.swing.JButton Slot18;
    private javax.swing.JButton Slot19;
    private javax.swing.JButton Slot2;
    private javax.swing.JButton Slot20;
    private javax.swing.JButton Slot21;
    private javax.swing.JButton Slot22;
    private javax.swing.JButton Slot23;
    private javax.swing.JButton Slot24;
    private javax.swing.JButton Slot3;
    private javax.swing.JButton Slot4;
    private javax.swing.JButton Slot5;
    private javax.swing.JButton Slot6;
    private javax.swing.JButton Slot7;
    private javax.swing.JButton Slot8;
    private javax.swing.JButton Slot9;
    private javax.swing.JButton addPlayerButton;
    private javax.swing.JTextArea chatBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JButton nextPlayerButton;
    private javax.swing.JLabel selectedTileLabel;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables
    private ArrayList<JButton> cardButtons = new ArrayList<>();
}
