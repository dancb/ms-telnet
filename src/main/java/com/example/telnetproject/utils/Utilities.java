package com.example.telnetproject.utils;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Utilities {

    private Utilities(){}

    public static String conexionTelnet(String ip, int port){

        try {
            Socket s1       = new Socket(ip, port);
            InputStream is  = s1.getInputStream();
            DataInputStream dis =new DataInputStream(is);

            if(dis!=null) {
                System.out.println("CONECTADO A "+ip+" PUERO "+port);
                return "CONECTADO A "+ip+" PUERO "+port;

            } else {
                System.out.println("CONEXION INVALIDA");
                return "CONEXION INVALIDA";

            }

        } catch (IOException e) {
            System.out.println("ERROR AL HACER TELNET --> " + e.getMessage());
            return "ERROR AL HACER TELNET --> " + e.getMessage();
        }

    }
}