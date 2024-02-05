package com.mycompany.socket_5d;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Studenti
 */

import java.io.*;
import java.net.*;
import java.util.*;


public class ServerStr extends Exception{
    ServerSocket server = null;
    Socket client = null;
    String stringaRicevuta = null;
    String stringaModificata = null;
    BufferedReader  inDalClient;
    DataOutputStream outVersoClient;
    public Socket attendi(){
        try{
            System.out.println("1 SERVER partito in esecuzione...");
            server = new ServerSocket(6789);
            client = server.accept();
            server.close();
            inDalClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outVersoClient = new DataOutputStream(client.getOutputStream());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Errore durante l'istanza server !");
            System.exit(1);
        }
        return client;
    }   
    
    public void comunica(){
        try {
            System.out.println("3 benvenuto client, scrivi una frase e la trasformo in maiuscolo, Attendo...");
            stringaRicevuta = inDalClient.readLine();
            System.out.println("6 ricevuta la stringa dal client : "+ stringaRicevuta);
            outVersoClient.writeBytes(stringaModificata+'\n');
        } catch (Exception e) {
            System.out.println("9 SERVER: fine elaborazione ... buona notte!");
            client.close();
        }
    }
}