using System;
using System.Text;

// C# 에서는 문자열을 char[] 취급 가능하다.

public class Solution {
    public string solution(string rsp) {
        StringBuilder StrB = new StringBuilder();
        // List<int> list = new List<int>(); -> Add
        
        for(int i = 0; i < rsp.Length; i++) {
            if (rsp[i] == '2')
                StrB.Append("0");
            else if (rsp[i] == '5')
                StrB.Append("2");
            else
                StrB.Append("5");
        }
        
        return StrB.ToString();
    }
}