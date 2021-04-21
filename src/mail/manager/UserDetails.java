/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail.manager;

import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Studio 7
 */
public class UserDetails extends javax.swing.JFrame {

    byte[] person_image = null;
    String filename = null;

    /**
     * Creates new form UserDetails
     */
    public UserDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        searchhere = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        prof = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        uses = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        supp = new javax.swing.JTextField();
        photolable = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        change_pass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1035, 625));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(0, 153, 153));
        jLabel17.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Mails Manager");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 150, 40));

        jRadioButton1.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Dark ");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        searchhere.setBackground(new java.awt.Color(204, 204, 204));
        searchhere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchhere.setForeground(new java.awt.Color(0, 153, 153));
        searchhere.setText("Search ID here");
        searchhere.setBorder(null);
        searchhere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchhereMouseClicked(evt);
            }
        });
        searchhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchhereActionPerformed(evt);
            }
        });
        jPanel2.add(searchhere, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 203, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 203, 11));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail/manager/button/profeession.png"))); // NOI18N
        jLabel9.setText("Profession");
        jLabel9.setToolTipText("");

        prof.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        prof.setForeground(new java.awt.Color(102, 102, 102));
        prof.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        prof.setToolTipText("");
        prof.setBorder(null);
        prof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profMouseClicked(evt);
            }
        });
        prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profActionPerformed(evt);
            }
        });
        prof.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                profKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail/manager/button/contacts_18px.png"))); // NOI18N
        jLabel8.setText("Email");

        email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setBorder(null);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail/manager/button/servise.png"))); // NOI18N
        jLabel10.setText("Why are you using Mail Manager");
        jLabel10.setToolTipText("");

        uses.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        uses.setForeground(new java.awt.Color(102, 102, 102));
        uses.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        uses.setToolTipText("");
        uses.setBorder(null);
        uses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usesMouseClicked(evt);
            }
        });
        uses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usesActionPerformed(evt);
            }
        });
        uses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usesKeyTyped(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail/manager/button/support.png"))); // NOI18N
        jLabel11.setText("Support us");
        jLabel11.setToolTipText("");

        supp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        supp.setForeground(new java.awt.Color(102, 102, 102));
        supp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        supp.setToolTipText("");
        supp.setBorder(null);
        supp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppMouseClicked(evt);
            }
        });
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });
        supp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                suppKeyTyped(evt);
            }
        });

        photolable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Upload Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Generate Report");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail/manager/button/id.png"))); // NOI18N
        jLabel12.setText("ID");
        jLabel12.setToolTipText("");

        id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        id.setForeground(new java.awt.Color(102, 102, 102));
        id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        id.setText("ID");
        id.setToolTipText("");
        id.setBorder(null);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator7.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator8.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail/manager/button/search_20px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        change_pass.setText("Change Password");
        change_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(change_pass)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(uses, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(id)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(photolable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112)
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prof, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(prof, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(photolable, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(change_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uses, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        UserDetails obj = new UserDetails();
        obj.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        //  this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        // int xx = evt.getX();
        //  int xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void profMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseClicked
        // TODO add your handling code here:
        if ("Username".equals(prof.getText())) {
            prof.setText("");
        }
    }//GEN-LAST:event_profMouseClicked

    private void profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profActionPerformed

    private void profKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_profKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_profKeyTyped

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        // TODO add your handling code here:
        if ("Email".equals(email.getText())) {
            email.setText("");
        }
    }//GEN-LAST:event_emailMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void searchhereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchhereMouseClicked

        if ("Search ID here".equals(searchhere.getText())) {
            searchhere.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_searchhereMouseClicked

    private void searchhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchhereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchhereActionPerformed

    private void usesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usesMouseClicked

    private void usesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usesActionPerformed

    private void usesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_usesKeyTyped

    private void suppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_suppMouseClicked

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppActionPerformed

    private void suppKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suppKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_suppKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser Chooser = new JFileChooser();
        Chooser.showOpenDialog(null);
        File f = Chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(photolable.getWidth(), photolable.getHeight(), Image.SCALE_SMOOTH));

        photolable.setIcon(imageIcon);
        try {
            File Image = new File(filename);
            FileInputStream fis = new FileInputStream(Image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        /*
 JFileChooser fileChooser = new JFileChooser();
        //Limit type of file name extensions supported.
 
        FileNameExtensionFilter filter = new FileNameExtensionFilter("4 Extensions Supported", "jpg", "png", "jpeg", "gif");
 
        fileChooser.setFileFilter(filter);
 
        int selected = fileChooser.showOpenDialog(null);
 
        //check if open button has been clicked.
 
        if (selected == JFileChooser.APPROVE_OPTION) {
 
            File file = fileChooser.getSelectedFile();
 
            //Get Path of the selected image.
 
            String getselectedImage = file.getAbsolutePath();
 
            //Display image path on Message Dialog
 
            JOptionPane.showMessageDialog(null, getselectedImage);
 
            ImageIcon imIco = new ImageIcon(getselectedImage);
 
            //make image fit on jlabel.
 
            Image imFit = imIco.getImage();
 
            Image imgFit = imFit.getScaledInstance(photolable.getWidth(), photolable.getHeight(), Image.SCALE_SMOOTH);
 
            photolable.setIcon(new ImageIcon(imgFit));
         */
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            Connection Con_Db = MailManager.Db_MailsManager();
            String query = "insert into UserReport(ID,Email,Profession,[Use],Support,Photo)values(?,?,?,?,?,?)";
            PreparedStatement ps = Con_Db.prepareStatement(query);

            //   String Fetch_Email=user.getText();
            ps.setString(1, id.getText());
            ps.setString(2, email.getText());
            ps.setString(3, prof.getText());
            ps.setString(4, uses.getText());
            ps.setString(5, supp.getText());
            ps.setBytes(6, person_image);
            ps.executeUpdate();

            id.setText("");
            email.setText("");
            prof.setText("");
            uses.setText("");
            supp.setText("");
            photolable.setText("");

            JOptionPane.showMessageDialog(null, "Your Report has been generated Successfully ");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        if ("ID".equals(id.getText())) {
            id.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_idMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        try {

            Connection Con_Db = MailManager.Db_MailsManager();
            String query = "select * from UserReport where ID=?";
            PreparedStatement ps = Con_Db.prepareStatement(query);

            ps.setString(1, searchhere.getText());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                id.setText(rs.getString("ID"));
                email.setText(rs.getString("Email"));
                prof.setText(rs.getString("Profession"));
                uses.setText(rs.getString("Use"));
                supp.setText(rs.getString("Support"));
                byte[] img = rs.getBytes("Photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(photolable.getWidth(), photolable.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newimage = new ImageIcon(myimg);
                photolable.setIcon(newimage);

                //    s_password.setText(rs.getString("Passwordd"));
            } else {

                JOptionPane.showMessageDialog(null, "You Record Not Found Please Insert Your Information");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked
    public void setColor(JButton btn) {
        btn.setBackground(new Color(44, 189, 132));
    }

    public void resetColor(JButton btn) {
        btn.setBackground(new Color(0, 153, 153));
    }
    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        setColor(jButton2);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        resetColor(jButton2);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void change_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_passActionPerformed
        // TODO add your handling code here:
        resetpass rst_pass = new resetpass();
        rst_pass.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_change_passActionPerformed

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
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_pass;
    public javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel photolable;
    private javax.swing.JTextField prof;
    private javax.swing.JTextField searchhere;
    private javax.swing.JTextField supp;
    private javax.swing.JTextField uses;
    // End of variables declaration//GEN-END:variables
}