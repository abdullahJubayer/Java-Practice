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
 class Single_ton_pattern_private_constructora {
    private static final int ONE=1;
    private static final int TOW=2;
    private static final int THREE=3;
    private Single_ton_pattern_private_constructora obj=null;
    private Single_ton_pattern_private_constructora abdullah(){
        if(obj==null){
            obj=new     Single_ton_pattern_private_constructora();
        }
        return obj;
     
    }
    public void nn(int a){
        System.out.println(a);
    }
}
public class Single_ton_pattern_private_constructor {

    public static void main(String ar[]){
    Single_ton_pattern_private_constructora oaa=new Single_ton_pattern_private_constructora();
    oaa.nn(5);

            }

}
