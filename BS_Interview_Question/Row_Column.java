// binary search in 2d array]

import java.util.Arrays;

public class Row_Column{
    public static void main(String[] args){
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        System.out.println(Arrays.toString(Search(matrix, 49)));
    }
    static int[] Search(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length-1;
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return new int[]{row,column};
            }
            else if(matrix[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[] {-1, -1};
    }
}