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
public class Tok extends Thread{
    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                synchronized(Tik_Tok.Obj){
                    Tik_Tok.Obj.wait();
                }
                System.out.println("Tok");
                Thread.sleep(500);
            synchronized(Tik_Tok.Obj){
                Tik_Tok.Obj.notify();
                //Tik_Tok.Obj.wait();
            }
            }
        } catch (Exception e) {
        }
    }
}
