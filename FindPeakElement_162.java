public class FindPeakElement_162 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(findPeakElement(nums));

    }
    static int findPeakElement(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int peak=nums[i];
            if(nums[i]<nums[i+1]){
                return i+1;
            }
        }
        return -1;
    }

}
