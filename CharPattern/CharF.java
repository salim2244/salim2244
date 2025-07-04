package CharPattern;

public class CharF {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=m; j++){
                if(i%2 !=0 || j == 1 ){
                    System.out.print("*");
                }
                else if(i == n){
                    System.out.print("0");
                }else{
                    System.out.print("k");
                }
            }
            System.out.println();
        }
    }
}
