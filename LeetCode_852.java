public class LeetCode_852 {
    public static void main(String[] args) {
        int[] arr={0,3,6,8,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
        
    }
    static int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int mid=start+(end-start)/2;
                if(arr[mid]>arr[mid+1]){
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