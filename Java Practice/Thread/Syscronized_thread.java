/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author jubayer
 */
class Te extends Thread{
     void One(){
            start();
        }
    @Override
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                System.out.println(i);
            }
            sleep(1000);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
    
}
public class Syscronized_thread {

    public static void main(String ar[]){
        Te Obj=new Te();
        Obj.One();
       Te Obj1=new Te();
        Obj1.One();
    }
}
