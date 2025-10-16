import java.util.Scanner;


public class Practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // n_to_1(num);
        // one_to_n(num);
        // both(num);
    }

    // Print  the number from n to 1
    static void n_to_1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        n_to_1(n-1);
    }

    //print n to 1
    static void one_to_n(int n){
        if(n == 0){
            return;
        }
        one_to_n(n-1);
        System.out.println(n);
    }

    // print n to 1 and 1 to n
    static void both(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}