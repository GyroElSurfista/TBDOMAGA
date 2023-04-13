/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tbd.tbd.gui;



import com.tbd.tbd.usuarios.Usuario;
import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jairo
 */
public class VentanaDevAlquiler extends javax.swing.JFrame {

   
    private Usuario usr;
    private Connection c;
    private int mouseX, mouseY;
    
    public VentanaDevAlquiler(Usuario usr, Connection c) {
        setLookAndFeel();
        initComponents();
        this.c = c;
        this.usr = usr;
        msjLbl.setVisible(false);
        cargarVentana();
        setTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bar = new javax.swing.JPanel();
        exitB = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();
        msjLbl = new javax.swing.JLabel();
        recPanel = new javax.swing.JPanel();
        recLbl = new javax.swing.JLabel();
        bg2 = new javax.swing.JPanel();
        selecBtn = new javax.swing.JPanel();
        selecLbl = new javax.swing.JLabel();
        devBtn = new javax.swing.JPanel();
        devLbl = new javax.swing.JLabel();
        fechActLbl = new javax.swing.JLabel();
        compSelLbl = new javax.swing.JLabel();
        compAlquiLbl = new javax.swing.JLabel();
        alquiSP = new javax.swing.JScrollPane();
        alquiTab = new javax.swing.JTable();
        selecSP = new javax.swing.JScrollPane();
        selecTab = new javax.swing.JTable();
        fechActTxtBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(237, 241, 214));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.setPreferredSize(new java.awt.Dimension(737, 467));

        bar.setBackground(new java.awt.Color(237, 241, 214));
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        exitB.setBackground(new java.awt.Color(237, 241, 214));
        exitB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBMouseExited(evt);
            }
        });

        exitLbl.setBackground(new java.awt.Color(237, 241, 214));
        exitLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        exitLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBLayout = new javax.swing.GroupLayout(exitB);
        exitB.setLayout(exitBLayout);
        exitBLayout.setHorizontalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBLayout.setVerticalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        msjLbl.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        msjLbl.setText("Devolución exitosa");
        msjLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                msjLblMouseMoved(evt);
            }
        });

        recPanel.setBackground(new java.awt.Color(237, 241, 214));
        recPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recPanelMouseExited(evt);
            }
        });

        recLbl.setBackground(new java.awt.Color(237, 241, 214));
        recLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        recLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recLbl.setText("R");
        recLbl.setToolTipText("");
        recLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout recPanelLayout = new javax.swing.GroupLayout(recPanel);
        recPanel.setLayout(recPanelLayout);
        recPanelLayout.setHorizontalGroup(
            recPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        recPanelLayout.setVerticalGroup(
            recPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjLbl)
                .addGap(223, 223, 223)
                .addComponent(recPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msjLbl, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        selecBtn.setBackground(new java.awt.Color(255, 255, 255));

        selecLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        selecLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selecLbl.setText("Seleccionar");
        selecLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout selecBtnLayout = new javax.swing.GroupLayout(selecBtn);
        selecBtn.setLayout(selecBtnLayout);
        selecBtnLayout.setHorizontalGroup(
            selecBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selecLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        selecBtnLayout.setVerticalGroup(
            selecBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selecLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        devBtn.setBackground(new java.awt.Color(255, 255, 255));

        devLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        devLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devLbl.setText("Devolver");
        devLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout devBtnLayout = new javax.swing.GroupLayout(devBtn);
        devBtn.setLayout(devBtnLayout);
        devBtnLayout.setHorizontalGroup(
            devBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        devBtnLayout.setVerticalGroup(
            devBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        fechActLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        fechActLbl.setForeground(new java.awt.Color(255, 255, 255));
        fechActLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fechActLbl.setText("Fecha Actual:");
        fechActLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fechActLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechActLblMouseClicked(evt);
            }
        });

        compSelLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        compSelLbl.setForeground(new java.awt.Color(255, 255, 255));
        compSelLbl.setText("COMPUTADORAS SELECCIONADAS:");

        compAlquiLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        compAlquiLbl.setForeground(new java.awt.Color(255, 255, 255));
        compAlquiLbl.setText("COMPUTADORAS ALQUILADAS:");

        alquiTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        alquiTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdAlqui", "idComp", "Fecha Inicio", "Fecha Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        alquiTab.setFocusable(false);
        alquiTab.setGridColor(new java.awt.Color(167, 167, 167));
        alquiTab.setRowHeight(30);
        alquiTab.setSelectionBackground(new java.awt.Color(147, 147, 147));
        alquiTab.setSelectionForeground(new java.awt.Color(255, 255, 255));
        alquiTab.setShowHorizontalLines(true);
        alquiTab.getTableHeader().setReorderingAllowed(false);
        alquiSP.setViewportView(alquiTab);
        if (alquiTab.getColumnModel().getColumnCount() > 0) {
            alquiTab.getColumnModel().getColumn(0).setResizable(false);
            alquiTab.getColumnModel().getColumn(1).setResizable(false);
            alquiTab.getColumnModel().getColumn(2).setResizable(false);
            alquiTab.getColumnModel().getColumn(3).setResizable(false);
        }

        selecTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        selecTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdAlqui", "idComp", "Fecha Inicio", "Fecha Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        selecTab.setFocusable(false);
        selecTab.setGridColor(new java.awt.Color(167, 167, 167));
        selecTab.setRowHeight(30);
        selecTab.setSelectionBackground(new java.awt.Color(147, 147, 147));
        selecTab.setSelectionForeground(new java.awt.Color(255, 255, 255));
        selecTab.setShowHorizontalLines(true);
        selecTab.getTableHeader().setReorderingAllowed(false);
        selecSP.setViewportView(selecTab);
        if (selecTab.getColumnModel().getColumnCount() > 0) {
            selecTab.getColumnModel().getColumn(0).setResizable(false);
            selecTab.getColumnModel().getColumn(1).setResizable(false);
            selecTab.getColumnModel().getColumn(2).setResizable(false);
            selecTab.getColumnModel().getColumn(3).setResizable(false);
        }

        fechActTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        fechActTxtBox.setForeground(new java.awt.Color(204, 204, 204));
        fechActTxtBox.setText("Fecha Actual");
        fechActTxtBox.setBorder(null);
        fechActTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechActTxtBoxFocusGained(evt);
            }
        });
        fechActTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechActTxtBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecSP, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compSelLbl)
                            .addComponent(compAlquiLbl)
                            .addComponent(alquiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(devBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bg2Layout.createSequentialGroup()
                                    .addComponent(fechActLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fechActTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(compAlquiLbl)
                .addGap(18, 18, 18)
                .addComponent(alquiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(compSelLbl)
                .addGap(18, 18, 18)
                .addComponent(selecSP, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechActLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(fechActTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(devBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX , y - mouseY );
    }//GEN-LAST:event_barMouseDragged

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLblMouseClicked

    private void exitLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitLblMouseEntered

    private void exitBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitBMouseExited

    private void exitBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitBMouseEntered

    private void exitLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseExited
        exitB.setBackground(new Color(237,241,214));
    }//GEN-LAST:event_exitLblMouseExited

    private void devLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devLblMouseClicked
        int filas;
        Date fechAct;
        CallableStatement stmnt;

        
        filas = selecTab.getRowCount();
        
        if(filas > 0){
            
            fechAct = Date.valueOf(fechActTxtBox.getText());
            
            try{
                
                    for(int i = 0; i < filas; i++){
                        stmnt = c.prepareCall("SELECT devCompAlqui(?,?,?,?)");
                        stmnt.setInt(1, Integer.parseInt((String)selecTab.getValueAt(i, 0)));
                        stmnt.setInt(2, usr.getIdUsr());
                        stmnt.setInt(3, Integer.parseInt((String)selecTab.getValueAt(i, 1)));
                        stmnt.setDate(4, fechAct);
                        stmnt.execute();
                    }
                    
                    msjLbl.setVisible(true);
                            
            }catch(SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_devLblMouseClicked

    private void selecLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecLblMouseClicked
        int fil;
        Object[] nueva;
        DefaultTableModel modDisp, modSelec;
        
        fil = alquiTab.getSelectedRow();
        if(fil >= 0){
            nueva = new Object[alquiTab.getColumnCount()];
            
            for(int i = 0 ; i < alquiTab.getColumnCount(); i++){
                nueva[i] = alquiTab.getValueAt(fil, i);
            }
            
            modSelec = (DefaultTableModel)selecTab.getModel();
            modDisp  = (DefaultTableModel)alquiTab.getModel();
            
            modSelec.addRow(nueva);
            modDisp.removeRow(fil);
            
        }
    }//GEN-LAST:event_selecLblMouseClicked

    private void fechActLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechActLblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fechActLblMouseClicked

    private void fechActTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechActTxtBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fechActTxtBoxFocusGained

    private void fechActTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechActTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechActTxtBoxActionPerformed

    private void recLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recLblMouseClicked
        cargarVentana();
    }//GEN-LAST:event_recLblMouseClicked

    private void recLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recLblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_recLblMouseEntered

    private void recLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recLblMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_recLblMouseExited

    private void recPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_recPanelMouseEntered

    private void recPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_recPanelMouseExited

    private void msjLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msjLblMouseMoved
        if(msjLbl.isVisible()){
            int segundos = 1; // Tiempo en segundos
            try {
                Thread.sleep(segundos * 1000); // El argumento se expresa en milisegundos, por lo que se multiplica por 1000
                msjLbl.setVisible(false);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        
    }//GEN-LAST:event_msjLblMouseMoved

    /**
     * @param args the command line arguments
     */
    
    
    private void setTable(){
        alquiTab.getTableHeader().setBackground(new Color(255,255,255));
        alquiTab.getTableHeader().setForeground(Color.BLACK);
        alquiTab.setRowHeight(30);
    }
    
    private ResultSet getCompusAlq(){
        ResultSet rs;
        PreparedStatement stmnt;
        
        rs = null;
        
        try{
         
            stmnt = c.prepareCall("SELECT * FROM getCompAlqui(?)");
            
            stmnt.setInt(1, usr.getIdUsr());
            stmnt.execute();
            rs = stmnt.getResultSet();
           
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        return rs;
    }
    
    private void setCompusAlq(){
        ResultSet rs;
        DefaultTableModel modelo;
        Object[]          fila;
        
        rs = getCompusAlq();
        modelo  = (DefaultTableModel) alquiTab.getModel();
        
        modelo.setRowCount(0);
        try{
            while(rs.next()){
                fila    = new Object[4];
                fila[0] = rs.getString("idAlqui");
                fila[1] = rs.getString("idComp");
                fila[2] = rs.getString("fechIniAlqui");
                fila[3] = rs.getString("fechFinAlqui");
                modelo.addRow(fila);

            }
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearCompusSelec(){
        DefaultTableModel modelo;
        modelo  = (DefaultTableModel) selecTab.getModel();
        modelo.setRowCount(0);
    }
    
    private void setFechAct(){
        ResultSet rs;
        PreparedStatement stmnt;
        try{
         
            stmnt = c.prepareCall("SELECT * FROM CURRENT_DATE");
            
            stmnt.execute();
            rs = stmnt.getResultSet();
            
            if(rs.next()){
                fechActTxtBox.setText(rs.getString("current_date"));
            }
           
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarVentana(){
        setTable();
        setCompusAlq();
        clearCompusSelec();
        setFechAct();
        msjLbl.setVisible(false);
    }
    
    

    private void setLookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDevAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDevAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDevAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDevAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane alquiSP;
    private javax.swing.JTable alquiTab;
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JLabel compAlquiLbl;
    private javax.swing.JLabel compSelLbl;
    private javax.swing.JPanel devBtn;
    private javax.swing.JLabel devLbl;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel fechActLbl;
    private javax.swing.JTextField fechActTxtBox;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JLabel recLbl;
    private javax.swing.JPanel recPanel;
    private javax.swing.JPanel selecBtn;
    private javax.swing.JLabel selecLbl;
    private javax.swing.JScrollPane selecSP;
    private javax.swing.JTable selecTab;
    // End of variables declaration//GEN-END:variables
}
