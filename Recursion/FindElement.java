import java.util.*;


public class FindElement{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,5,6,7,8,9};
        System.out.println(find(arr, 5, 0));
        System.out.println(findIndex(arr, 5, 0));
        System.out.println(findLastIndex(arr, 5, arr.length-1));
        findAllIndex(arr, 5, 0);
        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndexes(arr, 5, 0, list);
        System.out.println(ans);

        System.out.println(findAllIndexes2(arr, 5, 0));
    }

    // find the element in array or not
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    // find the element in array and return index otherwise return -1
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }


    // find the element in array from last index and return index otherwise return -1
    static int findLastIndex(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findLastIndex(arr, target, index-1);
        }
    }

    // find the All index of given element in array
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    // find the All index of given element in array by ArrayList return type
    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexes(arr, target, index+1, list);
    }

    // find the All index of given element in array by ArrayList return type (list contain in func body)
    static ArrayList<Integer> findAllIndexes2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans = findAllIndexes2(arr, target, index+1);

        list.addAll(ans);
        return list;
    }
}