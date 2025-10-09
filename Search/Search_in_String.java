// import java.util.Arrays;

public class Search_in_String{

    static boolean linearSearch(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }

        // for(char a: str.toCharArray()){
        //     if(a == target){
        //         return true;
        //     }
        // }

        return false;
    }

    public static void main(String[] args){
        String str = "Muskan";
        char target = 'n';
        System.out.println(linearSearch(str, target));
    }
}