package LeetCode.learn;

interface InnerAbstractClass {

    static void add(){
    }    
}
class call implements InnerAbstractClass{
    static void add(){
        System.out.println("Hello");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        call c = new call();
        c.add();
    }
}
