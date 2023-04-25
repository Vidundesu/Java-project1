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
public class StudioConnect {
    private final String url;
    private Connection conn;
    
    
    public StudioConnect(){
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
    public boolean AddStudioData(int id, String name, float money, String openTime, String closeTime, String location){
        try{
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO studio (studioID, studio_name, hourly_cost, open_time, close_time, studio_location) VALUES ("+id+", '"+name+"', "+money+", '"+openTime+"', '"+closeTime+"', '"+location+"' )";
            stmt.execute(query);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean DisplayData(JTable TableStudio){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM studio";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("studioID"));
                String name = rs.getString("studio_name");
                String cost = String.valueOf(rs.getFloat("hourly_cost"));
                String openTime = rs.getString("open_time");
                String closeTime = rs.getString("close_time");

                String location = rs.getString("studio_location");
                
                String tbData[]= {id,name,cost,openTime, closeTime, location};
                DefaultTableModel model = (DefaultTableModel) TableStudio.getModel();
                model.addRow(tbData);
            }
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean SearchStudioData(int idIn, JTable TableStudio){
       try{
           Statement stmt =  conn.createStatement();
           String query = "SELECT * FROM studio WHERE studioID="+idIn+";";
           ResultSet rs = stmt.executeQuery(query);
           
           while(rs.next()){
               do{
                   String id = String.valueOf(rs.getInt("studioID"));
                   String name = rs.getString("studio_name");
                   String cost = String.valueOf(rs.getFloat("hourly_cost"));
                   String openTime = rs.getString("open_time");
                   String closeTime = rs.getString("close_time");
                   String location = rs.getString("studio_location");
                   
                   String tbData[] = {id, name, cost, openTime, closeTime, location};
                   DefaultTableModel model = (DefaultTableModel) TableStudio.getModel();
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
            String query = "SELECT * FROM studio";
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
    public boolean UpdateStudioData(){
        try{
            
        }catch(){
            
        }
    }
}
