using System;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
         
        Array.Sort(array);
            
        return array[array.Length / 2];
    }
}