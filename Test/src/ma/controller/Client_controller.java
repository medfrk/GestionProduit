package ma.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.DB.BD;
import ma.model.Client_model;

public class Client_controller
{

    private String sql;

    public ArrayList getclientnom(String nom)
    {
        BD.createStatement();
        sql = "SELECT Nom FROM Client where Nom=" + nom;
        ArrayList<Client_model> list = new ArrayList<Client_model>();
        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);

            while (resultat.next())
            {
                Client_model client = new Client_model();
                //client.setID_client(resultat.getInt("ID_client"));
                client.setN_CIN(resultat.getString("N_CIN"));
                client.setNom(resultat.getString("Nom"));
                client.setTel(resultat.getString("Tel"));

                list.add(client);
            }
            resultat.close();

        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return list;
    }

    public ArrayList getclientcin(String cin)
    {
        BD.createStatement();

        sql = "SELECT Nom FROM Client where N_CIN = " + cin;
        ArrayList<Client_model> list = new ArrayList<Client_model>();
        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);

            while (resultat.next())
            {
                Client_model client = new Client_model();
                //client.setID_client(resultat.getInt("ID_client"));
                client.setN_CIN(resultat.getString("N_CIN"));
                client.setNom(resultat.getString("Nom"));
                client.setTel(resultat.getString("Tel"));

                list.add(client);
            }
            resultat.close();

        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return list;
    }

    public ArrayList getclienttelephone(String telephone)
    {
        BD.createStatement();
        sql = "SELECT Tel FROM Client where Tel = " + telephone;
        ArrayList<Client_model> list = new ArrayList<Client_model>();
        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);

            while (resultat.next())
            {
                Client_model client = new Client_model();
//                 client.setID_client(resultat.getInt("ID_client"));
                client.setN_CIN(resultat.getString("N_CIN"));
                client.setNom(resultat.getString("Nom"));
                client.setTel(resultat.getString("Tel"));

                list.add(client);
            }
            resultat.close();

        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return list;
    }

    public void modifierclient(Client_model client)
    {
        BD.createStatement();
        sql = "UPDATE  Client SET N_CIN=" + client.getN_CIN().toString() + " Nom=" + client.getNom() + " Tel=" + client.getTel() + "  where N_CIN =" + client.getN_CIN();

        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);

            resultat.close();

        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();

    }

    public void supprimerrclient(Client_model client)
    {
        BD.createStatement();
        sql = "delete client where N_CIN=" + client.getN_CIN();
        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);
            resultat.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
    }

    public void ajouterclient(Client_model client)
    {
        BD.createStatement();
        sql = "insert into  Client (N_CIN,Nom,Tel) values ('" + client.getN_CIN().toString() + "','" + client.getNom() + "','" + client.getTel() + "')";

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
