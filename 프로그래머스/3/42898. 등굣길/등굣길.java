public class Solution {
    public int solution(int m, int n, int[][] puddles) {
        long[][] map = new long[n + 1][m + 1];        
        
        for (int[] puddle : puddles) {
            map[puddle[1]][puddle[0]] = -1;
        }
    	map[1][1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == -1) { 
                    continue;
                }
                if (i > 1 && map[i - 1][j] != -1) {
                    map[i][j] += map[i - 1][j] % 1000000007;
                }
                if (j > 1 && map[i][j - 1] != -1) { 
                    map[i][j] += map[i][j - 1] % 1000000007;
                }
            }
        }
        return (int) (map[n][m]% 1000000007);
    }
}
