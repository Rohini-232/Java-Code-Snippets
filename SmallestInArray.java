public class SmallestInArray{
      public static int Smallest(int numbers[]){
        int smallest= Integer.MAX_VALUE;
        for(int i=0; i< numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[]={1,6,8,3,4};
        System.out.println("Smallest number is " +Smallest(numbers));
    }
}