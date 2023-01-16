/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MyWallet.Views;

import com.MyWallet.Controller.BinarySearch;
import com.MyWallet.Controller.SelectionSort;
import com.MyWallet.Models.Customer;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sitaram Thing
 */
public final class HomePage extends javax.swing.JFrame {

    // validation key
    private static int keyValue;
    // initinal the global variable for accounting transactions
    private static int id;
    private static String name;
    private static String address;
    private static String phone;
    private static float amount;
    private static String date;
    private static String status;
    private static String acTypes;
    private static int trnasaction; 
    // sorting radio button
    private static String sortingBy; 
    // press the table and set the values
    private static int pressValue; 
    // text fields values count
    private static int phoneNumLength; 
    // list of the variable declare
    private static int tableSize;
    private static int[] Ids;
    private static String[] names;
    private static String[] addresses;
    private static String[] phones;
    private static float[] amounts;
    private static String[] dates;
    private static String[] statuses;
    private static String[] actypeses;
    private static int[] transactions;
    
    // declare the arraylist and create an object of the acconutn class 
    ArrayList<Customer> listOfCustomer = new ArrayList<>();
    Customer customer;
    DefaultTableModel table_datiels; // default table 
    
    // this is the constructr
    public HomePage() {
        initComponents();
        sysDate(); // sysDate field in opening date
        setInitialdata(); // call the set default data 
        setTableDataToList();// firstable add the tables value in arraylist
        table_datiels = (DefaultTableModel) jTableAC.getModel();
        for(Customer customerDetail : listOfCustomer){
            // the customer class's data and DefaultTableModel table's data are insert in the table
            addTableNewData(customerDetail,table_datiels);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_sorting = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_general_details = new javax.swing.JPanel();
        jTextField_Name = new javax.swing.JTextField();
        jCboBox_Status = new javax.swing.JComboBox<>();
        jTextField_openDate = new javax.swing.JTextField();
        jTextField_Amount = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jBtn_Add = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();
        jCBbox_accoutnTypes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBtn_next = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_Update = new javax.swing.JButton();
        jTextField_Address = new javax.swing.JTextField();
        btn_Delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jBtn_edit = new javax.swing.JButton();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_MeaasgeDisplay = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioBtn_Descending = new javax.swing.JRadioButton();
        jComboBox_SortingOption = new javax.swing.JComboBox<>();
        jTextField_SortingMessage = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jRadioBtn_Ascending = new javax.swing.JRadioButton();
        jTextField_SearchValues = new javax.swing.JTextField();
        jComboBox_searching = new javax.swing.JComboBox<>();
        jButton_logout = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAC = new javax.swing.JTable();
        jTextField_Searching = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_general_details.setBackground(new java.awt.Color(204, 204, 255));

        jTextField_Name.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_Name.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_NameKeyPressed(evt);
            }
        });

        jCboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        jCboBox_Status.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextField_openDate.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_openDate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jTextField_openDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_openDateKeyPressed(evt);
            }
        });

        jTextField_Amount.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_Amount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jTextField_Amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_AmountKeyPressed(evt);
            }
        });

        jTextField_Phone.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_Phone.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyPressed(evt);
            }
        });

        jBtn_Add.setText("Add");
        jBtn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AddActionPerformed(evt);
            }
        });

        jButton_clear.setText("Clear");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        jCBbox_accoutnTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving  Account", "Current Account" }));
        jCBbox_accoutnTypes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Address ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Account Id");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Holder Name ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Opeaning Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Account Types");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Phone No");

        jBtn_next.setText("Next");
        jBtn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_nextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Amounts");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Status");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Pictures\\use walllet.png")); // NOI18N

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        jTextField_Address.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_Address.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField_Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_AddressKeyPressed(evt);
            }
        });

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Message Box");

        jBtn_edit.setText("Edit");
        jBtn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_editActionPerformed(evt);
            }
        });

        jTextField_Id.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_Id.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jTextField_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_IdKeyPressed(evt);
            }
        });

        jTextField_MeaasgeDisplay.setEditable(false);
        jTextField_MeaasgeDisplay.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextField_MeaasgeDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_MeaasgeDisplay.setText("Add the General Details ");

        javax.swing.GroupLayout jPanel_general_detailsLayout = new javax.swing.GroupLayout(jPanel_general_details);
        jPanel_general_details.setLayout(jPanel_general_detailsLayout);
        jPanel_general_detailsLayout.setHorizontalGroup(
            jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_general_detailsLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_general_detailsLayout.createSequentialGroup()
                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_general_detailsLayout.createSequentialGroup()
                                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                                .addComponent(jTextField_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72))
                                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                                .addComponent(jBtn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_Update)
                                                .addGap(43, 43, 43)))
                                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCBbox_accoutnTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_openDate, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_Delete)
                                                .addGap(63, 63, 63)
                                                .addComponent(jButton_clear))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_general_detailsLayout.createSequentialGroup()
                                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jCboBox_Status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_general_detailsLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_general_detailsLayout.createSequentialGroup()
                                        .addComponent(jBtn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133))))
                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_MeaasgeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn_next, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(136, 136, 136))))))
        );
        jPanel_general_detailsLayout.setVerticalGroup(
            jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jBtn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_MeaasgeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_general_detailsLayout.createSequentialGroup()
                                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_openDate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCBbox_accoutnTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_general_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_general_detailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        jTabbedPane1.addTab("Account General Details", jPanel_general_details);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        buttonGroup_sorting.add(jRadioBtn_Descending);
        jRadioBtn_Descending.setText("Descending");
        jRadioBtn_Descending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioBtn_DescendingMouseClicked(evt);
            }
        });

        jComboBox_SortingOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Amount" }));
        jComboBox_SortingOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SortingOptionActionPerformed(evt);
            }
        });

        jTextField_SortingMessage.setEditable(false);
        jTextField_SortingMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_SortingMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_SortingMessage.setText("Data Sorting ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" Data Sorting by:");

        buttonGroup_sorting.add(jRadioBtn_Ascending);
        jRadioBtn_Ascending.setText("Ascending");
        jRadioBtn_Ascending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioBtn_AscendingMouseClicked(evt);
            }
        });

        jTextField_SearchValues.setEditable(false);
        jTextField_SearchValues.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_SearchValues.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_SearchValues.setText("Data Searching");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextField_SearchValues, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioBtn_Ascending)
                                    .addGap(47, 47, 47)
                                    .addComponent(jRadioBtn_Descending))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_SortingOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_SortingMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField_SortingMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBtn_Descending)
                    .addComponent(jRadioBtn_Ascending))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_SortingOption, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jTextField_SearchValues, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jComboBox_searching.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_searching.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name", "Status", "Types" }));
        jComboBox_searching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_searchingActionPerformed(evt);
            }
        });

        jButton_logout.setText("Logout");
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed(evt);
            }
        });

        jTableAC.setBackground(new java.awt.Color(204, 204, 204));
        jTableAC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jTableAC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account ID", "Holder Name", "Address", "Phone no.", "Amounts", "Open Date", "Status", "A/c Type", "Transaction"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAC.setFillsViewportHeight(true);
        jTableAC.setGridColor(new java.awt.Color(51, 51, 255));
        jTableAC.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTableAC.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableAC.setShowGrid(false);
        jTableAC.setSurrendersFocusOnKeystroke(true);
        jTableAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableACMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAC);

        jTextField_Searching.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Enter data");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Search by account:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("If you want to Sorting and Searchig anything");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("The databases table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_logout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Searching, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_searching, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(360, 360, 360)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Searching, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_searching, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(jButton_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1264, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Transaction Detalis", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // initial values set the DefaultTableModel table
    public void addTableNewData(Customer customer, DefaultTableModel table_datiels){
        table_datiels.addRow(new Object[]{customer.getId(),customer.getName(),customer.getAddress(),customer.getPhone(),customer.getAmount(),customer.getDate(),customer.getStatus(),customer.getAcTypes(),customer.getTransaction()});
    }
    
    // get the current date
    public void sysDate(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormate = new SimpleDateFormat("dd-MM-yyyy");
        String sysDate= simpleDateFormate.format(date);
        jTextField_openDate.setText(sysDate);
    }
    
    // initial data in addNewData method
    public void setInitialdata(){
        addNewData(4050,"Hari","Kathmandu","9816340351",12000,"12-03-2020","Inactive","Saving",1);
        addNewData(1050,"Ram","Pokhara","9812740357",13500,"12-05-2021","Active","Fixed Deposit",0);
        addNewData(2050,"Sita","Nepalgunj","9818340350",15000,"10-03-2022","Inactive","Current",1);
        addNewData(5050,"Jon Son","Dharan","9812340313",17000,"28-12-2020","Active","Saving",0);
        addNewData(3050,"Marry","Hetauda","9812340313",16000,"21-09-2020","Active","Current",1);
    }
    
    // add a new data in default table 
    public void addNewData(int id, String name, String address, String phone, float amount, String date, String status, String acTypes, int transaction){
        customer = new Customer(); // 
        customer.setId(id);
        customer.setName(name);
        customer.setAddress(address);
        customer.setPhone(phone);
        customer.setAmount(amount);
        customer.setDate(date);
        customer.setStatus(status);
        customer.setAcTypes(acTypes); 
        customer.setTransaction(transaction);
        
        // add the all values of 
        listOfCustomer.add(customer);
    }
            
    // netx botton which is press to go next panal
    private void jBtn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_nextActionPerformed
        jTabbedPane1.setSelectedIndex(1); // go to first panel
    }//GEN-LAST:event_jBtn_nextActionPerformed

    // clear botton
    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        // check the fields are empty or not
        if(jTextField_Id.getText().isEmpty()&& jTextField_Name.getText().isEmpty()&& jTextField_Address.getText().isEmpty()&&jTextField_Phone.getText().isEmpty()&&jTextField_Amount.getText().isEmpty()&&jTextField_openDate.getText().isEmpty()){
            // show message dailog box
            jTextField_MeaasgeDisplay.setText("The fields are already empty !");
            jTextField_MeaasgeDisplay.setForeground(Color.RED);
        }else{
            // when the user click the user then the input textfield are clear
            textFieldClear();
            jTextField_MeaasgeDisplay.setText("The text fields is successfully clear.");
        }
    }//GEN-LAST:event_jButton_clearActionPerformed

    // add botton which is add the general details of cutsomer
    private void jBtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AddActionPerformed
        // usring the try catch and textfields values are git
        try{
            if(jTextField_Id.getText().isEmpty()|| jTextField_Name.getText().isEmpty()||jTextField_Address.getText().isEmpty()||jTextField_Phone.getText().isEmpty()||jTextField_Amount.getText().isEmpty()||jTextField_openDate.getText().isEmpty()){
                // show message dailog for empty fields
                jTextField_MeaasgeDisplay.setText("The fields are already empty !");
            }else{
                // call the receivedData methods
                receivedData();
                // check the duplicate values for array list and input id
                if (!isDuplicateId(id)) {
                    String phoneNumber = jTextField_Phone.getText(); // get the phone number from textFields and check the start values is valid ot not valid
                    if (phoneNumber.startsWith("98") || phoneNumber.startsWith("97")) {
                    
                        // check the dublicate phone number
                        if (!isDuplicatePhone(phone)) {
                            //check the date formate
                            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}"; // the date formate example:- 12-02-2022
                            if (date.matches(datePattern)) {

                                // object call the DefaultTableModel and get teh data in textFields then data inset in the table
                                table_datiels = (DefaultTableModel) jTableAC.getModel();
                                table_datiels.addRow(new Object[]{id,name,address,phone,amount,date,status,acTypes,trnasaction});

                                // call the account call and uset the object
                                customer.setId(id);
                                customer.setName(name);
                                customer.setAddress(address);
                                customer.setPhone(phone);
                                customer.setAmount(amount);
                                customer.setDate(date);
                                customer.setStatus(status);
                                customer.setAcTypes(acTypes);
                                customer.setTransaction(trnasaction);

                                // add teh all textfields values are add in array list
                                listOfCustomer.add(customer);

                                // message dialog show the successfuly added
                                JOptionPane.showMessageDialog(rootPane, "Account details are successfully added.");
                                jTabbedPane1.setSelectedIndex(1); // go to data store fields
                            }else{
                                jTextField_MeaasgeDisplay.setText("Please enter the DD-MM_YYYY");
                            }
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "This account's number has been already exists!");
                        }
                    } else {
                        jTextField_MeaasgeDisplay.setText(phoneNumber+" is not valid phone number.");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "The account's id  has been already exists!");
                }
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,"Enter the valid input.");
        }
    }//GEN-LAST:event_jBtn_AddActionPerformed

   // phone only valid integer
    private void jTextField_PhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyPressed
        // using the try catch methods and control the exception
        try{
            // balck color set in writing_show_textField
            jTextField_Phone.setEditable(true);
            jTextField_MeaasgeDisplay.setForeground(Color.BLACK);  
            jTextField_Phone.setForeground(Color.BLACK);
            // generated the key code
            keyValue = evt.getKeyCode();
            String phoneNum = jTextField_Phone.getText(); // get the phone number from textFields 
            int numCount = jTextField_Phone.getText().length(); // count the phonu number
            // when press the alphabet then ignor so key code is number (48-57) and backspace(8) 
            if ((keyValue >= 48 && 57 >= keyValue || keyValue==8 || keyValue==37 ||keyValue==39)) {
                int lengthOfPhoneNum;
                // the phone number is valud after backspace then color is blaxk
                if (keyValue==8 && numCount<10) {
                    jTextField_MeaasgeDisplay.setForeground(Color.black);
                    jTextField_Phone.setForeground(Color.black);
                }
                // text fields are valid on 10 digits
                if(numCount<10){
                    jTextField_Phone.setEditable(true);
                    lengthOfPhoneNum = numCount+1;
                    if (phoneNum.startsWith("98") || phoneNum.startsWith("97")) {
                        jTextField_MeaasgeDisplay.setText("Phone number is valid. total digits is: "+lengthOfPhoneNum);
                    }else{
                        jTextField_MeaasgeDisplay.setText("Invalid to phone no! Please start to 98 or 97");
                        jTextField_MeaasgeDisplay.setForeground(Color.RED);
                        jTextField_Phone.setForeground(Color.RED);
                    } 
                }else{
                    // jTextField_Phone.setEditable(false);
                    jTextField_MeaasgeDisplay.setForeground(Color.RED);
                    jTextField_Phone.setForeground(Color.RED);
                    jTextField_MeaasgeDisplay.setText("Phone number is only 10 digits allowed!");
                }
            // check the enter code valication
            }else if(evt.getKeyCode()==evt.VK_ENTER){
                jTextField_openDate.requestFocusInWindow(); // call the next textFields 
                jTextField_MeaasgeDisplay.setText("Enter the Date : DD/MM/YYYY");
            }else{
                jTextField_MeaasgeDisplay.setText("Enter the valid number!");
                jTextField_MeaasgeDisplay.setForeground(Color.RED);
                jTextField_Phone.setText("");
            }
        }catch(Exception ex){
            jTextField_MeaasgeDisplay.setText("String is not exits.");
            jTextField_MeaasgeDisplay.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jTextField_PhoneKeyPressed

   // amount only valid integer and check for key code
    private void jTextField_AmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AmountKeyPressed
        try{
            // (evt, "Amoubnt")
            jTextField_MeaasgeDisplay.setForeground(Color.BLACK);
            keyValue = evt.getKeyCode();
            // when press the alphabet then igneor desemal point 110 backspace 8
            if ((keyValue >= 48 && 57 >= keyValue || keyValue==8 || keyValue==37 ||keyValue==39)) {
                jTextField_Amount.setEditable(true);
                jTextField_MeaasgeDisplay.setForeground(Color.black);
                jTextField_MeaasgeDisplay.setText("Amount is valided.");
            }else if(evt.getKeyCode()==evt.VK_ENTER){
                jTextField_Name.requestFocusInWindow(); // call the next textFields 
                jTextField_MeaasgeDisplay.setText("Enter your name");
            }else{
                jTextField_MeaasgeDisplay.setText("Amount is invalid! please enter the integer values.");
                jTextField_MeaasgeDisplay.setForeground(Color.RED);
                jTextField_Amount.setText("");
            }
        }catch(Exception ex){            
            jTextField_MeaasgeDisplay.setForeground(Color.RED);
            jTextField_MeaasgeDisplay.setText("Amount is invalid! please enter the integer values.");
        } 
    }//GEN-LAST:event_jTextField_AmountKeyPressed

    // user name only valid String
    private void jTextField_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NameKeyPressed
        jTextField_MeaasgeDisplay.setForeground(Color.BLACK);
        keyValue = evt.getKeyCode();
        // when press the integer then ignore and alphabet 65-90, space 32, shift 16 backspace 8 left and right arrow
        if (keyValue >= 65 && 90 >= keyValue || keyValue==32 || keyValue==16 || keyValue==8 || keyValue==37 ||keyValue==39) {
            jTextField_Name.setEditable(true);
            //String nameVaues = jTextField_Name.getText();
            jTextField_MeaasgeDisplay.setText("Name is valid.");
        // press the enter key then go to next textFields diaplay message
        }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jTextField_Phone.requestFocusInWindow(); // call the next textFields 
            jTextField_MeaasgeDisplay.setText("Enter your Phone number");
        }else{
            jTextField_MeaasgeDisplay.setText("Name is invalid! Please enter the valid String data");
            jTextField_MeaasgeDisplay.setForeground(Color.RED);
            jTextField_Name.setText("");
        }
    }//GEN-LAST:event_jTextField_NameKeyPressed

    // select the values the go to input text fields 
    private void jTableACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableACMouseClicked
        jTextField_MeaasgeDisplay.setEditable(false);
        jTextField_Id.setEditable(false);
        int currentRow = jTableAC.getSelectedRow(); // get the current press row's values
        jTextField_MeaasgeDisplay.setText("The Account ID is not updated !");
        try{
            // when key press the table then row's values are show the textfields
            jTextField_Id.setText(jTableAC.getValueAt(currentRow, 0).toString());
            jTextField_Name.setText(jTableAC.getValueAt(currentRow, 1).toString());
            jTextField_Address.setText(jTableAC.getValueAt(currentRow, 2).toString());
            jTextField_Phone.setText(jTableAC.getValueAt(currentRow, 3).toString());
            jTextField_Amount.setText(jTableAC.getValueAt(currentRow, 4).toString());
            jTextField_openDate.setText(jTableAC.getValueAt(currentRow, 5).toString());
            
            // jTabbedPane1 is visible and pressValues is 1
            jTabbedPane1.setSelectedIndex(0);
            pressValue = 1; // initialize the values
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Please select the available data !");
        }
    }//GEN-LAST:event_jTableACMouseClicked

    // log out botton
    private void jButton_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logoutActionPerformed
        //JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to log out?");
        int input = JOptionPane.showConfirmDialog(null, "Are you want to sure log out?", "Log out", JOptionPane.YES_NO_OPTION);
        //JOptionPane.PLAIN_MESSAGE);
        switch (input) {
            case 0:
            System.out.println("Pressed YES");
            dispose();
            break;
            case 1:
            System.out.println("Pressed NO");
            break;
        }
    }//GEN-LAST:event_jButton_logoutActionPerformed

    // comboBox with for sorting with id name and amount
    private void jComboBox_SortingOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SortingOptionActionPerformed
        // using the try catch
        try{
            getArrayData();
            String sortBy = jComboBox_SortingOption.getSelectedItem().toString().toUpperCase(); // upper types convert
            // sorting by ascending ro dessinding
            SelectionSort SortingTable = new SelectionSort();
            jTextField_SortingMessage.setText("Data Sorting by: "+sortBy);
            jTextField_SortingMessage.setForeground(Color.black);
            // comboBox's values accepts
            int order;
            if (sortingBy.equals("Ascending")) { order = 0; 
            }else{ order = 1;}
            
            // used to switch statement by find the sorting options
            switch (sortBy) {
                case "NAME":
                // selection sort by Name
                SortingTable.selectionSortByName(Ids,names,addresses,phones,amounts,dates,statuses,actypeses,transactions,order);
                break;
                
                default:
                // selection sort by balance
                SortingTable.selectionSortByAmount(Ids,names,addresses,phones,amounts,dates,statuses,actypeses,transactions,order);
                break;
            }
            // the sorting data are set in table
            for(int i = 0; i<tableSize; i++){
                jTableAC.setValueAt(Ids[i], i, 0);
                jTableAC.setValueAt(names[i], i, 1);
                jTableAC.setValueAt(addresses[i], i, 2);
                jTableAC.setValueAt(phones[i], i, 3);
                jTableAC.setValueAt(amounts[i], i, 4);
                jTableAC.setValueAt(dates[i], i, 5);
                jTableAC.setValueAt(statuses[i], i, 6);
                jTableAC.setValueAt(actypeses[i], i, 7);
                jTableAC.setValueAt(transactions[i], i, 8);
            }
        }catch(Exception ex){
            jTextField_SortingMessage.setText("Please choose the radio button !");
            jTextField_SortingMessage.setForeground(Color.red);
        }
    }//GEN-LAST:event_jComboBox_SortingOptionActionPerformed
 
   // radio button desscending
    private void jRadioBtn_DescendingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioBtn_DescendingMouseClicked
        sortingBy = jRadioBtn_Descending.getText();
        jTextField_SortingMessage.setText("Descending");
        jTextField_SortingMessage.setForeground(Color.black);
    }//GEN-LAST:event_jRadioBtn_DescendingMouseClicked

    // update the table
    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // get the fextfields values and set the table
        try{
            int currentRow = jTableAC.getSelectedRow();
            if(jTextField_Id.getText().isEmpty()||jTextField_Name.getText().isEmpty()||jTextField_Address.getText().isEmpty()||jTextField_Phone.getText().isEmpty()||jTextField_Amount.getText().isEmpty()||jTextField_openDate.getText().isEmpty()){
                // show message dailog for empty fields
                jTextField_MeaasgeDisplay.setText("The fields is empty!!");
            }else{
                // get the phone numnern from textFields 
                String totalNum = jTextField_Phone.getText(); 
                phoneNumLength = totalNum.length();
                String phoneNumber = jTextField_Phone.getText(); // get the phone number from textFields and check the start values is valid ot not valid
                if (phoneNumber.startsWith("98") || phoneNumber.startsWith("97")) {
                            
                    // cunt the phone number were it is 10 digit or not
                    if (phoneNumLength < 10) {
                        jTextField_MeaasgeDisplay.setText(phoneNumLength+" digit is invalid number!");
                        jTextField_MeaasgeDisplay.setForeground(Color.RED); // set the font color sre red
                    }else{
                        receivedData(); // call the receivedData which is textFields values are set in initial variables
                        //check the date formate
                        String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}"; // the date formate example:- 12-02-2022
                        if (date.matches(datePattern)) {
                            // set the values in table
                            jTableAC.setValueAt(id, currentRow, 0);
                            jTableAC.setValueAt(name, currentRow, 1);
                            jTableAC.setValueAt(address, currentRow, 2);
                            jTableAC.setValueAt(phone, currentRow, 3);
                            jTableAC.setValueAt(amount, currentRow, 4);
                            jTableAC.setValueAt(date, currentRow, 5);
                            jTableAC.setValueAt(status, currentRow, 6);
                            jTableAC.setValueAt(acTypes, currentRow, 7);
                            jTableAC.setValueAt(trnasaction, currentRow, 8);
                            
                            JOptionPane.showMessageDialog(rootPane, "Customer details is successfully updated");
                            jTabbedPane1.setSelectedIndex(1); // go to data store 
                            // when custeomr press the table then Id is doesn't edit so next time new customer con be update the new data id text fields is editable true
                            jTextField_Id.setEditable(true);
                        }else{
                            jTextField_MeaasgeDisplay.setText(date+" Invlid date (DD-MM-YYYY)");
                            jTextField_MeaasgeDisplay.setForeground(Color.RED); // set the font color sre red
                        }
                    }
                }else {
                    jTextField_MeaasgeDisplay.setText(phoneNumber+" is not valid phone number.");
                }
            }
        }catch(Exception ex){
            jTextField_MeaasgeDisplay.setText( "Customer deatils are not not available in databases.");
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    // radio button Aseccending
    private void jRadioBtn_AscendingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioBtn_AscendingMouseClicked
        sortingBy = jRadioBtn_Ascending.getText();
        jTextField_SortingMessage.setText("Ascending");
        jTextField_SortingMessage.setForeground(Color.black);
    }//GEN-LAST:event_jRadioBtn_AscendingMouseClicked

    // key press in amount
    private void jTextField_AddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AddressKeyPressed
        jTextField_MeaasgeDisplay.setForeground(Color.BLACK);
        keyValue = evt.getKeyCode();
        // when press the integer then igneor
        if ((keyValue >= 65 && 90 >= keyValue || keyValue==8 || keyValue==37 ||keyValue==39)) {
            jTextField_Address.setEditable(true);
            jTextField_MeaasgeDisplay.setText("Address is valid.");
            //JOptionPane.showMessageDialog(rootPane, "Valid input.");
        }else if(evt.getKeyCode()==evt.VK_ENTER){
            jTextField_Amount.requestFocusInWindow(); // call the next textFields 
            jTextField_MeaasgeDisplay.setText("Enter the Amounts");
        }else{
            jTextField_MeaasgeDisplay.setText("The address is invalid! Please enter the valid String data.");
            jTextField_Address.setText("");
        }
    }//GEN-LAST:event_jTextField_AddressKeyPressed

    // delete button
    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        try{
            // create an object of the DefaultTableModel class
            table_datiels = (DefaultTableModel) jTableAC.getModel();
            int currentRow = jTableAC.getSelectedRow(); // get the current press row's values
            status = jTableAC.getValueAt(currentRow, 6).toString();
            //statuses = (String) jTableAC_details.getValueAt(i, 6);
            // delete row
            if (pressValue==1||jTableAC.getSelectedRow()==1) {
                if (!status.equals("Active")) {
                    textFieldClear(); // the text fields are also empty
                    //selected the reow and delete
                    table_datiels.removeRow(jTableAC.getSelectedRow());
                    jTextField_Id.setEditable(true);
                    JOptionPane.showMessageDialog(rootPane, "Selected data are successfully deleted.");
                    jTabbedPane1.setSelectedIndex(1); // go to data store panal
                }else{
                    jTextField_MeaasgeDisplay.setText("The account is active. cannot deleted.");
                    jTextField_MeaasgeDisplay.setForeground(Color.red);
                }
            }else{
                if (jTableAC.getRowCount()==0) {
                    JOptionPane.showMessageDialog(this, "The table is empty!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Please select the row !");
                }
            }
        } catch (Exception ex) {
            jTextField_MeaasgeDisplay.setText("The account is not available in databases.");
            jTextField_MeaasgeDisplay.setForeground(Color.red);
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    // edit the textFeilds
    private void jBtn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_editActionPerformed
        jTextField_Id.setEditable(true);
        jTextField_Phone.setEditable(true);
    }//GEN-LAST:event_jBtn_editActionPerformed

    //String simpleDate;
    private void jTextField_openDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_openDateKeyPressed
        jTextField_MeaasgeDisplay.setForeground(Color.BLACK);
        String dateVaues = jTextField_openDate.getText();
        jTextField_MeaasgeDisplay.setText("Date : "+dateVaues);
        if(evt.getKeyCode()==evt.VK_ENTER){
            jTextField_Id.requestFocusInWindow(); // call the next textFields 
            jTextField_MeaasgeDisplay.setText("Enter your ID");
        }
    }//GEN-LAST:event_jTextField_openDateKeyPressed

    private void jTextField_IdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_IdKeyPressed
        try{
            //jTextField_Id.setEditable(true);
            jTextField_Id.setForeground(Color.BLACK);
            // writing_show_textFields.setText(Color.BLACK);
            keyValue = evt.getKeyCode();
            // when press the alphabet then igneor
            String validId = jTextField_Id.getText();
            if ((keyValue >= 48 && 57 >= keyValue || keyValue==8 || keyValue==37 ||keyValue==39)) {
                if(validId.length()<5){
                    jTextField_MeaasgeDisplay.setForeground(Color.black);
                    jTextField_MeaasgeDisplay.setText("Id is valided.");
                }else{
                    jTextField_Id.setEditable(false);
                    jTextField_Id.setForeground(Color.BLUE);
                    jTextField_MeaasgeDisplay.setText("Id is only 5 digits allowed.");
                }
            }else if(evt.getKeyCode()==evt.VK_ENTER){
                jTextField_Address.requestFocusInWindow(); // call the next textFields 
                jTextField_MeaasgeDisplay.setText("Enter your address");
            }else{
                jTextField_MeaasgeDisplay.setText("The Id is invalid! Please enter the valid integer");
                jTextField_MeaasgeDisplay.setForeground(Color.RED);
                jTextField_Id.setText("");
            }
        }catch(Exception ex){            
            jTextField_MeaasgeDisplay.setText("The Id is invalid! Please enter the valid integer");
        }
    }//GEN-LAST:event_jTextField_IdKeyPressed

    private void jComboBox_searchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_searchingActionPerformed
        String searchBy = jComboBox_searching.getSelectedItem().toString().toUpperCase(); // upper types convert
        String searchValue = jTextField_Searching.getText(); // getTextthe fields values
        int result;
        getArrayData();
        try{
            System.out.println("Id length: "+Ids.length);
            // by using the switch statement ans searching by binary search
            BinarySearch Search = new BinarySearch();
            switch (searchBy) {
                case "ID": // searching by ID
                    result = Search.searchByInteger(Ids, 0, Ids.length, Integer.parseInt(searchValue));
                    System.out.println("Result: "+result);
                    JOptionPane.showMessageDialog(rootPane, "Id: "+searchValue+"\nName: "+names[result]+"\nAddresses: "+addresses[result]+"\nPhones: "+phones[result]+"\nAmounts: "+amounts[result]+"\nDates: "+dates[result]+"\nStatuses: "+statuses[result]+"\nA/c typeses: "+actypeses[result]+"\nTransactions: "+transactions[result]);
                    break;
                case "NAME": // searching by Name
                    result = Search.searchByString(names, 0, names.length, searchValue);
                    JOptionPane.showMessageDialog(rootPane, "Id: "+Ids[result]+"\nName: "+searchValue+"\nAddresses: "+addresses[result]+"\nPhones: "+phones[result]+"\nAmounts: "+amounts[result]+"\nDates: "+dates[result]+"\nStatuses: "+statuses[result]+"\nA/c typeses: "+actypeses[result]+"\nTransactions: "+transactions[result]);
                    break;
                case "TYPES": // searching by Customer types
                    result = Search.searchByString(actypeses, 0, actypeses.length, searchValue);
                    JOptionPane.showMessageDialog(rootPane, "Id: "+Ids[result]+"\nName: "+names[result]+"\nAddresses: "+addresses[result]+"\nPhones: "+phones[result]+"\nAmounts: "+amounts[result]+"\nDates: "+dates[result]+"\nStatuses: "+statuses[result]+"\nA/c typeses: "+searchValue+"\nTransactions: "+transactions[result]);
                break;
                case "STATUS": // searching by status
                    result = Search.searchByString(statuses, 0, statuses.length, searchValue);
                    JOptionPane.showMessageDialog(rootPane, "Id: "+Ids[result]+"\nName: "+names[result]+"\nAddresses: "+addresses[result]+"\nPhones: "+phones[result]+"\nAmounts: "+amounts[result]+"\nDates: "+dates[result]+"\nStatuses: "+searchValue+"\nA/c typeses: "+actypeses[result]+"\nTransactions: "+transactions[result]);
                break;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Sorry! your searching values is not available.");
        }
    }//GEN-LAST:event_jComboBox_searchingActionPerformed

    
        
    // this method can be clear the textfields
    public void textFieldClear(){
        // when the user click the user then the input textfield are clear
        jTextField_MeaasgeDisplay.setText("Add the General Details !!");
        jTextField_Id.setText("");
        jTextField_Name.setText("");
        jTextField_Address.setText("");
        jTextField_Phone.setText("");
        jTextField_Amount.setText("");
        jTextField_openDate.setText("");
    }
    
    // get the textfields values.
    public void receivedData(){
            id = Integer.parseInt(jTextField_Id.getText());
            name = jTextField_Name.getText();
            address = jTextField_Address.getText();
            phone = jTextField_Phone.getText();
            amount = Float.parseFloat(jTextField_Amount.getText());
            date = jTextField_openDate.getText();
            status = jCboBox_Status.getSelectedItem().toString();
            acTypes = jCBbox_accoutnTypes.getSelectedItem().toString();
    }
        
    // check the duplicated for list values and user input values
    private boolean isDuplicateId(int key) {
        int rowCount = jTableAC.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            int tableId = Integer.parseInt(jTableAC.getValueAt(i, 0).toString());
            if (key == tableId) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isDuplicatePhone(String kay){
        int rowCount = jTableAC.getRowCount();
         for (int i = 0; i < rowCount; i++) {
            String tablePhone = jTableAC.getValueAt(i, 3).toString();
            if(kay.equals(tablePhone)){
                return true;
            }
        }
        return false;
    }
    
    // the methods creat to arraylist for sorting
    private void getArrayData(){
        // initial by arrays
        tableSize = (int) jTableAC.getRowCount();
        Ids = new int[tableSize];
        names = new String[tableSize];
        addresses = new String[tableSize];
        phones = new String[tableSize];
        amounts = new float[tableSize];
        dates = new String[tableSize];
        statuses = new String[tableSize];
        actypeses = new String[tableSize];
        transactions = new int[tableSize];
        
        //value add in table to arrays
        for (int i = 0; i < tableSize; i++) {
            // set the table by sorting values
            Ids[i] = (int) jTableAC.getValueAt(i, 0);
            names[i] = (String) jTableAC.getValueAt(i, 1);
            addresses[i] = (String) jTableAC.getValueAt(i, 2);
            phones[i] = (String) jTableAC.getValueAt(i, 3);
            amounts[i] = (float) jTableAC.getValueAt(i, 4);
            dates[i] = (String) jTableAC.getValueAt(i, 5);
            statuses[i] = (String) jTableAC.getValueAt(i, 6);
            actypeses[i] = (String) jTableAC.getValueAt(i, 7);
            transactions[i] = (int) jTableAC.getValueAt(i, 8);
        } 
    }
    
    // selected table list data
    private void setTableDataToList() {
        int row = jTableAC.getRowCount();
        for (int i = 0; i < row; i++) {
            //Account account = new Customer();
            customer.setId(Integer.parseInt(jTableAC.getValueAt(i, 0).toString()));
            customer.setName(jTableAC.getValueAt(i, 1).toString());
            customer.setAddress(jTableAC.getValueAt(i, 2).toString());
            customer.setPhone(jTableAC.getValueAt(i, 3).toString());
            customer.setAmount(Integer.parseInt(jTableAC.getValueAt(i, 4).toString()));
            customer.setDate(jTableAC.getValueAt(i, 5).toString());
            customer.setStatus(jTableAC.getValueAt(i, 6).toString());
            customer.setAcTypes(jTableAC.getValueAt(i, 7).toString());
            customer.setTransaction(Integer.parseInt(jTableAC.getValueAt(i, 8).toString()));
            
            // add the array list in input data
            listOfCustomer.add(customer);
        }
    }
   
    // main methods
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Update;
    private javax.swing.ButtonGroup buttonGroup_sorting;
    private javax.swing.JButton jBtn_Add;
    private javax.swing.JButton jBtn_edit;
    private javax.swing.JButton jBtn_next;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_logout;
    private javax.swing.JComboBox<String> jCBbox_accoutnTypes;
    private javax.swing.JComboBox<String> jCboBox_Status;
    private javax.swing.JComboBox<String> jComboBox_SortingOption;
    private javax.swing.JComboBox<String> jComboBox_searching;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_general_details;
    private javax.swing.JRadioButton jRadioBtn_Ascending;
    private javax.swing.JRadioButton jRadioBtn_Descending;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAC;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Amount;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_MeaasgeDisplay;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_SearchValues;
    private javax.swing.JTextField jTextField_Searching;
    private javax.swing.JTextField jTextField_SortingMessage;
    private javax.swing.JTextField jTextField_openDate;
    // End of variables declaration//GEN-END:variables
private String toString(int[] Ids) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}
