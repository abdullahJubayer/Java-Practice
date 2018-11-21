/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

/**
 *
 * @author jubayer
 */
public class Client {
    public Client(){
        try {
            Socket socket=new Socket("localHost",3000);
            System.out.println("Client Connected");
            PrintStream PP=new PrintStream(socket.getOutputStream());
           PP.print("Hello From client\n ");
            PP.flush();
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
            in.close();
            PP.close();
        } catch (IOException ex) {
            System.out.println("Error:"+ex);
        }
    }
    public static void main(String[] args) {
        new Client();
    }
}
