/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jubayer
 */
class Thrd extends Thread{
     void Run(){
        System.out.println("extends Thread");
        start();
    }
    @Override
    public void run(){
       try {
        for(int i=0;i<5;i++){
            System.out.println(i);
                sleep(1000);
        }
            } 
       catch (InterruptedException ex) {
                System.out.println(" InterruptedException");
            }

    }
}
public class One implements Runnable{
    public static void main(String ap[]){
        Thrd Obj=new Thrd();
        Obj.Run(); 
        One tt=new One();
        tt.run();
    }
  
    @Override
     public void run(){
         try{
     System.out.println("implements Thread");
     for(int i=0;i<5;i++){
         System.out.println(i); 
     }
     sleep(500);
}
         catch(Exception e){
             System.out.println("InterruptedException");
         }
    
}
}