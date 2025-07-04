package CharPattern;

public class CharBB {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            System.out.print("*");
            for(int j = 1; j<=1; j++){
                if(i%2==0 || j%2==0){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            for(int j = 1; j<=1; j++){
                if( i%2==1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
