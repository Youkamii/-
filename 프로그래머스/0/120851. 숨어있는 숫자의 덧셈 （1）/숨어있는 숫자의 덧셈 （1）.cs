using System;

public class Solution {
    public int solution(string my_string) {
        int answer = 0;
        // "aAb1B2cC34oOp" -> [a,A,b,1,B,2,c,C,3,4,o,O,p]
        for (int i = 0; i < my_string.Length; i++) {
            char c = my_string[i];
            
            if (c >= 48 && c <= 57) {
                answer += c - '0';
                            
            }
        }        
        return answer;
    }
}