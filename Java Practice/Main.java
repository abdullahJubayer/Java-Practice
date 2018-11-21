package tra;
class Main implements Abdullah,Jubayer{
    Main(){
       // A=20;
       System.out.println("A="+A);
    }
    public static void main(String ar[]){
        Main ob = new Main();
        ob.print();
        ob.printx();
    }
    @Override
    public void print(){
        System.out.println("it is print");
    }
    @Override
    public void printx(){
        System.out.println("It is printx");
    }
    @Override
    public void jubaye(){
        System.out.println("it is JUbayaer");
    }
}