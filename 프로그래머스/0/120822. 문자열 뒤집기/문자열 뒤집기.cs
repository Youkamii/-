using System;

public class Solution {
    public string solution(string my_string) {
        
        char[] arr = my_string.ToCharArray();
        Array.Reverse(arr);
              
        return new string(arr);
    }
}