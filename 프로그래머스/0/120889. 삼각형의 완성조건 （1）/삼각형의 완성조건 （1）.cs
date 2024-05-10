using System;

public class Solution {
    public int solution(int[] sides) {
        Array.Sort(sides);
        return (sides[0] + sides[1] > sides[2]) ? 1 : 2;
    }
}