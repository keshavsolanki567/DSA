package Array;

public class p2 {

    //First Approch - T.C.:- O(n*k)
    // public static void rotateBy1(int arr[]){
    //     int temp=arr[arr.length-1];
    //     for(int i=arr.length-1;i>0;i--){
    //         arr[i]=arr[i-1];
    //     }
    //     arr[0]=temp;
    //}

    // public static void rotateByK(int arr[], int k){
    //     for(int i=1;i<=k;i++){
    //         rotateBy1(arr);
    //     }
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    //Second Approch- T.C.:- O(n^2)
    // public static void rotateByK(int arr[], int k){
    //     k=k%arr.length;
    //     for(int i=1;i<=k;i++){
    //         rotateBy1(arr);
    //     }
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    
    public static void rotateByK1(int arr[], int k){
        int temp[] = new int[arr.length];
        k=k%arr.length;

        for(int i=0; i<arr.length;i++){
            int index = (i+k)%arr.length;
            temp[index]=arr[i];
        }

        
        for(int i=0; i<temp.length;i++){
            arr[i]=temp[i];
        }

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k=3;
        rotateByK1(arr,k);

    }
}
