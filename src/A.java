public class A {
    int a,b,c;
    void add(){
        a=10;b=20;
        c=a+b;
        System.out.println("sum of two no is" + c);
    }
    void sub(){
        a=200;b=300;
        c=a-b;
        System.out.println("sub of two no is" + c);
    }
}
class B extends A {
    void multi(){
        a=10;b=20;
        c=a*b;
        System.out.println("multiplicaton of two no is" + c);
    }
    void div(){
        a=10;b=34;
        c=a/b;
        System.out.println("Divide of two no is" + c);
    }
}
class C extends B{
    void rem(){
        a=10;b=20;
        c=a%b;
        System.out.println("rem of two no is" + c);
    }
}
class Test{
    public static void main(String[] args) {
        C r=new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }
}
