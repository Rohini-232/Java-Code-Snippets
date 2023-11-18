                                                                                                      class Recursion{
    public static void main(String args[]){
        //int n=10;
        //printInc(n);
        int m;
        System.out.println(fact(5));
    }

    public static int fact(int m){
        if(m==0){
            return 1;
        }
       // int fmm1 = fact(m-1);
        int fm = m* fact(m-1);
        return fm;
    }


    // public static void printDec(int n){
    //     if(n == 1){
    //         System.out.println(n);
    //         return;
    //     }

    //     System.out.print(n+" ");
    //     printDec(n-1);
    // }

    // public static void printInc(int n){
    //     if(n == 1){
    //         System.out.println(n);
    //         return;
    //     }

    //     printInc(n-1);
    //     System.out.print(n+" ");
    // }
}