using System;
using System.Text;

// C#에서는 문자열을 char[] 처럼 사용 가능합니다.

public class Solution {
    public string solution(string cipher, int code) {
        StringBuilder StrB = new StringBuilder();
        
        for (int i = 0; i < cipher.Length; i++) {
            if ((i + 1) % code == 0) {
                StrB.Append(cipher[i]);
            }
            
        }
        
        return StrB.ToString();
    }
}