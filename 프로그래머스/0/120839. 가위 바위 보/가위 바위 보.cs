using System;
using System.Text;

public class Solution {
    public string solution(string rsp) {
        StringBuilder StrB = new StringBuilder();

        for (int i = 0; i < rsp.Length; i++) {
            if (rsp[i] == '2')
                StrB.Append("0");
            else if (rsp[i] == '0')
                StrB.Append("5");
            else
                StrB.Append("2");
        }

        return StrB.ToString();
    }
}