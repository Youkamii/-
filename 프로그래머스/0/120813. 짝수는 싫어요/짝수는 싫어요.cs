using System;

public class Solution {
    public int[] solution(int n) {
        int ArraySize = (n + 1) / 2;
        int[] answer = new int[ArraySize];
        int j = 0;
        
        for (int i = 1; i <= n; i ++) {
            if (i % 2 != 0) {
                answer[j] = i;
                j++;
            }
        }
        
        return answer;
    }
}