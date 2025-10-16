import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {2,3,4,1,6,5};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int i, int j){
        if(i == 0){
            return;
        }
        if(j < i){
            if(arr[j] > arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubble(arr, i, j+1);
        }
        else{
            bubble(arr, i-1, 0);
        } 
    }
}