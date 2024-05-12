using System;

public class Solution {
    public string solution(string my_string) {
        char[] CharArray = my_string.ToCharArray();
        
        for (int i = 0; i < CharArray.Length; i++) {
            if (CharArray[i] >= 'A' && CharArray[i] <= 'Z')
                CharArray[i] = (char)(CharArray[i] + 32);
            else
                CharArray[i] = (char)(CharArray[i] - 32);
        }
        return new String(CharArray);
    }
}