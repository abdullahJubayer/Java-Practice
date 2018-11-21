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
public class Recurtion {
    static int mai(int n){
        if(n==0){
            return 1;
        }
        return n*mai(n-1);
    }
   public static void main(String at[]){
       System.out.println(mai(5));
   } 
}
