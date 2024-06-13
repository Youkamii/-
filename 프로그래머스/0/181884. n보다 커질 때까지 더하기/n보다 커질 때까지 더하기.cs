using System;

public class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.Length; i++) {
            answer += numbers[i];
            if (answer > n)
                return answer;
        }
        
        int a = 0;
        while(answer <= n) {
            answer += numbers[a++];
        }

        return answer;
    }
}