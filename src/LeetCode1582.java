public class LeetCode1582 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };

    }
    public static int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
