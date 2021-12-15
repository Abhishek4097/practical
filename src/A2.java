 class A2 {
    void show(){
        System.out.println("super class");
    }
}
class B2 extends A2{
    void show(){
        System.out.println("sub class");
    }
    void disp(){
        System.out.println("sub2 class");
    }
}
class Main{
    public static void main(String[] args){
        B2 a=new B2();
        a.disp();
        a.show();
    }
}
