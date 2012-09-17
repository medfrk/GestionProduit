/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class BD {

    
    
    public static void main(String args[]){
    createStatement();
    int i=0;
    closestatment();
    
    }
    private final static String dbURL = "jdbc:mysql://192.168.2.125:3306/ged";
    
    // jdbc Connection
    private static Connection conn = null;
    public static Statement stmt = null;

    private static void createConnection() {
        try {
            conn = DriverManager.getConnection(dbURL,"root","067447105");
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void createStatement() {
        createConnection();
                     
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void closestatment() {
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeconn();
    }

    private static void closeconn() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                //DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }
        } catch (SQLException ex) {
        }

    }
}
