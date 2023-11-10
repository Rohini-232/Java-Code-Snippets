public class Bubble_Sort{
    public static void BubbleSort(int arr[]){

        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
       }
    }
    public static void main(String args[]){
        int arr[]={4,5,2,3,1};
        BubbleSort(arr);
    }
}