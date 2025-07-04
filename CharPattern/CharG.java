package CharPattern;

public class CharG {
    public static void main(String[] args){
        int n = 5;
        int m = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || j==2 || j==3){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
