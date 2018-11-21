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
public class LOcal_global_variable {
   private int tt;
    public int x,y;
    static int uu; 
    public static int rr;
        void bb(int x,int y){
            int c;
            this.x=x;
            this.y=y;
            uu=99;
            System.out.println(x+y);
            System.out.println(uu);

    }
    public static void main(String ar[]){
        LOcal_global_variable o=new LOcal_global_variable();
        int y=99;
       o.bb(6,7);
    }
    
}
