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

/*
===============
    Outcome
===============
    Displaying ongoing record data (artist name, album name, studio name) using their own tables in the record data table.
*/

public class RecordConnect {
    
    private final String url;
    private Connection conn;
    
    public RecordConnect(){
     
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
    public boolean DisplayData(JTable RecordTable){
        try{
            Statement stmt = conn.createStatement();
            String query =  "SELECT recordID, artist.first_name, album.album_name, studio.studio_name, record.startDate, record.endDate FROM record JOIN artist ON record.ArtistID = artist.artistID JOIN album ON record.AlbumID = album.albumID JOIN studio ON record.StudioID = studio.studioID";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                    do{
                        String id = String.valueOf(rs.getInt("recordID"));
                        String artistName= rs.getString("first_name");
                        String albumName = rs.getString("album_name");
                        String studioName= rs.getString("studio_name");
                        String startDate = rs.getString("startDate");
                        String endDate   = rs.getString("endDate");

                        String tbData[] = { id, artistName, albumName, studioName, startDate, endDate};
                        DefaultTableModel model = (DefaultTableModel) RecordTable.getModel();
                        model.addRow(tbData);
                    }while(rs.next());
                }
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
