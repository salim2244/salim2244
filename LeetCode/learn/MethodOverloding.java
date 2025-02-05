package LeetCode.learn;

public class MethodOverloding {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 10;

        MethodOverloding lj = new MethodOverloding();
        int ans2 = lj.addtwo(a, b);
        int ans3 = lj.addtwo(a, b, c);
        System.out.println(ans2);
        System.out.println(ans3);
        
    }
    public int addtwo(int a, int b){
        return a+b;
    } 
    public int addtwo(int a, int b, int c){
        return a+b+c;
    } 
}
