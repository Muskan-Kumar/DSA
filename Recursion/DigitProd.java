
public class DigitProd{
    public static void main(String[] args){
        System.out.println(digitProd(1342));
    }
    static int digitProd(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10)*digitProd(n/10);
    }
}