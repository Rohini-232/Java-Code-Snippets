public class Max_Of_Subarray{
    public static void max_Sum(int numbers[]){
        int sum=0;
        int Max_sum=Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start=i;

            for(int j=0; j<numbers.length; j++){
                int end=j;
                sum=0;

                for(int k=start; k<=end; k++){
                    sum+=numbers[k];
                   
                }
                System.out.println("Sum : "+sum); 
                if(Max_sum < sum){
                    Max_sum = sum;
                }

            }
        }
         System.out.println("max sum is : "+Max_sum);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,3,-1,2};
        max_Sum(numbers);
    }
}