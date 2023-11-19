class PowerRecursion{

    public static int PowerOf(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = PowerOf(a, n/2) * PowerOf(a, n/2);

        if(n % 2 !=0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]){
        int a = 2;
        int n= 10;

        System.out.print(PowerOf(a, n));
    }
}