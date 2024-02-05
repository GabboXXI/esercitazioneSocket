/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.socket_5d;
import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author Studenti
 */
public class Socket_5D {

    public static void main(String[] args) {
        ServerStr servente = new ServerStr();
        servente.attendi();
        servente.comunica();
    }
}
