class DiamondPyramid{
    public static void main(String args[]){
        int n = 5;
        int m = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=m;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}