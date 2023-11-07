/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rummikub;

import java.util.ArrayList;

/**
 *
 * @author Fabo
 */
public class Player {
    
    private String name;
    private int points = 0;
    private int playerNumber;
    private int tileCounter = 0;
    private ArrayList<String> maze = new ArrayList<>();

    
    
    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getTileCounter() {
        return tileCounter;
    }

    public void increaseTileCounter() {
        this.tileCounter += 1;
    }
    
    public void decreaseTileCounter(){
        this.tileCounter -= 1;
    }

    public Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getTile(int i) {
        return maze.get(i);
    }
    
    public void removeTile(int i){
        this.maze.remove(i);
    }

    public void addTile(String path) {
        this.maze.add(path);
    }
    
    public String viewTiles(){
        
        String tileList = "Cantidad de cartas del jugador: " + this.getName() + "\n\n";

        tileList += this.getTileCounter() + "\n";

        return tileList;
    }
    
}
