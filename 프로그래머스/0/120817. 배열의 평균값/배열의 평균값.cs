using System;

public class Solution {
    public double solution(int[] numbers) {
        int answer = 0;
        double l = numbers.Length;
        
        for (int i = 0 ; i < l; i ++) {
            answer += numbers[i];
        }
        return answer / l;
    }
}