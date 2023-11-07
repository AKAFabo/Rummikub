
package com.mycompany.rummikub.GUI;

import com.mycompany.rummikub.Player;
import com.mycompany.rummikub.Tile;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GameGui extends javax.swing.JFrame {

    public GameGui() {
        
        initComponents();
        
        // Inicializa la lista de nombres de archivos de cartas
        
        for (int i = 1; i <= 13; i++) {
            cardFileNames.add("src/resources/tiles/B" + i + "Rummy.png");
            cardFileNames.add("src/resources/tiles/B" + i + "Rummy.png");
            availableTiles.add(new Tile(i, "Black"));
            availableTiles.add(new Tile(i, "Black"));
            
            cardFileNames.add("src/resources/tiles/R" + i + "Rummy.png");
            cardFileNames.add("src/resources/tiles/R" + i + "Rummy.png");
            availableTiles.add(new Tile(i, "Red"));
            availableTiles.add(new Tile(i, "Red"));
   
            cardFileNames.add("src/resources/tiles/G" + i + "Rummy.png");
            cardFileNames.add("src/resources/tiles/G" + i + "Rummy.png");
            availableTiles.add(new Tile(i, "Green"));
            availableTiles.add(new Tile(i, "Green"));
            
            cardFileNames.add("src/resources/tiles/Y" + i + "Rummy.png");
            cardFileNames.add("src/resources/tiles/Y" + i + "Rummy.png");
            availableTiles.add(new Tile(i, "Yellow"));
            availableTiles.add(new Tile(i, "Yellow"));
        }
        cardFileNames.add("src/resources/tiles/BJokerRummy.png");
        cardFileNames.add("src/resources/tiles/RJokerRummy.png");
        availableTiles.add(new Tile(14, "Black"));
        availableTiles.add(new Tile(14, "Yellow"));
        


        // Mezcla la lista de nombres de archivos para orden aleatorio
        Collections.shuffle(cardFileNames);

        // Asigna nombres de archivo aleatorios a los botones
        cardButtons = new javax.swing.JButton[] {Slot1, Slot2, Slot3, Slot4, Slot5, Slot6, Slot7, Slot8, Slot9, Slot10, Slot11, Slot12};

        int availableCards = 106;
        for (int i = 0; i < cardButtons.length; i++) {
            Random tile = new Random();
            int randomIndex = tile.nextInt(availableCards);
            
            String fileName = cardFileNames.get(randomIndex);
            ImageIcon tileImage = new ImageIcon(fileName);
            cardButtons[i].setIcon(tileImage);      
            cardButtons[i].setContentAreaFilled(false);
            availableTiles.remove(randomIndex);
            availableCards--;
   
        }
        
        
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
        jButton1 = new javax.swing.JButton();
        addPlayerButton = new javax.swing.JButton();

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
                    .addGroup(PlayerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jButton1.setText("Start Game!");

        addPlayerButton.setText("Add player");
        addPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerTilesPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayerIconPanels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GameplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(GameButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GamechatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addComponent(PlayerIconPanels, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GameplayPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PlayerTilesPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        // Configuración del GameplayPanel
        GameplayPanel.setBackground(new java.awt.Color(102, 0, 0));

        GridLayout gridLayout = new GridLayout(numRows, numCols);
        GameplayPanel.setLayout(gridLayout);
        // Rellenar la matriz de botones
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                tiles[i][j] = new JButton();
                tiles[i][j].setBackground(new java.awt.Color(102, 0, 0));
                // Establecer el tamaño de los botones (72x103)
                tiles[i][j].setPreferredSize(new Dimension(0, 0));
                GameplayPanel.add(tiles[i][j]);
        }
    }

    // Agregar la separación entre las filas y columnas
    int verticalGap = 5;   // Puedes ajustar este valor según tus preferencias
    gridLayout.setVgap(verticalGap);


        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddTileButtonActionPerformed

    private void Slot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Slot9ActionPerformed

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        
        String message = messageTextField.getText();     
        chatBox.append(player1.getName() + ": " + message + "\n");       
        messageTextField.setText("");
    }//GEN-LAST:event_sendMessageButtonActionPerformed

    private void addPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerButtonActionPerformed
        registerPlayer();
        
    }//GEN-LAST:event_addPlayerButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(GameGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGui().setVisible(true);
            }
        });
    }

    // Extra Variables

    private int numRows = 6;
    private int numCols = 14;
    private JButton[][] tiles = new JButton[numRows][numCols];

    private javax.swing.JButton[] cardButtons;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    
    private ArrayList<Player> playersInGame = new ArrayList<>();
    ArrayList<String> cardFileNames = new ArrayList<>();
    ArrayList<Tile> availableTiles = new ArrayList<>();
    
    private int playerCount = 0;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JButton sendMessageButton;
    // End of variables declaration//GEN-END:variables
}
