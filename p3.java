package Array;

public class p3 {
    public static boolean binarySearch(int arr[], int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[][]= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        
        for(int i=0;i<arr.length;i++){
            if( binarySearch(arr[i],target)){
                System.out.println("element found");
            }
        }
        
    
    }

}
