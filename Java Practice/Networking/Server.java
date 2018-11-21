/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.io.*;
import java.net.*;

/**
 *
 * @author jubayer
 */
public class Server {
    public Server(){
        try {
            ServerSocket server=new ServerSocket(3000);
            System.out.println("server bindead at "+((server.getInetAddress()).getLocalHost()).getHostAddress()+":3000");
            System.out.println("Server Running");
            Socket ss=server.accept();
            BufferedReader in=new BufferedReader(new InputStreamReader(ss.getInputStream()));
            System.out.println(in.readLine());
            PrintStream out=new PrintStream(ss.getOutputStream());
            out.print("Welcome by Server\n");
            out.flush();
            out.close();
            in.close();
        } 
        catch (IOException ex) {
            System.err.println("ERROR:"+ex);
        }
    }
    public static void main(String[] args) {
        new Server();
    }
}
