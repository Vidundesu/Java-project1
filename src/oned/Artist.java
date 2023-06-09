/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oned;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;


/**
 *
 * @author User
 */
public class Artist extends javax.swing.JFrame {

    /**
     * Creates new form Artist
     */
    
    Album album;
    Song song;
    Studio studio;
    Manager manager;
    
    String filename;
    byte[] artist=null;
    
    ArtistConnect  conn;
    
    public Artist() {
       conn = new ArtistConnect();
        initComponents();
        setResizable(false);
        setTitle("Artist");
        conn.displayData(TableA);
        
       
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        albumL = new javax.swing.JLabel();
        songL = new javax.swing.JLabel();
        studioL = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableA = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        AddA = new javax.swing.JButton();
        UpdateA = new javax.swing.JButton();
        SearchBox = new javax.swing.JTextField();
        FindA = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ByearA = new javax.swing.JTextField();
        idInputA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameA = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lastNameA = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        genreA = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        countryA = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        yearA = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        managerA = new javax.swing.JTextField();
        artistDelete = new javax.swing.JButton();
        lbl_img = new javax.swing.JLabel();
        browse = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(10, 38, 71));

        jPanel2.setBackground(new java.awt.Color(50, 114, 233));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OneD");

        albumL.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        albumL.setForeground(new java.awt.Color(255, 255, 255));
        albumL.setText("Album");
        albumL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                albumLMouseClicked(evt);
            }
        });

        songL.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        songL.setForeground(new java.awt.Color(255, 255, 255));
        songL.setText("Song");
        songL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                songLMouseClicked(evt);
            }
        });

        studioL.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        studioL.setForeground(new java.awt.Color(255, 255, 255));
        studioL.setText("Studio");
        studioL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studioLMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Manager");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228)
                .addComponent(albumL)
                .addGap(125, 125, 125)
                .addComponent(songL)
                .addGap(131, 131, 131)
                .addComponent(studioL)
                .addGap(105, 105, 105)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(albumL)
                    .addComponent(songL)
                    .addComponent(studioL)
                    .addComponent(jLabel19))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        TableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Genre", "Country", "Joining Date", "Date of Birth", "Manager"
            }
        ));
        jScrollPane1.setViewportView(TableA);

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ARTIST");

        AddA.setBackground(new java.awt.Color(50, 114, 233));
        AddA.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        AddA.setForeground(new java.awt.Color(255, 255, 255));
        AddA.setText("Add Artist");
        AddA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAActionPerformed(evt);
            }
        });

        UpdateA.setBackground(new java.awt.Color(50, 114, 233));
        UpdateA.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        UpdateA.setForeground(new java.awt.Color(255, 255, 255));
        UpdateA.setText("Update Artist");
        UpdateA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAActionPerformed(evt);
            }
        });

        SearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxActionPerformed(evt);
            }
        });

        FindA.setBackground(new java.awt.Color(50, 114, 233));
        FindA.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        FindA.setForeground(new java.awt.Color(255, 255, 255));
        FindA.setText("Find");
        FindA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindAMouseClicked(evt);
            }
        });
        FindA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindAActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID*");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name*");

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Last Name*");

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Genre*");

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Country*");

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Joining Date");

        refreshBtn.setText("refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Manager");

        artistDelete.setBackground(new java.awt.Color(204, 0, 0));
        artistDelete.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        artistDelete.setForeground(new java.awt.Color(255, 255, 255));
        artistDelete.setText("Delete");
        artistDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistDeleteActionPerformed(evt);
            }
        });

        lbl_img.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        browse.setBackground(new java.awt.Color(50, 114, 233));
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(261, 261, 261)
                                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FindA)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateA)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AddA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(artistDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(70, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn)
                        .addGap(403, 403, 403)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7)
                    .addComponent(idInputA)
                    .addComponent(jLabel6)
                    .addComponent(firstNameA)
                    .addComponent(lastNameA)
                    .addComponent(genreA)
                    .addComponent(countryA, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ByearA)
                    .addComponent(yearA))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(managerA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(lbl_img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(browse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AddA)
                                        .addComponent(UpdateA)
                                        .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FindA)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(artistDelete)
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(idInputA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(firstNameA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastNameA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel16))
                                            .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(genreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel17))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(browse)
                                        .addGap(29, 29, 29)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countryA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yearA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ByearA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(refreshBtn))
                                .addGap(31, 31, 31))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(managerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
 
    
    private void AddAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAActionPerformed

        String idIn = idInputA.getText();
        int id = Integer.parseInt(idIn);
        
        String mId = managerA.getText();  //manager ID
        int managerId = Integer.parseInt(mId);
        
        String firstName = firstNameA.getText();
        String lastName = lastNameA.getText();
        String genre = genreA.getText();
        String country = countryA.getText();
        
        String JD = yearA.getText();  
        String DOB = ByearA.getText();

        //Check whether the function is returning true or false
       if(conn.ArtistInsertData(id,firstName,lastName,genre,country,JD,DOB,managerId,artist)) 
       {
           JOptionPane.showMessageDialog(this, "Record Inserted Successfully! " , "Error", JOptionPane.INFORMATION_MESSAGE);
           System.out.println("Success");
       }
       else{
           System.out.println("fail");
       }
    }//GEN-LAST:event_AddAActionPerformed

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBoxActionPerformed

    
    private void albumLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_albumLMouseClicked
       //When the label is already clicked the frame will be disabled to prevent more popping more frames up
        if(album==null){
            album = new Album();
            album.setVisible(true);   
      }
      else{
          albumL.disable();
      }
        album.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_albumLMouseClicked

    private void songLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_songLMouseClicked
        //When the label is already clicked the frame will be disabled to prevent more popping more frames up
        if(song==null){
            song = new Song();
            song.setVisible(true);
       }
       else{
          songL.disable();
       }
       song.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       
    }//GEN-LAST:event_songLMouseClicked

    private void studioLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studioLMouseClicked
        //When the label is already clicked the frame will be disabled to prevent more popping more frames up
        if(studio==null){
            studio = new Studio();
            studio.setVisible(true);
        }
        else{
            studioL.disable();
        }
        studio.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_studioLMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        //When the label is already clicked the frame will be disabled to prevent more popping more frames up
        if(manager==null){
            manager = new Manager();
            manager.setVisible(true);
        }
        else{
            jLabel19.disable();
        }
        manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
       
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void FindAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindAActionPerformed
        String idIn = SearchBox.getText();
        int id = Integer.parseInt(idIn);
        DefaultTableModel model = (DefaultTableModel) TableA.getModel();
        model.setRowCount(0); // remove all data from the table 
        
        //Check whether the function is returning true or false
        if(conn.SearchArtistData(id, TableA)){
            System.out.println("success");
          
        }
        else{
            System.out.println("fail");
            JOptionPane.showMessageDialog(this, "Data not found! " , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FindAActionPerformed

    private void FindAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindAMouseClicked
        

    }//GEN-LAST:event_FindAMouseClicked

    private void UpdateAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAActionPerformed
        
        String idIn = idInputA.getText();
        int id = Integer.parseInt(idIn);
        
        String mId = managerA.getText();  //manager ID
        int managerId = Integer.parseInt(mId);
        
        String firstName = firstNameA.getText();
        String lastName = lastNameA.getText();
        String genre = genreA.getText();
        String country = countryA.getText();
        
        String JD = yearA.getText();  
        String DOB = ByearA.getText();
        
             //Check whether the function is returning true or false
        if(conn.ArtistUpdateData(id,firstName,lastName,genre,country,JD,DOB,managerId)) 
       {
           JOptionPane.showMessageDialog(this, "Record Updated Successfully! " , "Error", JOptionPane.INFORMATION_MESSAGE);
           System.out.println("Success");
       }
       else{
           System.out.println("fail");
            JOptionPane.showMessageDialog(this, "Data Did Not Updated! " , "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_UpdateAActionPerformed

    private void artistDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistDeleteActionPerformed
        int id = Integer.parseInt(idInputA.getText());
             //Check whether the function is returning true or false
        if(conn.DeleteArtistData(id)){
             JOptionPane.showMessageDialog(this, "Record Deleted Successfully! " , "Error", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }
    }//GEN-LAST:event_artistDeleteActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
       /*
        image uploading code snip
        */
       JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null); //show the open fileDialog
       File f = chooser.getSelectedFile(); //Get the selected file
       filename = f.getAbsolutePath(); //get the file path
       ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH));
       lbl_img.setIcon(imageIcon); //set the image in the label to show preview
       try{
           File image = new File(filename);
           FileInputStream fis = new FileInputStream(image);
           ByteArrayOutputStream bos = new ByteArrayOutputStream();
           byte[] buf = new byte[1024];
           
           for(int i;(i=fis.read(buf))!=-1;){
               bos.write(buf);
           }
           
           artist=bos.toByteArray();
       }catch(Exception e){
           System.out.println("fail");
       }
    }//GEN-LAST:event_browseActionPerformed

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
            java.util.logging.Logger.getLogger(Artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Artist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddA;
    private javax.swing.JTextField ByearA;
    private javax.swing.JButton FindA;
    private javax.swing.JTextField SearchBox;
    public javax.swing.JTable TableA;
    private javax.swing.JButton UpdateA;
    private javax.swing.JLabel albumL;
    private javax.swing.JButton artistDelete;
    private javax.swing.JButton browse;
    private javax.swing.JTextField countryA;
    private javax.swing.JTextField firstNameA;
    private javax.swing.JTextField genreA;
    private javax.swing.JTextField idInputA;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameA;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JTextField managerA;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel songL;
    private javax.swing.JLabel studioL;
    private javax.swing.JTextField yearA;
    // End of variables declaration//GEN-END:variables
}
