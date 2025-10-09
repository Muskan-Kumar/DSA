// public class EvenDigit{

//     static int evenDigit(int[] arr){
//         int count=0;
//         for(int i:arr){
//             if(even(i)){
//                 count++;
//             }
//         }
//         return count;
//     }
//     static boolean even(int num){
//         int evenDigit=digit(num);
//         return evenDigit%2==0;
//     }
//     static int digit(int num){
//         if(num<0){
//             num=num*-1;
//         }
//         if(num == 0){
//             return num=1;
//         }
//         int count=0;
//         while(num>0){
//             count++;
//             num = num/10;
//         }
//         return count;
//     }


//     public static void main(String[] args){
//         int[] arr={1,42,243,3573,-5674,682743};
//         System.out.println(evenDigit(arr));
//     }
// }


public class EvenDigit{
    static int evenDigit(int[] arr){
        int even=0;
        for(int i:arr){
            int count=0;
            if(i<0){
                i=i*-1;
            }
            if(i==0){
                return 1;
            }
            while(i>0){
                count++;
                i=i/10;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
    public static void main(String[] args) {
        int[] arr={1,43,243,5675,7659,-682743,1243};
        System.out.println(evenDigit(arr));
    }
}