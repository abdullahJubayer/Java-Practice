/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import com.sun.org.apache.xerces.internal.dom.CoreDOMImplementationImpl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jubayer
 */
public class Tik extends Thread{
    @Override
    public void run(){
         try {
        for(int i=0;i<10;i++){
            System.out.print("Tik  ");
                Thread.sleep(500);
                synchronized(Tik_Tok.Obj){
                    Tik_Tok.Obj.notify();
                    Tik_Tok.Obj.wait();
                }
        }
    }catch (InterruptedException ex) {
                System.err.println("Exception");
            }
    }
}
