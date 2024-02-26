import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i++)
            if (isPrime(i)) answer++;
        
        return answer;
    }
    
    public boolean isPrime(int crt) {
        
        for (int i = 2; i * i <= crt; i++)
            if (crt % i == 0) return false;
        
        return true;
    }
}