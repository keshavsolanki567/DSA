package array;

public class RotateArrayByK {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int k=3;
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+"  ");
        }
    }
    public static void rotate(int[] nums,int k){
        while(k>0){
            int temp = nums[nums.length-1];
            for(int i=nums.length-1; i>0; i++){
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
        }
    }
    public static void reverse(int nums[], int s, int e){
        
        for(int i=s; i<e;i++){
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
            }
            s++;
            e--;
        }
    }
}
