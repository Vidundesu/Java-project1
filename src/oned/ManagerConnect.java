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
/**
 *
 * @author User
 */

/*
===============
    Outcome
===============
    This java class will help the program,
    To handle INSERT, SEARCH, UPDATE and DELETE functions.
    To Display Data within the Table: DisplayData() method.
*/
public class ManagerConnect {
    private final String url;
    private Connection conn;
    
    
    public ManagerConnect(){
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
    public boolean AddManagerData(int id, int phone[], String name){
        try{
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO manager(managerID, manager_name) VALUES("+id+",'"+name+"');";
//           
            stmt.execute(query);
            for(int i=0; i<phone.length; i++){
                String queryTwo ="INSERT INTO manager_contact(Mid, contact_no) VALUES ("+id+","+phone[i]+");";
                stmt.execute(queryTwo);
            }
          
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean DisplayData(JTable ManagerTable){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT manager.managerID, manager.manager_name, manager_contact.contact_no "
                        +  "FROM manager_contact JOIN manager ON manager_contact.Mid= manager.managerID";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                do{
                    String id = String.valueOf(rs.getInt("managerID"));
                    String name = rs.getString("manager_name");
                    String phone = String.valueOf(rs.getInt("contact_no"));
                    
                    String tbData[] = {id, name, phone};
                    DefaultTableModel model = (DefaultTableModel) ManagerTable.getModel();
                    model.addRow(tbData);
                }while(rs.next());
            }
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean SearchManagerData(int idIn, JTable ManagerTable){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT manager.managerID, manager.manager_name, manager_contact.contact_no "
                        +  "FROM manager_contact JOIN manager ON manager_contact.Mid= manager.managerID WHERE managerID="+idIn+";";//using JOIN clause to retrieve data from two tables at once
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                do{
                    String id = String.valueOf(rs.getInt("managerID"));
                    String name = rs.getString("manager_name");
                    String phone = String.valueOf(rs.getInt("contact_no"));
                    
                    String tbData[] = {id, name, phone};
                    DefaultTableModel model = (DefaultTableModel) ManagerTable.getModel();
                    model.addRow(tbData);
                }while(rs.next());
            }
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    //SearchData method only for UPDATE and DELETE functions
    public boolean SearchData(int idIn){
        try{
             Statement stmt = conn.createStatement();
            String query = "SELECT manager.managerID, manager.manager_name, manager_contact.contact_no "
                        +  "FROM manager_contact JOIN manager ON manager_contact.Mid= manager.managerID WHERE managerID="+idIn+";"; //using JOIN clause to retrieve data from two tables at once
            ResultSet rs = stmt.executeQuery(query);
              while(rs.next()){
                do{
                    System.out.println("searched successfully");
                }while(rs.next());
            }
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean UpdateManagerData(int id, int phone[], String name){
        try{
            Statement stmt = conn.createStatement();
            if(SearchData(id)){
                String query="UPDATE manager SET manager_name = '"+name+"' WHERE managerID="+id+";";
                stmt.executeUpdate(query);
                
                for(int i=0; i<phone.length;i++){ //to retrieve both phone numbers within the phone[]
                    String queryTwo = "UPDATE manager_contact SET contact_no="+phone[i]+" WHERE Mid="+id+";"; //repeats with the same id to store seperately
                    stmt.executeUpdate(queryTwo);
                }
            }
            return true;
        }catch(NumberFormatException | SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean DeleteManagerData(int id){
        try{
            Statement stmt = conn.createStatement();
            if(SearchData(id)){//check whether the data is available or not
                String query="DELETE FROM manager WHERE managerID="+id+"; DELETE FROM manager_contact WHERE Mid="+id+"";
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
