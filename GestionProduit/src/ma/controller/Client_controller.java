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
        sql = "SELECT * FROM Client where Nom = '" + nom + "'";
        ArrayList<Client_model> list = new ArrayList<>();
        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);

            while (resultat.next())
            {
                Client_model client = new Client_model();
                client.setID_client(resultat.getInt("ID_client"));
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

    public Client_model getclientcin(String cin)
    {
        BD.createStatement();

        sql = "SELECT Nom FROM Client where N_CIN = " + cin;
        Client_model client = new Client_model();
        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);

            while (resultat.next())
            {

                client.setID_client(resultat.getInt("ID_client"));
                client.setN_CIN(resultat.getString("N_CIN"));
                client.setNom(resultat.getString("Nom"));
                client.setTel(resultat.getString("Tel"));


            }
            resultat.close();

        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return client;
    }

    public Client_model getclienttelephone(String telephone)
    {
        BD.createStatement();
        sql = "SELECT Tel FROM Client where Tel = " + telephone;
        Client_model client = new Client_model();
        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);

            while (resultat.next())
            {

                client.setID_client(resultat.getInt("ID_client"));
                client.setN_CIN(resultat.getString("N_CIN"));
                client.setNom(resultat.getString("Nom"));
                client.setTel(resultat.getString("Tel"));


            }
            resultat.close();

        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return client;
    }

    public void modifierclient(Client_model client)
    {

        String sql = "UPDATE  Client SET N_CIN=" + client.getN_CIN().toString() + " Nom=" + client.getNom() + " Tel=" + client.getTel() + "  where id_client =" + client.getID_client();
        BD.execute_update(sql);

    }

    public void supprimerrclient(Client_model client)
    {

        String sql = "delete from client where ID_client=" + client.getID_client();
        BD.execute_update(sql);
    }

    public void ajouterclient(Client_model client)
    {

        String sql = "insert into client(N_cin,NOM,Tel) values('" + client.getN_CIN()
                + "','" + client.getNom()
                + "','" + client.getTel()
                + "'  )";
        BD.execute_update(sql);
    }

    public ArrayList getallclients()
    {
        BD.createStatement();
        sql = "SELECT Nom FROM Client ";
        ArrayList<String> list = new ArrayList<>();
        try
        {
            ResultSet resultat = BD.stmt.executeQuery(sql);

            while (resultat.next())
            {
                Client_model client = new Client_model();

//                 client.setID_client(resultat.getInt("ID_client"));
//                 client.setN_CIN(resultat.getString("N_CIN"));
                String Nom_Client = resultat.getString("Nom");
//                 client.setTel(resultat.getString("Tel"));

                list.add(Nom_Client);
            }
            resultat.close();

        } catch (SQLException ex)
        {
            Logger.getLogger(Client_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        BD.closestatment();
        return list;
    }
}
