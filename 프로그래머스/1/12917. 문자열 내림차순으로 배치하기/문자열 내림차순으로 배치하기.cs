using System.Linq;
using System;

public class Solution {
    public string solution(string s) {
        char[] c = s.ToArray();

        Array.Sort(c);
        Array.Reverse(c);

        // 버블소트 구현하는데 가장 빠르지만, 가장 느릴 확률이 높은
        // int a; int b; int tmp;

        return new String(c);
    }
}