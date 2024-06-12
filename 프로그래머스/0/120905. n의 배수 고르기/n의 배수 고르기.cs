using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        List<int> answer = new List<int>();
        
        for (int i = 0; i < numlist.Length; i++) {
            if (numlist[i] % n == 0)
                answer.Add(numlist[i]);
        }
        
        return answer.ToArray();
    }
}