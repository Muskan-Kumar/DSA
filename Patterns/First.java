
public class First{
    public static void main(String[] args){
        // pattern(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(5);
        pattern8(5);
    }

    // * 
    // * * 
    // * * * 
    // * * * * 
    // * * * * *
    static void pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    static void pattern2(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * * * 
    // * * * *
    // * * *
    // * *
    // *
    static void pattern3(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1 
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    static void pattern4(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // * 
    // * *
    // * * *
    // * * * *
    // * * * * * 
    // * * * * 
    // * * *
    // * *
    // *
    static void pattern5(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //     *
    //    **
    //   ***
    //  ****
    // *****
    static void pattern6(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //     * 
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    //  * * * * 
    //   * * *
    //    * * 
    //     *
    static void pattern7(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    //     1   
    //    212  
    //   32123 
    //  4321234
    // 543212345

    static void pattern8(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=1; j<=i-1; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }  
    }
}