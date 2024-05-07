using System;

public class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int ArrayLength = numbers.Length;
        
        for (int i = 0; i < ArrayLength; i++) {
            answer += numbers[i];
        }
        return answer / ArrayLength;  
    }
}