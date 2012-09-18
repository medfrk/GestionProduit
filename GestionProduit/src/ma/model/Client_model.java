/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.model;

/**
 *
 * @author designer
 */
public class Client_model
{
    private String N_CIN;
    private String Nom;
    private String Tel;
    private int ID_client;

    public int getID_client()
    {
        return ID_client;
    }

    public void setID_client(int ID_client)
    {
        this.ID_client = ID_client;
    }

    public String getN_CIN()
    {
        return N_CIN;
    }

    public void setN_CIN(String N_CIN)
    {
        this.N_CIN = N_CIN;
    }

    public String getNom()
    {
        return Nom;
    }

    public void setNom(String Nom)
    {
        this.Nom = Nom;
    }

    public String getTel()
    {
        return Tel;
    }

    public void setTel(String Tel)
    {
        this.Tel = Tel;
    }
}
