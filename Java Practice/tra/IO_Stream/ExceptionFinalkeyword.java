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
public class ExceptionFinalkeyword {
    public void yy(int x,int y){
        try{
        int a=x;
        int b=y;
        System.out.println(a/b);
    }
       catch(Exception e){
            System.out.println("Error");
        }
       finally{
            System.out.println("Program run");
       }
    }
    public static void main(String ar[]){
        ExceptionFinalkeyword Obj=new ExceptionFinalkeyword();
        int a,b;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        Obj.yy(a,b);
    }
}
