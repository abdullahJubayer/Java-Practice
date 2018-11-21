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
public class ConvertArray_to_List {
    public static void main(String[] args) {
        String ar[]=new String[]{"A","b","c","d"};
        List <String> l=Arrays.asList(ar);
        //l.remove(3);
        Iterator<String> iter=l.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            
        }
    }
}
