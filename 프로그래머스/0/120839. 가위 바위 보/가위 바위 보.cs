using System;

public class Solution {
        public string solution(string rsp) {
        string answer = "";
        
        char[] Array = rsp.ToCharArray();
        
        for (int i = 0; i < Array.Length; i++) {
            if (Array[i] == '2')
                answer += "0";
            else if (Array[i] == '0')
                answer += "5";
            else
                answer += "2";
        }
        
        return answer;
    }
}