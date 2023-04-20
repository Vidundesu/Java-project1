/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oned;

/**
 *
 * @author User
 */
import java.sql.*;
import java.sql.SQLException;
public class Connect {
    
    private final String url;
    private Connection conn;
    
    public Connect(){
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
            e.printStackTrace();
        }
        
    }
    public boolean ArtistInsertData(int id, String firstName, String lastName, String genre, String country, String JD, String DOB){
        try{
            Statement stmt = conn.createStatement();
            String query="INSERT INTO artist(artistID,first_name,last_name,genre,country,joining_date,DOB) VALUES ("+id+",'"+firstName+"','"+lastName+"','"+genre+"','"+country+"','"+JD+"','"+DOB+"')";
            stmt.execute(query);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
