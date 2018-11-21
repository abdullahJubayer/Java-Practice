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
public class Tik_Tok {
    public static final Tik_Tok Obj=new Tik_Tok();
    public static void main(String[] args) throws InterruptedException {
        Tik Obj1=new Tik();
        Tok Obj2=new Tok();
        Obj1.start();
        Obj2.start();
        Obj1.join();
        Obj2.join();
        System.out.println("Finished");
    }
}
