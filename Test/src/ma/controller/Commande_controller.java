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
//import ma.controller.Client_controller;
import ma.model.Client_model;
public class Commande_controller
{
    private String sql;

    public void getCommandeBy_nom(Client_model client)
    {
        BD.createStatement();
            sql="SELECT id_commande,id_Client,id_Produit,Quantite,TVA FROM Client where id_client="+  client.getN_CIN();
              ArrayList<Commande_model> list= new ArrayList<>();
        try {       
            ResultSet resultat =  BD.stmt.executeQuery(sql);
          
            while (resultat.next())
            {
                
                
                 client.setNom(resultat.getString("Nom"));
                 client.setN_CIN(resultat.getString("N_CIN"));
                 client.setTel(resultat.getString("Tel"));
                
                list.add(client);
            }
            resultat.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
    }

    public void ajouterCommande(Commande_model commande,int id_client,int id_produit) throws SQLException
    {
        BD.createStatement();
        sql="INSERT INTO commande(id_Client,id_Produit,Quantite,TVA)("+id_client+","+id_produit+","+commande.getQuantite()+","+commande.getTVA()+")";
        BD.stmt.executeQuery(sql);
        BD.closestatment();
    }

    public void modifierCommande(Commande_model commande)
    {
        
    }

    public void supprimerCommande(Commande_model commande)
    {
    }
}
