public class Search_Min{

    static int SearchMin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,0,-2};
        System.out.println(SearchMin(num));
    }
}