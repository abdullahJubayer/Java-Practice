/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jubayer
 */
public class Casting_array_to_list {
    public static void main(String ata[]){
        String ar[]=new String[]{"abdullah","jubayer"};
       /* int i=0;
       while(i<2){
        System.out.println(ar[i]);
        i++;    
        }*/
       List a=Arrays.asList(ar);//casting array to List
      //use Iterator to print List
       Iterator ii=a.iterator();
       while(ii.hasNext()){
           System.out.print(ii.next()+" ");
       }
       //use for loop for print List
       for(int i=0;i<2;i++){
           System.out.print(a.get(i));
       }
       //use while loop for print List
       int i=0;
       while( i<2) {
        System.out.print(a.get(i));
        i++;
    }
}


}
