class FirstOccurance{

    public static int FirstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccur(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {3,2,6,7,8,9,1,7,5};
        System.out.print(FirstOccur(arr, 8, 0));
    }
}