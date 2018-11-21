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
class AA{
    private static int r=400;
    interface Inn{
        void print();
    }
}
public class Nestedinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   AA.Inn obj =new AA.Inn() {
       @Override
       public void print() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("Its override class");
       }
   };
   obj.print();
    }
    
}
