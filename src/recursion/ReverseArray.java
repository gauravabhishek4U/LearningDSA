package recursion;

public class ReverseArray {
    // Function to print the reversed array
    public static void printArray(int arr[], int n){
        System.out.println("Printing the reversed array : \n");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //Function to reverse array using recursion
    public static  void reverseArray(int arr[], int start, int end){
        if(start<end){
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start+1, end-1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10,20,30,40,50};
        reverseArray(arr,0,n-1);
        printArray(arr,n);
    }
}
