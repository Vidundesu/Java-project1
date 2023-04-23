/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oned;


import java.sql.*;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class SongConnect {
    private final String url;
    private Connection conn;
    
    
    public SongConnect(){
     
        this.url="jdbc:sqlserver://localhost:1433;databaseName=oneD;username=sa;password=1234;";
        this.connectDb();
    }
    
    public boolean connectDb(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
            return true;
        }catch(ClassNotFoundException | SQLException e){
            return false;
        }
    }
    public void closeConnection(){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(SQLException e){
            System.out.println("fail");
        }
    }
    public boolean AddSongData (String name, String duration, int trackNo, int albumID ){
        try{
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO song (song_name, duration, albumID, track_no) VALUES ('"+name+"','"+duration+"',"+albumID+","+trackNo+")";
            stmt.execute(query);
            return true;
        }catch(SQLException | NumberFormatException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

   public boolean DisplayData(JTable TableSong){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM song";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                String id = String.valueOf(rs.getInt("songID"));
                String name = rs.getString("song_name");
                Time duration = rs.getTime("duration");
                String trackNo = String.valueOf(rs.getInt("track_no"));
                String albumId = String.valueOf(rs.getInt("albumID"));

                String tbData[]= {id, name, duration.toString(),trackNo,albumId,};
                DefaultTableModel model = (DefaultTableModel) TableSong.getModel();
                model.addRow(tbData);
            }
            return true;
        } catch(SQLException e){
            return false;
        }
   }
   
    public boolean SearchSongData(int idIn, JTable TableSong){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM song WHERE songID="+idIn+";";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                do{
                String id = String.valueOf(rs.getInt("songID"));
                String name = rs.getString("song_name");
                Time duration = rs.getTime("duration");
                String albumId = String.valueOf(rs.getInt("albumID"));
                String trackNo = String.valueOf(rs.getInt("track_no"));

                String tbData[]= {id, name, duration.toString(), albumId, trackNo};
                DefaultTableModel model = (DefaultTableModel) TableSong.getModel();
                model.addRow(tbData);
                }while(rs.next());
            }
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean SearchData(int id){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM song";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                do{
                    System.out.println("Records are available");
                }while(rs.next());
            }
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean UpdateSongData(int id, String name, String duration, int track_no, int albumId){
        try{
            
        }catch(){
            
        }
    }
}


