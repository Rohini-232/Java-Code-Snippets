public class Selection_Sort{
    public static void SelectionSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int MinPos=i;
            
            for(int j=i+1; j<arr.length; j++){
                if(arr[MinPos] > arr[j]){
                    MinPos = j;
                }
            }
           int temp = arr[MinPos];
           arr[MinPos] = arr[i];
           arr[i] = temp;
        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);
    }
}