/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jubayer
 */
public class ThrowsAndThrows {
    public static void aa(int a)/*throws ArithmeticException*/{
        if(a<10){
          throw new ArithmeticException("not pass");  
        }
        else{
            System.out.println("pass");
    }
    }
    public static void main(String ar[]){
        int z=2;
        try{
            aa(z);
        }
        catch(ArithmeticException e){
          System.err.println("Exception");
        }
    }
    
}
