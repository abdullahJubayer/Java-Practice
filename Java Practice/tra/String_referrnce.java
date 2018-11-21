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
public class String_referrnce {
    public static void main(String ar[]){
        String a="abdullah";
        String b="abdullah";
        String obj=new String("jubayer");
        String obj1=new String("jubayer");
        System.out.println(a==b);
        System.out.println(obj==obj1);
        System.out.println(a==obj);
    }
}
