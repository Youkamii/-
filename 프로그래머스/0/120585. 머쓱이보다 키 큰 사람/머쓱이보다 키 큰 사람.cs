using System;

public class Solution {
    public int solution(int[] array, int height) {
        int count = 0; // 머쓱이보다 키 큰 사람 수를 세기 위한 변수를 초기화
        
        for (int i = 0; i < array.Length; i++) {
            if (array[i] > height) {
                count++; // 키가 큰 사람을 발견하면 개수를 증가
            }
        }
        
        return count; // 머쓱이보다 키 큰 사람 수 반환
    }
}