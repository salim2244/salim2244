public class Pelindrom {
    public boolean isPalindrome(int x) {
        if(x < 0 ||( x % 10 == 0 && x != 0)){
            return false;
        }
        int reversed = 0;
        int original = x;

        while (x > 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
    public static void main(String[] args) {
        int n = 121;
        Pelindrom pd = new Pelindrom();
        System.out.println(pd.isPalindrome(n));
    }
}
