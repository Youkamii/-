using System;
using System.Text;

// C#에서는 string을 char[] 사용할 수 있다. 

public class Solution {
    public string solution(string rsp) {
        StringBuilder StrB = new StringBuilder();

        for (int i = 0; i < rsp.Length; i++) {
            char c = rsp[i];
            
            if (c == '2') 
                StrB.Append("0"); // <-> list.Add(1);
            else if (c == '5')
                StrB.Append("2");
            else
                StrB.Append("5");
        }

        return StrB.ToString();
    }
}












// string answer = "";

//         for (int i = 0; i < rsp.Length; i++) {
//             if (rsp[i] == '2')
//                 answer += "0";
            // else if (rsp[i] == '5')
            //     answer += "2";
            // else if (rsp[i] == '0')
            //     answer += "5";
//         }

//         return answer;