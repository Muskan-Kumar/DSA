import java.util.Scanner;


// print the factorial of a number

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }

    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
