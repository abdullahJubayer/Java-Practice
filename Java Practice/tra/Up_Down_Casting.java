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
class AAA{
    
}
class BB extends AAA{
}
public class Up_Down_Casting {
    public static void main(String ar[]){
        AAA Obj=new BB();//UP Casting
        BB OBj=(BB) new AAA();//DOWN Casting
        AAA UP=new AAA();
        BB DOWN=new BB();
        
        UP=DOWN;//UP Casting
        DOWN =(BB)UP;//Down Casting
        
    }
}
