/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra;

import java.util.Arrays;

/**
 *
 * @author jubayer
 */class ss{

 }
public class Enum_main {
           public  enum Enum{
     SUN(2),NOM(3),TUES(4),WED(5),THUS(6),FRI(77);
     public int val;

        private Enum(int val) {
            this.val=val;
        }
    }
    public static void main(String ar[]){
        for(Enum ss:Enum.values()){
            System.out.println(ss.val);
        }
    }
}

