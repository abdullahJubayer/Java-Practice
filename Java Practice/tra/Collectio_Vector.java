/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra;

import java.util.Vector;

/**
 *
 * @author jubayer
 */
public class Collectio_Vector {
    public static void main(String[] args) {
        Vector v=new Vector(3,5);
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        System.out.println("SiZe::"+v.capacity());
        v.addElement(4);
        System.out.println("Size::"+v.capacity());
        System.out.println(v.get(3));
    }
}
