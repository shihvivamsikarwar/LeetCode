public class P_35 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        int ans=search(nums,target);
        System.out.println(ans);
        
    }
    static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}