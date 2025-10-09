import java.util.Scanner;
// import java.util.Arrays;

// public class First{
//     public static void main(String[] args){
//         int[] arr=new int[5];
//         Scanner sc=new Scanner(System.in);

//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         for(int i:arr){
//             System.out.print(i+" ");
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }

// public class First{
//     public static void change(int[] arr){
//             arr[1]=100;
//         }

//     public static void main(String[] args){
        
//         Scanner sc=new Scanner(System.in);
//         int arr[]={1,2,3,4,5};
//         System.out.print(Arrays.toString(arr));
//         change(arr);
//         System.out.print(Arrays.toString(arr));
//     }
// }

//____Multi-dimension_____

// public class First{
//     public static void main(String[] args){
//         // int[][] arr=new int[3][];

//         // int[][] arr={
//         //     {1,2,3},
//         //     {4,5},
//         //     {6,7,8,9},
//         // };
//         // for(int i=0;i<arr.length;i++){
//         //     for(int j=0;j<arr[i].length;j++){
//         //         System.out.print(arr[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

//         Scanner sc=new Scanner(System.in);
//         int [][]arr=new int [3][2];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<2;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         // for(int i=0;i<3;i++){
//         //     for(int j=0;j<2;j++){
//         //         System.out.print(arr[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

//         // for(int i=0;i<arr.length;i++){
//         //     System.out.println(Arrays.toString(arr[i]));
//         // }

//         for(int[] a:arr){
//             System.out.println(Arrays.toString(a));
//         }
        
//     }
// }

//______Array List____

// import java.util.ArrayList;
// public class First{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         ArrayList<Integer> list=new ArrayList<>(10);
//         // list.add(10);
//         // list.add(10);
//         // list.add(10);
//         // list.add(10);
//         // list.add(10);
        
        
//         // list.set(0,100);
//         // list.set(2,200);
//         // list.remove(2);
//         // System.out.print(list);

//         for(int i=0;i<5;i++){
//             list.add(sc.nextInt());
//         }
//         for(int i=0;i<5;i++){
//             System.out.print(list.get(i));
//         }
//         System.out.print(list);
//     }
// }

// _____Multi Array List_____
import java.util.ArrayList;

public class First{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}

