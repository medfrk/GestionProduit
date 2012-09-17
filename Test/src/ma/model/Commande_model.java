/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.model;

/**
 *
 * @author designer
 */
public class Commande_model
{
    private int id_Client;
    private int id_Produit;
    private int Quantite;
    private double  TVA;

    public int getQuantite()
    {
        return Quantite;
    }

    public void setQuantite(int Quantite)
    {
        this.Quantite = Quantite;
    }

    public double getTVA()
    {
        return TVA;
    }

    public void setTVA(double TVA)
    {
        this.TVA = TVA;
    }

    public int getId_Client()
    {
        return id_Client;
    }

    public void setId_Client(int id_Client)
    {
        this.id_Client = id_Client;
    }

    public int getId_Produit()
    {
        return id_Produit;
    }

    public void setId_Produit(int id_Produit)
    {
        this.id_Produit = id_Produit;
    }
    
}
