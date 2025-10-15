
// public class Function_Call{
//     public static void main(String[] args){
//     print();
//     }

//     static void print(){
//         System.out.println("Muskan Kumar");
//         print1();
//     }
//     static void print1(){
//         System.out.println("Muskan Kumar");
//         print2();
//     }
//     static void print2(){
//         System.out.println("Muskan Kumar");
//         print3();
//     }
//     static void print3(){
//         System.out.println("Muskan Kumar");
//         print4();
//     }
//     static void print4(){
//         System.out.println("Muskan Kumar");
//     }
// }



// public class Function_Call{
//     public static void main(String[] args){
//         // write a function that takes in a number and prints it 
//         // print first 5 numbers: 1 2 3 4 5
//         num(1);
//     }
    
//     static void num(int n){
//         System.out.println(n);
//         num1(2);
//     }
//     static void num1(int n){
//         System.out.println(n);
//         num2(3);
//     }
//     static void num2(int n){
//         System.out.println(n);
//         num3(4);
//     }
//     static void num3(int n){
//         System.out.println(n);
//         num4(5);
//     }
//     static void num4(int n){
//         System.out.println(n);
//     }
// }



public class Function_Call{
    public static void main(String[] args){
        nums(1);
    }
    static void nums(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        nums(n+1);
    }
}