package GUI;
import lib.*;
import Menu.*;
import lib.*;
import GUI.MenuItemPanel;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.*;
import java.awt.event.*;


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
    private shopcenter shop = new shopcenter();
    
    /**
     * Creates new form MainFrame
     */
    public MainDisplay() {
        initComponents();
        try {
            loadFoods();
            
            /*this.shop.loadMenuDataFromText();
            
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // โค้ดในส่วนนี้จะถูกเรียกเมื่อ JVM กำลังจะปิดตัวลง
            shop.saveMenuDataToText();
            System.out.println("Shutdown Hook: Data saved successfully before exit.");
            }));
            
            
            
            displayExistingMenu();
            
            this.addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent e) {
            System.out.print("Saving data and closing program.");
            dispose();
            System.exit(0);
            }
            });*/
        } catch (InvalidOperationException e) {
            JOptionPane.showMessageDialog(this, "Error loading foods: " + e.getMessage(), "Load Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    /*private void displayExistingMenu() {
        InsideInputPanel.removeAll();
        
        for(food item : shop.getAllmenu()) {
            MenuItemPanel itemGUI = new MenuItemPanel(item);
            InsideInputPanel.add(itemGUI);
            
            //InsideInputPanel.revalidate();
            //InsideInputPanel.repaint();
        }
    }*/

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
        FoodDetailPanel = new javax.swing.JPanel();
        TypePanel = new javax.swing.JPanel();
        TypeLabel = new javax.swing.JLabel();
        TypeComboPanel = new javax.swing.JPanel();
        SelectBox = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        IDPanel = new javax.swing.JPanel();
        IDLabel = new javax.swing.JLabel();
        IDtxtPanel = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        NamePanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        NametxtPanel = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        PricePanel = new javax.swing.JPanel();
        PriceLabel = new javax.swing.JLabel();
        PricetxtPanel = new javax.swing.JPanel();
        txtPrice = new javax.swing.JTextField();
        BahtPanel = new javax.swing.JPanel();
        BahtLabel = new javax.swing.JLabel();
        ImagePanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        ImagetxtPanel = new javax.swing.JPanel();
        txtImage = new javax.swing.JTextField();
        ImportPanel = new javax.swing.JPanel();
        btnImport = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        ChoosePanel = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        btnADD = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        InputPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        InsideInputPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        BottomPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
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
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
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
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane5.setViewportView(jTable1);

        jPanel9.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout QueuePanelLayout = new javax.swing.GroupLayout(QueuePanel);
        QueuePanel.setLayout(QueuePanelLayout);
        QueuePanelLayout.setHorizontalGroup(
            QueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QueuePanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        QueuePanelLayout.setVerticalGroup(
            QueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueuePanelLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        MiddlePanel.add(QueuePanel, "card5");

        MainCoursePanel.setBackground(new java.awt.Color(234, 198, 167));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        InsideMaincourse.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout InsideMaincourseLayout = new javax.swing.GroupLayout(InsideMaincourse);
        InsideMaincourse.setLayout(InsideMaincourseLayout);
        InsideMaincourseLayout.setHorizontalGroup(
            InsideMaincourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );
        InsideMaincourseLayout.setVerticalGroup(
            InsideMaincourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(InsideMaincourse);

        javax.swing.GroupLayout MainCoursePanelLayout = new javax.swing.GroupLayout(MainCoursePanel);
        MainCoursePanel.setLayout(MainCoursePanelLayout);
        MainCoursePanelLayout.setHorizontalGroup(
            MainCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainCoursePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        MainCoursePanelLayout.setVerticalGroup(
            MainCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainCoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );

        MiddlePanel.add(MainCoursePanel, "card4");

        DrinksPanel.setBackground(new java.awt.Color(238, 198, 167));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        InsideDrinks.setBackground(new java.awt.Color(255, 255, 255));
        InsideDrinks.setAlignmentX(10.0F);
        InsideDrinks.setAlignmentY(10.0F);

        javax.swing.GroupLayout InsideDrinksLayout = new javax.swing.GroupLayout(InsideDrinks);
        InsideDrinks.setLayout(InsideDrinksLayout);
        InsideDrinksLayout.setHorizontalGroup(
            InsideDrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );
        InsideDrinksLayout.setVerticalGroup(
            InsideDrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(InsideDrinks);

        javax.swing.GroupLayout DrinksPanelLayout = new javax.swing.GroupLayout(DrinksPanel);
        DrinksPanel.setLayout(DrinksPanelLayout);
        DrinksPanelLayout.setHorizontalGroup(
            DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        DrinksPanelLayout.setVerticalGroup(
            DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );

        MiddlePanel.add(DrinksPanel, "card3");

        DessertPanel.setBackground(new java.awt.Color(234, 198, 167));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        InsideDessert.setBackground(new java.awt.Color(255, 255, 255));
        InsideDessert.setAlignmentX(10.0F);
        InsideDessert.setAlignmentY(10.0F);

        javax.swing.GroupLayout InsideDessertLayout = new javax.swing.GroupLayout(InsideDessert);
        InsideDessert.setLayout(InsideDessertLayout);
        InsideDessertLayout.setHorizontalGroup(
            InsideDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );
        InsideDessertLayout.setVerticalGroup(
            InsideDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(InsideDessert);

        javax.swing.GroupLayout DessertPanelLayout = new javax.swing.GroupLayout(DessertPanel);
        DessertPanel.setLayout(DessertPanelLayout);
        DessertPanelLayout.setHorizontalGroup(
            DessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DessertPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        DessertPanelLayout.setVerticalGroup(
            DessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DessertPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );

        MiddlePanel.add(DessertPanel, "card2");

        FoodDetailPanel.setBackground(new java.awt.Color(204, 255, 255));
        FoodDetailPanel.setLayout(new java.awt.GridLayout(6, 3));

        TypePanel.setBackground(new java.awt.Color(255, 255, 255));

        TypeLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        TypeLabel.setText("Type:");

        javax.swing.GroupLayout TypePanelLayout = new javax.swing.GroupLayout(TypePanel);
        TypePanel.setLayout(TypePanelLayout);
        TypePanelLayout.setHorizontalGroup(
            TypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TypePanelLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TypePanelLayout.setVerticalGroup(
            TypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TypeLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        FoodDetailPanel.add(TypePanel);

        TypeComboPanel.setBackground(new java.awt.Color(255, 255, 255));

        SelectBox.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        SelectBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Maincourse", "Drinks", "Dessert" }));
        SelectBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TypeComboPanelLayout = new javax.swing.GroupLayout(TypeComboPanel);
        TypeComboPanel.setLayout(TypeComboPanelLayout);
        TypeComboPanelLayout.setHorizontalGroup(
            TypeComboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeComboPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SelectBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        TypeComboPanelLayout.setVerticalGroup(
            TypeComboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TypeComboPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(SelectBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        FoodDetailPanel.add(TypeComboPanel);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        FoodDetailPanel.add(jPanel14);

        IDPanel.setBackground(new java.awt.Color(255, 255, 255));

        IDLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        IDLabel.setText("ID:");

        javax.swing.GroupLayout IDPanelLayout = new javax.swing.GroupLayout(IDPanel);
        IDPanel.setLayout(IDPanelLayout);
        IDPanelLayout.setHorizontalGroup(
            IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDPanelLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        IDPanelLayout.setVerticalGroup(
            IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(IDLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        FoodDetailPanel.add(IDPanel);

        IDtxtPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtID.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        javax.swing.GroupLayout IDtxtPanelLayout = new javax.swing.GroupLayout(IDtxtPanel);
        IDtxtPanel.setLayout(IDtxtPanelLayout);
        IDtxtPanelLayout.setHorizontalGroup(
            IDtxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDtxtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
        IDtxtPanelLayout.setVerticalGroup(
            IDtxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDtxtPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        FoodDetailPanel.add(IDtxtPanel);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        FoodDetailPanel.add(jPanel23);

        NamePanel.setBackground(new java.awt.Color(255, 255, 255));

        NameLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        NameLabel.setText("Name:");

        javax.swing.GroupLayout NamePanelLayout = new javax.swing.GroupLayout(NamePanel);
        NamePanel.setLayout(NamePanelLayout);
        NamePanelLayout.setHorizontalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NamePanelLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NamePanelLayout.setVerticalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(NameLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        FoodDetailPanel.add(NamePanel);

        NametxtPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtName.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        javax.swing.GroupLayout NametxtPanelLayout = new javax.swing.GroupLayout(NametxtPanel);
        NametxtPanel.setLayout(NametxtPanelLayout);
        NametxtPanelLayout.setHorizontalGroup(
            NametxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NametxtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
        NametxtPanelLayout.setVerticalGroup(
            NametxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NametxtPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        FoodDetailPanel.add(NametxtPanel);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        FoodDetailPanel.add(jPanel29);

        PricePanel.setBackground(new java.awt.Color(255, 255, 255));

        PriceLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        PriceLabel.setText("Price:");

        javax.swing.GroupLayout PricePanelLayout = new javax.swing.GroupLayout(PricePanel);
        PricePanel.setLayout(PricePanelLayout);
        PricePanelLayout.setHorizontalGroup(
            PricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PricePanelLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PricePanelLayout.setVerticalGroup(
            PricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PricePanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(PriceLabel)
                .addGap(26, 26, 26))
        );

        FoodDetailPanel.add(PricePanel);

        PricetxtPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtPrice.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        javax.swing.GroupLayout PricetxtPanelLayout = new javax.swing.GroupLayout(PricetxtPanel);
        PricetxtPanel.setLayout(PricetxtPanelLayout);
        PricetxtPanelLayout.setHorizontalGroup(
            PricetxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PricetxtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
        PricetxtPanelLayout.setVerticalGroup(
            PricetxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PricetxtPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        FoodDetailPanel.add(PricetxtPanel);

        BahtPanel.setBackground(new java.awt.Color(255, 255, 255));

        BahtLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        BahtLabel.setText("Baht");

        javax.swing.GroupLayout BahtPanelLayout = new javax.swing.GroupLayout(BahtPanel);
        BahtPanel.setLayout(BahtPanelLayout);
        BahtPanelLayout.setHorizontalGroup(
            BahtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BahtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BahtLabel)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        BahtPanelLayout.setVerticalGroup(
            BahtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BahtPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(BahtLabel)
                .addGap(25, 25, 25))
        );

        FoodDetailPanel.add(BahtPanel);

        ImagePanel.setBackground(new java.awt.Color(255, 255, 255));

        ImageLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        ImageLabel.setText("Image:");

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagePanelLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagePanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(ImageLabel)
                .addGap(25, 25, 25))
        );

        FoodDetailPanel.add(ImagePanel);

        ImagetxtPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtImage.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        javax.swing.GroupLayout ImagetxtPanelLayout = new javax.swing.GroupLayout(ImagetxtPanel);
        ImagetxtPanel.setLayout(ImagetxtPanelLayout);
        ImagetxtPanelLayout.setHorizontalGroup(
            ImagetxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagetxtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtImage, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
        ImagetxtPanelLayout.setVerticalGroup(
            ImagetxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagetxtPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        FoodDetailPanel.add(ImagetxtPanel);

        ImportPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnImport.setBackground(new java.awt.Color(234, 198, 167));
        btnImport.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ImportPanelLayout = new javax.swing.GroupLayout(ImportPanel);
        ImportPanel.setLayout(ImportPanelLayout);
        ImportPanelLayout.setHorizontalGroup(
            ImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImport)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        ImportPanelLayout.setVerticalGroup(
            ImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImportPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(btnImport)
                .addGap(21, 21, 21))
        );

        FoodDetailPanel.add(ImportPanel);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        FoodDetailPanel.add(jPanel37);

        ChoosePanel.setBackground(new java.awt.Color(255, 255, 255));
        ChoosePanel.setLayout(new java.awt.GridLayout(1, 0));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        btnCancel.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(204, 0, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ChoosePanel.add(jPanel41);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        btnADD.setBackground(new java.awt.Color(110, 186, 140));
        btnADD.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        btnADD.setForeground(new java.awt.Color(255, 255, 255));
        btnADD.setText("ADD");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnADD)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ChoosePanel.add(jPanel40);

        FoodDetailPanel.add(ChoosePanel);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        FoodDetailPanel.add(jPanel39);

        MiddlePanel.add(FoodDetailPanel, "card7");

        InputPanel.setBackground(new java.awt.Color(234, 198, 167));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        InsideInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        InsideInputPanel.setLayout(new java.awt.GridLayout(1, 4));

        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(110, 186, 140));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, java.awt.BorderLayout.CENTER);

        InsideInputPanel.add(jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        InsideInputPanel.add(jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        InsideInputPanel.add(jPanel8);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        InsideInputPanel.add(jPanel10);

        jScrollPane6.setViewportView(InsideInputPanel);

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );

        MiddlePanel.add(InputPanel, "card4");

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
                .addContainerGap(879, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(50, 50, 50))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BottomPanel.add(jPanel5, "card3");

        getContentPane().add(BottomPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        MiddlePanel.removeAll();
        MiddlePanel.add(InputPanel);
        MiddlePanel.repaint();
        MiddlePanel.revalidate();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        try { 
            Object selectedObject = SelectBox.getSelectedItem();
            String Id = txtID.getText();
            String Name = txtName.getText();
            String priceText = txtPrice.getText();
            
            if(selectedObject == null || Id.isEmpty() || Name.isEmpty() || priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input all informations", "Incorrect", JOptionPane.ERROR_MESSAGE);
            return;
        }
            String type = selectedObject.toString();
            
            double price = Double.parseDouble(txtPrice.getText());
            String imagePath = txtImage.getText();

            shop.Createmenu(type, Id, Name, price, imagePath);
            lib.Food lastedFood = shop.getAllmenu().get(shop.getAllmenu().size() - 1);
            
            MenuItemPanel itemGUI = new MenuItemPanel(lastedFood);
            jPanel6.add(itemGUI); // Add item to Grid Panel
            
            SelectBox.setSelectedIndex(0);
            txtID.setText("");
            txtName.setText("");
            txtPrice.setText("");
            txtImage.setText("");
            
            InsideInputPanel.revalidate();
            
            jScrollPane6.revalidate();
            jScrollPane6.repaint();
            
            InsideInputPanel.repaint();

            //shop.saveMenuDataToText();
            
        } catch (NumberFormatException e) {
            // ดักจับเมื่อผู้ใช้ใส่ตัวอักษรในช่องราคา
            JOptionPane.showMessageDialog(this, "Price must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            logger.log(java.util.logging.Level.WARNING, "Invalid price input", e);
        } catch (InvalidOperationException e) {
            // ดักจับ Exception จากคลาส shopcenter
            JOptionPane.showMessageDialog(this, e.getMessage(), "Operation Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // ดักจับ Exception อื่นๆ
            JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            logger.log(java.util.logging.Level.SEVERE, "Unexpected error in ADD button", e);
        }
    }//GEN-LAST:event_btnADDActionPerformed

    private void SelectBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBoxActionPerformed
        
    }//GEN-LAST:event_SelectBoxActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Images (JPG, PNG, GIF)", "jpg", "png", "gif"));
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            java.io.File selectedFile = fileChooser.getSelectedFile();
            txtImage.setText(selectedFile.getAbsolutePath());
        } else {
            txtImage.setText(""); 
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MiddlePanel.removeAll();
        MiddlePanel.add(FoodDetailPanel);
        MiddlePanel.repaint();
        MiddlePanel.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JLabel BahtLabel;
    private javax.swing.JPanel BahtPanel;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel ChoosePanel;
    private javax.swing.JPanel DessertPanel;
    private javax.swing.JPanel DrinksPanel;
    private javax.swing.JPanel FoodDetailPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JPanel IDPanel;
    private javax.swing.JPanel IDtxtPanel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JPanel ImagetxtPanel;
    private javax.swing.JPanel ImportPanel;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JPanel InsideDessert;
    private javax.swing.JPanel InsideDrinks;
    private javax.swing.JPanel InsideInputPanel;
    private javax.swing.JPanel InsideMaincourse;
    private javax.swing.JPanel MainCoursePanel;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JPanel NametxtPanel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JPanel PricePanel;
    private javax.swing.JPanel PricetxtPanel;
    private javax.swing.JPanel QueuePanel;
    private javax.swing.JComboBox<String> SelectBox;
    private javax.swing.JPanel TypeComboPanel;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JPanel TypePanel;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void loadFoods() throws InvalidOperationException {
        InsideInputPanel.setLayout(new java.awt.GridLayout(0, 4, 10, 10)); 
        java.util.List<Food> foods = FileService.loadFoods();

        for (Food f : foods) {
            MenuItemPanel itemPanel = new MenuItemPanel(f);
            InsideInputPanel.add(itemPanel);
        }

        InsideInputPanel.revalidate();
        InsideInputPanel.repaint();
    }
}
