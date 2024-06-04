using System;
using System.Text;
// string ~= char[]            list.Add();
public class Solution {
    public string solution(string rsp) {
        StringBuilder StrB = new StringBuilder();

        for (int i = 0; i < rsp.Length; i++) {
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