using System;
using System.Text;

public class Solution {
    public string solution(string my_string, int k) {
        StringBuilder StrB = new StringBuilder();
        
        for (int i = 0; i < k; i++)
            StrB.Append(my_string);
        
        return StrB.ToString();
    }
}