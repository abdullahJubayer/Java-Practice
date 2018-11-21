/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jubayer
 */
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String ar[]){
        try{
        int x=0;
        int y=345/x;
       // int  v[]=new int[2];
        System.out.println("Exception handling");
        //System.out.println(v[3]);
    }
        catch(ArithmeticException e){
            System.out.println("Exception catch:"+e);
            System.err.println("Exception catch:"+e);
            e.printStackTrace();
           
        }
        
        /*finally{
            System.out.println("Exception catch");
        }*/
}
}