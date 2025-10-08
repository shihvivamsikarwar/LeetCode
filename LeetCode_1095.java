public class LeetCode_1095 {
    public static void main(String[] args) {
        int[] mountainArr={1,2,3,4,5,3,1};
        int target=3;
        int ans=findInMountainArray(target,mountainArr);
        System.out.println(ans);
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int peak=findPeakIndex(mountainArr);
        int firstHalfValue=agnosticBS(target,mountainArr,0,peak);
        if(firstHalfValue!=-1){
            return firstHalfValue;
        }
        return agnosticBS(target, mountainArr, peak+1, mountainArr.length-1);
    }

    static int findPeakIndex(int[] mountainArr) {
            for (int i = 0; i < mountainArr.length; i++) {
                int start=0;
                int end=mountainArr.length-1;
                while(start<end){
                    int mid=start+(end-start)/2; 
                    if(mountainArr[mid]>mountainArr[mid+1]){
                        end=mid;
                    }else{
                        start=mid+1;
                    }
                }
                return start;
            }
        return -1;
    }
    static int agnosticBS(int target,int[] mountainArr, int start, int end){

        boolean isAsc=mountainArr[start]<mountainArr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==mountainArr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<mountainArr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>mountainArr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
