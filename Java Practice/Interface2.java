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
interface Gg{
    int two(int a,int b);
 }
interface Gh{
    int Two();
}
class Az implements Gg,Gh{
    @Override
    public int two(int a,int b){
        int x=a;
        int y=b;
        System.out.println("Addition is:"+(x+y));
           return 0;
    }
    @Override
        public int Two(){
            System.out.println("This is Second Interface");
            return 0;
        }
}
public class Interface2 {
    public static void main(String ar[]){
    Az obj=new Az();
    obj.two(5, 6);
    obj.Two();
    }
}
