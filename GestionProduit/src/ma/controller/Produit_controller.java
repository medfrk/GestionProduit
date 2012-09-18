package ma.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.DB.BD;
import ma.model.Commande_model;
import ma.model.Produit_model;

public class Produit_controller
{

    public Produit_model get_produit_by_libelle(String libelle)
    {
      BD.createStatement();
           String sql="SELECT * from produit where lib_produit ='"+libelle +"')" ;
              Produit_model produit =new Produit_model();
        try {       
            ResultSet resultat =  BD.stmt.executeQuery(sql);
          
            while (resultat.next())
            {
               
                
                
                 produit.setN_Produit(resultat.getInt("N_Produit"));
                 produit.setLib_Produit(resultat.getString("Lib_Produit"));
                 produit.setPrix_U(resultat.getDouble("Prix_U"));
                 produit.setStock(resultat.getInt("Stock"));
                 produit.setId_produit(resultat.getInt("id_Produit"));
                 
                
                
               
            }
            resultat.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return produit;
          
        
    }
    public void ajouterproduit(Produit_model produit)
    {
          String sql="INSERT INTO produit("
                  + "N_Produit,"
                  + "Lib_Produit,"
                  + "Prix_U,Stock)"
                  + "("+produit.getN_Produit()+","
                  + ""+produit.getLib_Produit()+","
                  + ""+produit.getPrix_U()+","
                  + ""+produit.getStock()+")";
       BD.execute_update(sql);
    }
    public void modifierproduit(Produit_model produit)
    {
           String sql="update  produit set("
                  + "N_Produit,"
                  + "Lib_Produit,"
                  + "Prix_U,Stock)"
                  + "("+produit.getN_Produit()+","
                  + ""+produit.getLib_Produit()+","
                  + ""+produit.getPrix_U()+","
                  + ""+produit.getStock()+")";
       BD.execute_update(sql);
        
    }

    public void supprimer_produit(Produit_model produit)
            
    {
         String sql="delete from produit where Lib_Produit="+produit.getLib_Produit(); 
                  BD.execute_update(sql);
    }

 public ArrayList getallproducts()
    {
      BD.createStatement();
           String sql="SELECT lib_produit from produit" ;
              
        ArrayList <String> list =new ArrayList<>();
        try {       
            ResultSet resultat =  BD.stmt.executeQuery(sql);
          
            while (resultat.next())
            {                       
                        
                String libproduit = resultat.getString("Lib_Produit");
                list.add(libproduit);
                
            }
            resultat.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return list;
          
        
    }   
}
 