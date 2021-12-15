public class A3 {
    void add(int...a){
        int sum=0;
        for (int x:a){
            sum=sum+x;
        }
        System.out.println("sum of no"+sum);
    }
}
class demo{
    public static void main(String[] args) {
        A3 r=new A3();
        r.add();
        r.add(10,56);
        r.add(12,45,78,78);
    }
}
