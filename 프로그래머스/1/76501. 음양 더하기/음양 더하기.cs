using System;

public class Solution {
    public int solution(int[] absolutes, bool[] signs) {
        int answer = 0;
        
        for (int i = 0; i < signs.Length; i++) {            
            if (signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];            
        }
        
//         int tmp;
// 		int answer = 0;
		
// 		for (int i = 0; i < absolutes.length; i++) {
// 			tmp = absolutes[i];
// 			if (!(signs[i]))
// 				tmp *= -1;
// 			answer += tmp;
// 		}
        
        return answer;
    }
}