/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra;

/**
 *
 * @author jubayer
 */


    /**
     * @param args the command line arguments
     */
    class tt{

            int x;
            String name;
           tt(int x,String name){
            this.x=x;
            this.name=name;
        }
           void mm(){
               System.out.print(x+name);
               
           }
           void yy(String ar[]){
              Tra tx=new Tra();
              tx.dd(this);
           }
    }

public class Tra {
    void dd(tt tx){
        tx.mm();
    }
}
