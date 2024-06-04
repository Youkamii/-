using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int n) {

        List<int> answer = new List<int>();
        // 1 3 5 7 9 ~~
        for (int i = 1; i <= n; i += 2) {
            answer.Add(i);
        }
        
        return answer.ToArray();
    }
}
