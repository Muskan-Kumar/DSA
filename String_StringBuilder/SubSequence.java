// write a programp of sub-sequence (for-> String)


import java.util.*;

public class SubSequence{
    public static void main(String[] args){
        subSequence("", "abc");
        System.out.println();
        System.out.println(subSequenceReturn("", "abc"));
        subSequenceAscii("", "abc");
        System.out.println();
        System.out.println(subSequenceReturnAscii("", "abc"));
    }

    static void subSequence(String p, String up){   // p->process, up->unProcess
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        subSequence(p+ch, up.substring(1));
        subSequence(p, up.substring(1));
    }

    // Return an arraylist of string (sub-sequence)
    static ArrayList<String> subSequenceReturn(String p, String up){   // p->process, up->unProcess
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left =  subSequenceReturn(p+ch, up.substring(1));
        ArrayList<String> right =  subSequenceReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    // sub-sequences with ascii value
    static void subSequenceAscii(String p, String up){   // p->process, up->unProcess
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        subSequenceAscii(p+ch, up.substring(1));
        subSequenceAscii(p, up.substring(1));
        subSequenceAscii(p + (ch+0), up.substring(1));    // some problem with print
    }

    // Return an arraylist of string with ascii value(sub-sequence)
    static ArrayList<String> subSequenceReturnAscii(String p, String up){   // p->process, up->unProcess
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first =  subSequenceReturnAscii(p+ch, up.substring(1));
        ArrayList<String> second =  subSequenceReturnAscii(p, up.substring(1));
        ArrayList<String> third =  subSequenceReturnAscii(p + (ch+0), up.substring(1));    // some problem with print

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

