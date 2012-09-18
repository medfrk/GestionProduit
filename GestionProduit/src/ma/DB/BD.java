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
import ma.controller.Client_controller;
//import ma.view.Fichier;
//ADIL OKBANI
/**
 *
 * @author Administrateur
 */
public class BD
{

    private final static String dbURL = "jdbc:mysql://localhost:3306/stock";
    private static Connection conn = null;
    public static Statement stmt = null;

    private static void createConnection()
    {
        try
        {
            conn = DriverManager.getConnection(dbURL, "root", "067447105");
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void createStatement()
    {
        createConnection();
        try
        {
            stmt = conn.createStatement();
        } catch (SQLException ex)
        {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void closestatment()
    {
        try
        {
            stmt.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeconn();
    }

    private static void closeconn()
    {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (conn != null)
            {
                //DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }
        } catch (SQLException ex)
        {
        }

    }

    public static void execute_update(String sql)
    {
        BD.createStatement();
        try
        {
            BD.stmt.executeUpdate(sql);
        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
    }
}