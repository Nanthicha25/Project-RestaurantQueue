package GUI;
import lib.*;
import Menu.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
import menu.RestaurantQueue.lib.ReadFile;
import java.util.List;
import lib.food;
import GUI.MenuItemPanel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */

public class MainDisplay extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainDisplay.class.getName());
    
    /**
     * Creates new form MainFrame
     */
    public MainDisplay() {
        initComponents();
        loadMenu(InsideMaincourse, "src\\menu\\RestaurantQueue\\MaincourseStock.txt"); 
        loadMenu(InsideDrinks, "src\\menu\\RestaurantQueue\\DrinksStock.txt"); 
        loadMenu(InsideDessert, "src\\menu\\RestaurantQueue\\DessertStock.txt"); 
        this.setLocationRelativeTo(null); 
    }
    
    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        MiddlePanel = new javax.swing.JPanel();
        QueuePanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MainCoursePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InsideMaincourse = new javax.swing.JPanel();
        DrinksPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        InsideDrinks = new javax.swing.JPanel();
        DessertPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InsideDessert = new javax.swing.JPanel();
        BottomPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 800));

        HeadPanel.setBackground(new java.awt.Color(234, 198, 167));
        HeadPanel.setPreferredSize(new java.awt.Dimension(1029, 100));
        HeadPanel.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(234, 198, 167));

        jButton1.setBackground(new java.awt.Color(110, 186, 140));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setLabel("Queue");
        jButton1.setMaximumSize(new java.awt.Dimension(173, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        HeadPanel.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(234, 198, 167));

        jButton2.setBackground(new java.awt.Color(110, 186, 140));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Main Coruse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 40, 139));
        jLabel2.setText("MAIN");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        HeadPanel.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(234, 198, 167));

        jButton3.setBackground(new java.awt.Color(110, 186, 140));
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Drinks");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 40, 139));
        jLabel1.setText("MENU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        HeadPanel.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(234, 198, 167));
        jPanel4.setForeground(new java.awt.Color(0, 0, 102));

        jButton4.setBackground(new java.awt.Color(110, 186, 140));
        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Dessert");
        jButton4.setMaximumSize(new java.awt.Dimension(173, 41));
        jButton4.setPreferredSize(new java.awt.Dimension(173, 41));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        HeadPanel.add(jPanel4);

        getContentPane().add(HeadPanel, java.awt.BorderLayout.PAGE_START);

        MiddlePanel.setLayout(new java.awt.CardLayout());

        QueuePanel.setBackground(new java.awt.Color(238, 198, 167));

        jPanel9.setBackground(new java.awt.Color(234, 198, 167));
        jPanel9.setPreferredSize(new java.awt.Dimension(1042, 402));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Queue", "OederList", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setPreferredSize(new java.awt.Dimension(225, 320));
        jTable1.setRowHeight(30);
        jScrollPane5.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel9.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout QueuePanelLayout = new javax.swing.GroupLayout(QueuePanel);
        QueuePanel.setLayout(QueuePanelLayout);
        QueuePanelLayout.setHorizontalGroup(
            QueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QueuePanelLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        QueuePanelLayout.setVerticalGroup(
            QueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueuePanelLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        MiddlePanel.add(QueuePanel, "card5");

        MainCoursePanel.setBackground(new java.awt.Color(234, 198, 167));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        InsideMaincourse.setBackground(new java.awt.Color(255, 255, 255));
        InsideMaincourse.setLayout(new java.awt.GridLayout(0, 3, 5, 5));
        jScrollPane2.setViewportView(InsideMaincourse);

        javax.swing.GroupLayout MainCoursePanelLayout = new javax.swing.GroupLayout(MainCoursePanel);
        MainCoursePanel.setLayout(MainCoursePanelLayout);
        MainCoursePanelLayout.setHorizontalGroup(
            MainCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainCoursePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        MainCoursePanelLayout.setVerticalGroup(
            MainCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainCoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        MiddlePanel.add(MainCoursePanel, "card4");

        DrinksPanel.setBackground(new java.awt.Color(238, 198, 167));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        InsideDrinks.setBackground(new java.awt.Color(255, 255, 255));
        InsideDrinks.setAlignmentX(10.0F);
        InsideDrinks.setAlignmentY(10.0F);
        InsideDrinks.setLayout(new java.awt.GridLayout(0, 3, 5, 5));
        jScrollPane3.setViewportView(InsideDrinks);

        javax.swing.GroupLayout DrinksPanelLayout = new javax.swing.GroupLayout(DrinksPanel);
        DrinksPanel.setLayout(DrinksPanelLayout);
        DrinksPanelLayout.setHorizontalGroup(
            DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        DrinksPanelLayout.setVerticalGroup(
            DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        MiddlePanel.add(DrinksPanel, "card3");

        DessertPanel.setBackground(new java.awt.Color(234, 198, 167));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        InsideDessert.setBackground(new java.awt.Color(255, 255, 255));
        InsideDessert.setAlignmentX(10.0F);
        InsideDessert.setAlignmentY(10.0F);
        InsideDessert.setLayout(new java.awt.GridLayout(0, 3, 5, 5));
        jScrollPane4.setViewportView(InsideDessert);

        javax.swing.GroupLayout DessertPanelLayout = new javax.swing.GroupLayout(DessertPanel);
        DessertPanel.setLayout(DessertPanelLayout);
        DessertPanelLayout.setHorizontalGroup(
            DessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DessertPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        DessertPanelLayout.setVerticalGroup(
            DessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DessertPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        MiddlePanel.add(DessertPanel, "card2");

        getContentPane().add(MiddlePanel, java.awt.BorderLayout.CENTER);

        BottomPanel.setBackground(new java.awt.Color(234, 198, 167));
        BottomPanel.setPreferredSize(new java.awt.Dimension(1029, 35));
        BottomPanel.setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(234, 198, 167));

        btnMenu.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        btnMenu.setText("Menu List");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(956, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(50, 50, 50))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnMenu)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        BottomPanel.add(jPanel5, "card3");

        getContentPane().add(BottomPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addItemToStockPanel(lib.food item, int quantity) {
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MiddlePanel.removeAll();
        MiddlePanel.add(DrinksPanel);
        MiddlePanel.repaint();
        MiddlePanel.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MiddlePanel.removeAll();
        MiddlePanel.add(DessertPanel);
        MiddlePanel.repaint();
        MiddlePanel.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MiddlePanel.removeAll();
        MiddlePanel.add(MainCoursePanel);
        MiddlePanel.repaint();
        MiddlePanel.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MiddlePanel.removeAll();
        MiddlePanel.add(QueuePanel);
        MiddlePanel.repaint();
        MiddlePanel.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuListFrame panel = new MenuListFrame();
        panel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed
    
    private void loadMenu(JPanel targetPanel, String filename) {
    List<food> menuItems = ReadFile.readMenuItems(filename); 
    targetPanel.removeAll();
    for (food item : menuItems) {
        MenuItemPanel itemPanel = new MenuItemPanel(item, null); 
        targetPanel.add(itemPanel);
    }
    targetPanel.revalidate(); 
    targetPanel.repaint();    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainDisplay().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel DessertPanel;
    private javax.swing.JPanel DrinksPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JPanel InsideDessert;
    private javax.swing.JPanel InsideDrinks;
    private javax.swing.JPanel InsideMaincourse;
    private javax.swing.JPanel MainCoursePanel;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JPanel QueuePanel;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
}
