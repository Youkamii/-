using System;

public class Solution {
    public int solution(int angle) {
        if (angle < 90) // -2147484648 ~ 89
            return 1;
        else if ( angle == 90) 
            return 2;
        else if (angle < 180) 
            return 3;
        return 4; // 180 ~ 2147483647
    }
}