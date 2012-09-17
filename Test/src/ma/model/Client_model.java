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

    private int id_Client;
    private String N_CIN;
    private String Nom;
    private String Tel;

    public int getId_Client()
    {
        return id_Client;
    }

    public void setId_Client(int id_Client)
    {
        this.id_Client = id_Client;
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
