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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArtistConnect  {
    
    private final String url;
    private Connection conn;
    
    
    public ArtistConnect(){
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
    public boolean ArtistInsertData(int id, String firstName, String lastName, String genre, String country, String JD, String DOB, int managerID){
        try{
            Statement stmt = conn.createStatement();
            String query="INSERT INTO artist(artistID,first_name,last_name,genre,country,joining_date,DOB) VALUES "
                        + "("+id+",'"+firstName+"','"+lastName+"','"+genre+"','"+country+"','"+JD+"','"+DOB+"',"+managerID+")";
            stmt.execute(query);
            return true;
        }catch(SQLException e){
            
            return false;
        }
        
    }
    public boolean SearchArtistData(int idIn, JTable TableA){ //Main search function on the program, Gather id through searchBox and display them in the Main table
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM artist WHERE artistID="+idIn+";";
            ResultSet rs = stmt.executeQuery(query);
            

            while(rs.next()){
                do{
                    String id = String.valueOf(rs.getInt("artistID"));
                    String Fname = rs.getString("first_name");
                    String Lname = rs.getString("last_name");
                    String genre = rs.getString("genre");
                    String country = rs.getString("country");
                    String jd = rs.getString("joining_date");
                    String dob = rs.getString("DOB");
                    String mid = String.valueOf(rs.getInt("managerID"));

                   String tbData[] = { id, Fname, Lname, genre, country, jd, dob, mid };
                    DefaultTableModel model = (DefaultTableModel) TableA.getModel();
                    model.addRow(tbData);
                }while(rs.next());
                return true;
            }
     
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean SearchData(int idIn){ //uses to help for update function to check whether the relevent row is available or not
        try{
            Statement stmt = conn.createStatement();
            String query ="SELECT * FROM artist WHERE artistID="+idIn+";";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                do{
                    System.out.println("Searched successfully");
                }while(rs.next());
                return true;
            }
        }catch(SQLException e){
            return false;
        }
        return false;
    }
    
    public boolean ArtistUpdateData(int id, JTable TableA, String firstName, String lastName, String genre, String country, String JD, String DOB, int managerID){
        try{
            Statement stmt = conn.createStatement();    
            
            
            if(SearchData(id)){
                String query="UPDATE artist SET first_name='"+firstName+"',last_name='"+lastName+"', "
                            +"genre='"+genre+"', country='"+country+"', joining_date='"+JD+"', DOB='"+DOB+"',managerID="+managerID+" WHERE artistID="+id+";";
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
    public boolean displayData(JTable TableA) {
    try {
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM artist";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String id = String.valueOf(rs.getInt("artistID"));
            String Fname = rs.getString("first_name");
            String Lname = rs.getString("last_name");
            String genre = rs.getString("genre");
            String country = rs.getString("country");
            String jd = rs.getString("joining_date");
            String dob = rs.getString("DOB");
            String mid = String.valueOf(rs.getInt("managerID"));
            
           String tbData[] = { id, Fname, Lname, genre, country, jd, dob, mid };
            DefaultTableModel model = (DefaultTableModel) TableA.getModel();
            model.addRow(tbData);
        }
       
        return true;
    }catch (SQLException e) {
        System.out.println(e.getMessage());
        }
     return false;
    }
    
}
