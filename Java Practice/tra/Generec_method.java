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
public class Generec_method {
    public <E>void rr(E r){
        E t=r;
        System.out.println(t);
    }
    public static void main(String as[]){
        int e=285238;
        String s="abdullah jubayer";
        Generec_method tt=new Generec_method();
        tt.rr(e);
        tt.rr(s);
    }
}
