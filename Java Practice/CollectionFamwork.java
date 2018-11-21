/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra;

import java.util.*;

/**
 *
 * @author jubayer
 */
public class CollectionFamwork {
    public static void main(String ar[]){
       List o=new LinkedList();
       o.add("abdullah");
       o.add("jbayer");
       o.add("Topu");
       o.add("jubayer");
       print(o);
       Set s=new HashSet();
       s.add("abdullah");
       s.add("jbayer");
       s.add("Topu");
       s.add("jubayer");
       print(s);
       
       LinkedHashSet uu=new  LinkedHashSet();
       uu.add("abdullah");
       uu.add("jbayer");
       uu.add("Topu");
       uu.add("jubayer");
       print(uu);
       
       SortedSet ss=new TreeSet();
       ss.add("abdullah");
       ss.add("jbayer");
       ss.add("Topu");
       ss.add("jubayer");
       print(ss);
       
       SortedMap mm=new TreeMap();
       mm.put("jubayer" ,"abdullah");
       mm.put("abdulah","jbayer");
       mm.put("Topu","Rabanni");
       mm.put("jubayer","abdulalh");
       print(mm.keySet());
       print(mm.values());
       
    }

    private static void print(Collection o) {
      Iterator i=o.iterator();
      while(i.hasNext()){
          String rr=(String)i.next();
          System.out.print(rr+" ");
      }
      System.out.println();
    }
}
