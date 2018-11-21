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
public class ToString_method {
    public String toString(String a,String b){
        return a+""+b;
    }
    public static void main(String ara[]){
        ToString_method obj=new ToString_method();
        System.out.println(obj.toString("abdullah","jubayer"));
    }
}
