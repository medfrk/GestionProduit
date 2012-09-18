/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import ma.DB.BD;
import ma.model.Commande_model;
import ma.model.Client_model;
public class Commande_controller
{

    private String sql;

    public ArrayList getCommandeBy_nom(String nom)
    {
        BD.createStatement();
            sql="SELECT id_commande,id_Produit,Quantite,TVA"
                    + " FROM Commande WHERE id_client=("
                    + "select id_client from client where Nom='"+nom +"')" ;
              ArrayList<Commande_model> list= new ArrayList<Commande_model>();
        try {       
            ResultSet resultat =  BD.stmt.executeQuery(sql);
          
            while (resultat.next())
            {
                Commande_model commande =new Commande_model();
                
                 commande.setId_Client(resultat.getInt("id_Client"));
                 commande.setId_Produit(resultat.getInt("id_Produit"));
                 commande.setTVA(resultat.getDouble("TVA"));
                 commande.setQuantite(resultat.getInt("Quantite"));
                 commande.setId_commande(resultat.getInt("id_commande"));
                 
                
                
                list.add(commande);
            }
            resultat.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return list;
        
    }

    public void ajouterCommande(Commande_model commande) 
    {
      
        String sql="INSERT INTO commande(id_Client,id_Produit,Quantite,TVA)("+commande.getId_Client()+","+commande.getId_Produit()+","+commande.getQuantite()+","+commande.getTVA()+")";
       BD.execute_update(sql);
    }

    public void modifierCommande(Commande_model commande)
    {
        
         String sql="update commande set (id_Client,id_Produit,Quantite,TVA)("+commande.getId_Client()+","+commande.getId_Produit()+","+commande.getQuantite()+","+commande.getTVA()+")";
       BD.execute_update(sql);
    }

    public void supprimerCommande(Commande_model commande)
    {
         String sql="delete from Commande where id_commande="+commande.getId_commande(); 
       BD.execute_update(sql);
    }
}
