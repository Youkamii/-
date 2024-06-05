using System;

public class Solution {
    public int solution(string my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.Length; i++) {
            char c = my_string[i];
            
            if (c >= '0' && c <= '9') {
                answer += (int)char.GetNumericValue(c);
            }
        }        
        return answer;
    }
}