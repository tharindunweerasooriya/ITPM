/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dilshan
 */
public class DBConnect_2 {
    
    public static Connection connect() {
    
     Connection con = null;
     
        try {
            Class.forName("org.sqlite.JDBC");
            con =DriverManager.getConnection("jdbc:sqlite:timetable.db");
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnect_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
            
        
}
}
