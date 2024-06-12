using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int n) {
        List<int> answer = new List<int>();
        
        for (int i = 1; i <= n; i += 2) {
            // 무조건 홀수
            answer.Add(i);
        }
        
        return answer.ToArray();
    }
}

// sort 가장 왼쪽은 작고, 가장 오른쪽은 큰 수(데이터)가 오도록 나가라  ->  가나라