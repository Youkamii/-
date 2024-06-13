using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int n) {
        List<int> collatzSequence = new List<int>();
        
        collatzSequence.Add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            collatzSequence.Add(n);
        }
        return collatzSequence.ToArray();
    }
}
