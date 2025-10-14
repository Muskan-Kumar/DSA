import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args){
        int[] arr = {3,1,2,7,5,6,4,8};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int current = arr[i]-1;
            if(arr[i] != arr[current]){
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            }
            else{
                i++;
            }
        }
    }
}