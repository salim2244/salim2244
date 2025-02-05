package LeetCode.learn;

public class Inheritance {
    public static void main(String[] args) {
        int a = 10; 
        int b = 20;
        Child c = new Child();
        int ans = c.add(a,b);
        System.out.println(ans);
    }
}
class Parent{
    public int add(int a, int b){
        return a + b;
    }
}
class Child extends Parent{
    public int add(int a, int b){
        return a + b;
    }
}