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
public class Generec_typeClass_Method <T>{
    private T r;
    T rr(T r){
        return r;
    }
    public static void main(String ar[]){
        Generec_typeClass_Method<Double> jj=new Generec_typeClass_Method();
        Generec_typeClass_Method<String> ll=new Generec_typeClass_Method();
        System.out.println(jj.rr(285138.8878));
        System.out.println(ll.rr("abdullah"));
    }

}