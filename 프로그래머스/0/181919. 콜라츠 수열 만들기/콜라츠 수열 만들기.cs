using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int n) {
        List<int> answer = new List<int>();
        
        answer.Add(n);
        
        while (n != 1) { 
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            answer.Add(n);
        }
        return answer.ToArray();
    }
}
