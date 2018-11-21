package tra;

class Main_class{
    
    private int a=200;
    void nested(){
         int v=300;
        class B{
            void msg(){
                System.out.println("This  is Inner class and its valulle is"+v);
            }
        }
        B obj=new B();
        obj.msg();
        //?obj.v=200;
    }

}
class Nested_class{
        public static void main(String ar[]){
       Main_class obj=new Main_class();
        obj.nested();
    }
}