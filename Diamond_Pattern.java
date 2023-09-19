public class Diamond_Pattern{
    public static void Pattern(int n){

        for(int i=1; i<=n; i++){

            //for space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //for star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){

            //for space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //for star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Pattern(4);
    }
}
     