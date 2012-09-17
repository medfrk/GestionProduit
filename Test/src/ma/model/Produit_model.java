/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.model;

/**
 *
 * @author designer
 */
public class Produit_model
{

    private int N_Produit;
    private String Lib_Produit;
    private double Prix_U;
    private int Stock;

    public String getLib_Produit()
    {
        return Lib_Produit;
    }

    public void setLib_Produit(String Lib_Produit)
    {
        this.Lib_Produit = Lib_Produit;
    }

    public int getN_Produit()
    {
        return N_Produit;
    }

    public void setN_Produit(int N_Produit)
    {
        this.N_Produit = N_Produit;
    }

    public double getPrix_U()
    {
        return Prix_U;
    }

    public void setPrix_U(double Prix_U)
    {
        this.Prix_U = Prix_U;
    }

    public int getStock()
    {
        return Stock;
    }

    public void setStock(int Stock)
    {
        this.Stock = Stock;
    }
    
}
