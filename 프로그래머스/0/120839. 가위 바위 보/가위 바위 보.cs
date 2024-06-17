using System;
using System.Text;

public class Solution {
    public string solution(string rsp) {
        StringBuilder answer = new StringBuilder();
          
        for (int i = 0; i < rsp.Length; i++) {
            if (rsp[i] == '2')
                answer.Append('0');
            else if (rsp[i] == '0')
                answer.Append('5');
            else
                answer.Append('2');
        }
        
        return answer.ToString();
    }
}