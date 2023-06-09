/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oned;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;


/**
 *
 * @author User
 */
public class Song extends javax.swing.JFrame {

    /**
     * Creates new form Song
     */
    Album album;
    Artist artist;
    Studio studio;
    Manager manager;
    SongConnect conn;
    Time durationTime;
  
    
    public Song() {
        conn = new SongConnect();
        
        initComponents();
        setResizable(false);
        conn.DisplayData(TableSong);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSong = new javax.swing.JTable();
        AddS = new javax.swing.JButton();
        UpdateS = new javax.swing.JButton();
        FindS = new javax.swing.JButton();
        SearchBoxS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameS = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        durationS = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        trackS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        albumIn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        SongDelete = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Studio");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Song");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Album");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Song");

        jPanel1.setBackground(new java.awt.Color(10, 38, 71));

        jPanel3.setBackground(new java.awt.Color(50, 114, 233));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("OneD");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Studio");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Artist");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Album");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Manager");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(jLabel9)
                    .addGap(125, 125, 125)
                    .addComponent(jLabel8)
                    .addGap(131, 131, 131)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(225, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        TableSong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Duration", "Track Number", "AlbumID"
            }
        ));
        jScrollPane1.setViewportView(TableSong);

        AddS.setBackground(new java.awt.Color(50, 114, 223));
        AddS.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        AddS.setForeground(new java.awt.Color(255, 255, 255));
        AddS.setText("Add Song");
        AddS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSActionPerformed(evt);
            }
        });

        UpdateS.setBackground(new java.awt.Color(50, 114, 223));
        UpdateS.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        UpdateS.setForeground(new java.awt.Color(255, 255, 255));
        UpdateS.setText("Update Song");
        UpdateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSActionPerformed(evt);
            }
        });

        FindS.setBackground(new java.awt.Color(50, 114, 223));
        FindS.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        FindS.setForeground(new java.awt.Color(255, 255, 255));
        FindS.setText("Find");
        FindS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindSMouseClicked(evt);
            }
        });
        FindS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindSActionPerformed(evt);
            }
        });

        SearchBoxS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxSActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SONGS");

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name");

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Duration");

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Track Number");

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Album");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SongDelete.setBackground(new java.awt.Color(204, 0, 0));
        SongDelete.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        SongDelete.setForeground(new java.awt.Color(255, 255, 255));
        SongDelete.setText("Delete");
        SongDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SongDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(FindS)
                            .addGap(18, 18, 18)
                            .addComponent(UpdateS)
                            .addGap(18, 18, 18)
                            .addComponent(AddS))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SongDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(albumIn, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameS, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(durationS, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15)
                                .addComponent(jLabel11))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(trackS, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddS)
                                .addComponent(UpdateS)
                                .addComponent(SearchBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FindS))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SongDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(durationS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trackS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(albumIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(artist==null){
            artist = new Artist();          
            artist.setVisible(true);   
        }
        else{
            jLabel8.disable();
        }
        artist.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       
       if(album==null){
           album = new Album();       
           album.setVisible(true);
           
       }
       else{
          jLabel9.disable();
       }
        album.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void AddSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSActionPerformed
       
        String name = nameS.getText();

        int duration = Integer.parseInt(durationS.getText()); //collect duration data from user in seconds(integer type)
        int minutes = duration / 60;                            //divide seconds by 60 to make minutes
        int seconds = duration % 60;                            //using modulus to get remainder of seconds.
        String durationFormatted = String.format("00:%02d:%02d",minutes,seconds);   /* convert integers into String and format it into "HH:mm:ss" pattern. 
                                                                                                      "%02d" is an integer format specifier that uses to format with a zero if the value is less than 10 (eg: 00:04:02) */
        int trackNo = Integer.parseInt(trackS.getText());
        int albumId = Integer.parseInt(albumIn.getText());
        
        //Check whether the function is returning true or false
        if(conn.AddSongData(name,durationFormatted, trackNo, albumId)){
            System.out.println("SUCCESS");
            JOptionPane.showMessageDialog(this, "Record Inserted Successfully! " , "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            System.out.println("fail");
        }

        
    }//GEN-LAST:event_AddSActionPerformed

    private void SearchBoxSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBoxSActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      if(studio==null){
          studio = new Studio();
          studio.setVisible(true);
      }
      else{
          jLabel7.disable();
      }
       studio.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(manager==null){
            manager = new Manager();
            manager.setVisible(true);
        }
        else{
            jLabel11.disable();
        }
        manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void FindSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindSActionPerformed
        int track = Integer.parseInt(SearchBoxS.getText());
        DefaultTableModel model = (DefaultTableModel) TableSong.getModel();
        model.setRowCount(0);  //set the table row count to 0
           //Check whether the function is returning true or false
            if(conn.SearchSongData(track,TableSong)){
                System.out.println("success");
            }
            else{
                System.out.println("fail");
                JOptionPane.showMessageDialog(this, "Data not found! " , "Error", JOptionPane.ERROR_MESSAGE);
            }
              
        
    }//GEN-LAST:event_FindSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FindSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FindSMouseClicked

    private void SongDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SongDeleteActionPerformed
        int track = Integer.parseInt(trackS.getText());
        //Check whether the function is returning true or false
        if(conn.DeleteSongData(track)){
             JOptionPane.showMessageDialog(this, "Record Deleted Successfully! " , "Error", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }
    }//GEN-LAST:event_SongDeleteActionPerformed

    private void UpdateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSActionPerformed
       int track = Integer.parseInt(trackS.getText());
       
        String name = nameS.getText();

        int duration = Integer.parseInt(durationS.getText()); //collect duration data from user in seconds(integer type)
        int minutes = duration / 60;                            //divide seconds by 60 to make minutes
        int seconds = duration % 60;                            //using modulus to get remainder of seconds.
        String durationFormatted = String.format("00:%02d:%02d",minutes,seconds);   /* convert integers into String and format it into "HH:mm:ss" pattern. 
                                                                                                      "%02d" is an integer format specifier that uses to format with a zero if the value is less than 10 (eg: 00:04:02) */
        int albumId = Integer.parseInt(albumIn.getText());
        //Check whether the function is returning true or false
        if(conn.UpdateSongData(name,durationFormatted, track, albumId)){
            JOptionPane.showMessageDialog(this, "Record Updated Successfully! " , "Error", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("SUCCESS");
        }
        else{
            System.out.println("fail");
        }                                                                                              
    }//GEN-LAST:event_UpdateSActionPerformed

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
            java.util.logging.Logger.getLogger(Song.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Song.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Song.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Song.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Song().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddS;
    private javax.swing.JButton FindS;
    private javax.swing.JTextField SearchBoxS;
    private javax.swing.JButton SongDelete;
    private javax.swing.JTable TableSong;
    private javax.swing.JButton UpdateS;
    private javax.swing.JTextField albumIn;
    private javax.swing.JTextField durationS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameS;
    private javax.swing.JTextField trackS;
    // End of variables declaration//GEN-END:variables
}
