import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {3,2,4,5,1,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int small = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[small] > arr[j]){
                    small=j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
}