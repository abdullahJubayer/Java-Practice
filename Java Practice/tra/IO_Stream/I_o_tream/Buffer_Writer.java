/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_o_tream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author jubayer
 */
public class Buffer_Writer {
    public static void main(String ae[]){
        try{
        String s;
        String s1;
        Scanner obj=new Scanner(System.in);
        s=obj.nextLine();
        s1=obj.nextLine();
        File F=new File("/home/jubayer/Desktop/Untitled Document 1");
        BufferedWriter R=new BufferedWriter(new FileWriter(F,true));
        R.write(s);
        R.write(s1);
        R.close();
        System.out.println("Write");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
    
}
