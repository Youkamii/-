using System;

public class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        
        for (int i = 0; i < numbers.Length; i++) {
            sum += numbers[i];
            if (sum > n) {
                return sum;
            }
        }
        
//         int i = 0;
//         while (sum <= n && i < numbers.Length) {
//             sum += numbers[i];
//             i++;
//         }
        
        return sum;
    }
}
