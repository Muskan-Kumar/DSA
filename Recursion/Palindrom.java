
public class Palindrom{
    static int sum = 0;
    public static void main(String[] args){
        palindrom(12321);
    }
    static void palindrom(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        palindrom(n/10);
        
        if(n == sum){
            System.out.println("Palindrom");
        }
    }
}