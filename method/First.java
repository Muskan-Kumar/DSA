import java.util.Scanner;

public class First{
    public static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
    //Q:take input of 2 no. and print the sum
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a=sc.nextInt();
    System.out.print("Enter second number: ");
    int b=sc.nextInt();
    int res=sum(a,b);
    System.out.print("Sum = "+res);
    }
}