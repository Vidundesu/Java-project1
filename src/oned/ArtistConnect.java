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


/*
===============
    Outcome
===============
    This java class will help the program,
    To handle INSERT, SEARCH, UPDATE and DELETE functions.
    To Display Data within the Table (DisplayData() method)
*/
public class ArtistConnect  {
    
    private final String url;
    private Connection conn;
    private byte[] picture;
    
    
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
   public boolean ArtistInsertData(int id, String firstName, String lastName, String genre, String country, String JD, String DOB, int managerID, byte[] image){
    try{
        String query = "INSERT INTO artist(artistID,first_name,last_name,genre,country,joining_date,DOB,managerID,image) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(query); //its much more efficient and fast using PreparedStatement instead of Statement
        pstmt.setInt(1, id);
        pstmt.setString(2, firstName);
        pstmt.setString(3, lastName);
        pstmt.setString(4, genre);
        pstmt.setString(5, country);
        pstmt.setString(6, JD);
        pstmt.setString(7, DOB);
        pstmt.setInt(8, managerID);
        pstmt.setBytes(9, image);
        pstmt.executeUpdate();
        return true;
    }catch(SQLException e){
        System.out.println(e.getMessage());
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
    
     //This function helps to UPDATE and DELETE functions to search availability of data according to input(id)
    public boolean SearchData(int idIn){ 
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
    //Data update function
    public boolean ArtistUpdateData(int id, String firstName, String lastName, String genre, String country, String JD, String DOB, int managerID){
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
    //Display data function use to display data within its frame table
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
    public boolean DeleteArtistData(int id){
        try{
            Statement stmt = conn.createStatement();
            if(SearchData(id)){
                String query="DELETE FROM artist WHERE artistID="+id+";";
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
    public boolean WorksOnData(JTable WorkTable){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT artist.first_name, artist.last_name, album.album_name, album.record_yr FROM works_on JOIN artist ON works_on.AId = artist.artistID JOIN album ON works_on.AlId = album.albumID;";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                do{
                    String firstName = rs.getString("first_name");
                    String lastName  = rs.getString("last_name");
                    String albumName = rs.getString("album_name");
                    String recordYr  = rs.getString("record_yr");
                    
                    String tbData [] = {firstName, lastName, albumName, recordYr};
                    DefaultTableModel model = (DefaultTableModel) WorkTable.getModel();
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
