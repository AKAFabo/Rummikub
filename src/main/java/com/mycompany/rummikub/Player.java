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
    private int playerNumber;
    private int tileCounter = 0;
    private int victoryCount = 0;
    private ArrayList<String> maze = new ArrayList<>();

    public int getVictoryCount() {
        return victoryCount;
    }

    public void setVictoryCount(int victoryCount) {
        this.victoryCount += victoryCount;
    }

    public int getTileCounter() {
        return tileCounter;
    }

    public void setTileCounter(int tileCounter) {
        this.tileCounter = tileCounter;
    }

    
    public ArrayList<String> getMaze() {
        return maze;
    }
    public void setMaze(ArrayList<String> maze) {
        this.maze = maze;
    }
    public String getPaths(){
        String rt = "Cartas de: " + this.name + "\n";
        
        for (String path : this.maze){
            rt += path + "\n";  
        }
        return rt;
    }
 
    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
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

        tileList += this.getMaze().size() + "\n";

        return tileList;
    }
    
}
