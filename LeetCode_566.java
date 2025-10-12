import java.util.Arrays;
public class LeetCode_566 {
    public static void main(String[] args) {
        int[][] mat={
            {1,2},
            {3,4}
        };
        int r = 1, c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        int[][] res = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            res[i / c][i % c] = mat[i / n][i % n];
        }
        return res;
    }
}
