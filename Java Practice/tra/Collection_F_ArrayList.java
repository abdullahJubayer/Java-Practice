/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jubayer
 */
public class Collection_F_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> Obj=new ArrayList();
        System.out.println("Size::"+Obj.size()+" Elements::"+Obj);
        Obj.add("A");
         Obj.add("B");
          Obj.add("C");
           Obj.add("D");
            Obj.add("E");
             Obj.add("F");
              Obj.add("G");
              System.out.println("Using Advanced for Loop");
              System.out.println("Size::"+Obj.size()+"     Elements::"+Obj);
    for(String sr:Obj){
        System.out.println(sr);
    }          
        Iterator <String> Iter=Obj.iterator();
        System.out.println("Using Iterator");
        System.out.println("Size::"+Obj.size()+"     Elements::"+Obj);
        while(Iter.hasNext()){
            System.out.println(Iter.next());
    }
    }
}
