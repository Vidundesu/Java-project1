/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oned;


import java.sql.SQLException;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */

/*
===============
    Outcome
===============
    To handle INSERT, SEARCH, UPDATE and DELETE functions.
    To Display Data within the Table: DisplayData() method.
*/
public class AlbumConnect {
    private final String url;
    private Connection conn;
    
    
    public AlbumConnect(){
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
    public boolean AddAlbumData(int id, String name, String recordDate, String releaseDate){
        try{
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO album (albumID, album_name, release_yr, record_yr)VALUES ("+id+",'"+name+"','"+releaseDate+"','"+recordDate+"')";
            stmt.execute(query);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean DisplayData(JTable TableAlbum){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM album";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("albumID"));
                String name = rs.getString("album_name");
                String releaseDate =rs.getString("release_yr");
                String recordDate = rs.getString("record_yr");
                
                String tbData[] = {id, name, releaseDate, recordDate};
                DefaultTableModel model = (DefaultTableModel) TableAlbum.getModel();
                model.addRow(tbData);
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean SearchAlbumData(int id, JTable TableAlbum){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM album WHERE albumID="+id+";";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                do{
                    String idin = String.valueOf(rs.getInt("albumID"));
                    String name = rs.getString("album_name");
                    String releaseDate =rs.getString("release_yr");
                    String recordDate = rs.getString("record_yr");

                    String tbData[] = {idin, name, releaseDate, recordDate};
                    DefaultTableModel model = (DefaultTableModel) TableAlbum.getModel();
                    model.addRow(tbData);
                }while(rs.next());
            }
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    //This function helps to UPDATE and DELETE functions to search availability of data according to input(id)
    public boolean SearchData(int id){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM album";
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
    public boolean UpdateAlbumData(int id, String name, String releaseDate, String recordDate){
        try{
            Statement stmt = conn.createStatement();
            if(SearchData(id)){
                String query = "UPDATE album SET album_name="+name+", release_yr='"+releaseDate+"', record_yr='"+recordDate+"';";
                stmt.executeUpdate(query);   
                return true;
            }
            else{
                return false;
            }
            
        }catch(SQLException e){
            return false;
        }
    }
}
