public class LeetCode_162 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int[] nums2={1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums2));
    }
    static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int start=0;
            int end=nums.length-1;
            while(start<end){
                int mid=start+(end-start)/2;
                if(nums[mid]>nums[mid+1]){
                    end=mid;
                }else{
                    start=mid+1;
                }
            }
            return start;
        }
        return -1;
    }
}
