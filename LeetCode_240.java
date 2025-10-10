public class LeetCode_240 {
    public static void main(String[] args) {
        int[][] matrix={
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        int target=5;
        System.out.println(searchMatrix(matrix, target));
    }

    // Solution 1
    // static boolean searchMatrix(int[][] matrix, int target) {
    //     for (int row = 0; row < matrix.length; row++) {
    //         for (int col = 0; col < matrix[row].length; col++) {
    //             if(matrix[row][col]==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // Solution 2
    static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }   

    // Solution 3
    // static boolean searchMatrix(int[][] matrix, int target) {
    //     int m=matrix.length;
    //     int n=matrix[0].length;
    //     int low=0;
    //     int high=m * n - 1;
    //     while(low<=high){
    //         int mid=low+(high-low)/2;
    //         int row=mid/n;
    //         int col=mid%n;
    //         if(matrix[row][col]==target){
    //             return true;
    //         }else if(matrix[row][col] < target){
    //             low=mid+1;
    //         }else{
    //             high=mid-1;
    //         }
    //     }
    //     return false;
    // }
}
