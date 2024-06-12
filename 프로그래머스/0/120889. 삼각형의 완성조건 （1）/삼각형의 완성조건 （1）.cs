using System;

public class Solution {
    public int solution(int[] sides) {
        Array.Sort(sides);

        int answer = sides[0] + sides[1] > sides[2] ? 1 : 2;
        
        return answer;
    }
}