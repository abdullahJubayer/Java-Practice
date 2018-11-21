/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra;

/**
 *
 * @author jubayer
 */abstract class Ax{
     abstract void print();
     abstract int mm(int m,int n);
     void printx(){
         System.out.println("It is not abstract method");
     }
 }
class BBx extends Ax{
    @Override
    void print(){
        System.out.println("it is abstract method");
    }
    @Override
    int mm(int m,int n){
       return m+n; 
    }
}
class CCx extends Ax{
    @Override
    void print(){
       System.out.println("Its calling");
    }
    @Override
    int mm(int m,int n){
     return m*n;   
    }
}
public class Abstract_class {
    public static void main(String ar[]){
        BBx obj=new BBx();
        CCx obj2=new CCx();
   obj.print();
   System.out.println("summation is:"+obj.mm(5, 5));
      obj2.print();
    System.out.println("Multiply is:"+obj2.mm(5, 5));
    }
}
