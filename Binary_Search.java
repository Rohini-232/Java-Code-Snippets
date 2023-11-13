public class Binary_Search{
    public static int BinarySearch(int numbers[],int key){
        int start=0 , end= numbers.length-1;
        

        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[]={12,15, 18, 19, 23, 24, 35};
        int key =23;
        System.out.println("the key is at index : "+ BinarySearch(numbers,key));
    }

    
}