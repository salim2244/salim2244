package CharPattern;

public class CharE {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= m; j++){
                if(i%2 != 0 ||  j == 1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
