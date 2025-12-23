package sortingKunal;

public class sortinginterviveArray {
    public static void main(String[] args) {
        int[] nums = {20, 30, 10};
        System.out.println(containsDuplicate(nums));
    }



    public static int[] sortting(int[] nums){
        // by using the buuble sort
//        for(int i=0;i<nums.length;i++){
//            for(int j=1;j<nums.length-i;j++){
//                if(nums[j]<nums[j-1]){
//                    int temp=nums[j];
//                    nums[j]=nums[j-1];
//                    nums[j-1]=temp;
//                }
//            }
//        }
//        return nums;
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }
            }
        }

return  nums;

    }
    public static void swap(int[] nums,int start,int end){
        int temp=start;
        start=end;
        end=temp;
    }


    public static boolean containsDuplicate(int[] nums) {

     int[] sorted=sortting(nums);
     for(int i=0;i<sorted.length-1;i++){
         if(sorted[i]==sorted[i+1]){
             return true;
         }
     }
     return false;

    }

}
