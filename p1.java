package Array;
public class p1 {
    //Move all zero to End
    static void swiftingZero(int arr[]){
        int i=0;
        for(int j=0; j<arr.length; j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        for(int j=i; j<arr.length; j++){
            arr[j]=0;
        }
        System.out.println("After:");
        for(int j=0; j<arr.length; j++){
           System.out.print(arr[j]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7, 0, 8, 3, 12, 99,0,3,0};
        System.out.println("Before:");
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
         }
        swiftingZero(arr);
    }
}