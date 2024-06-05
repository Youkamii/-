using System;
using System.Collections.Generic;

// Array, List

public class Solution {
    public int[] solution(int n) {
        List<int> answer = new List<int>();

        for (int i = 1; i <= n; i+=2)
            answer.Add(i);
        
        return answer.ToArray();
    }
}

// Sort