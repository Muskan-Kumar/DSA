// write a program to skip a given String in words
// 1 -> skip " a "
// 2 -> skip " apple "
// 3 -> skip " app " not "apple"

// time-complexity = size of the string

public class Stream{
    public static void main(String[] args){
        skip("","baccad");
        System.out.println(skipApple("badapplegacf"));
        System.out.println(skipAppNotApple("badapplegacf"));
    }
    static void skip(String p, String up){    //(p->process, up->unProcess)
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }

    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}