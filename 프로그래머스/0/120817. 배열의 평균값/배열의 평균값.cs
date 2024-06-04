using System;

public class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int l = numbers.Length;

        for (int i = 0; i < l; i++) {
            answer += numbers[i];
        }
        
        return answer / l;
    }
}