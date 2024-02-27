import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String b : babbling) {
            String replaced = b.replaceAll("aya", "1")
                               .replaceAll("ye", "2")
                               .replaceAll("woo", "3")
                               .replaceAll("ma", "4");

            if (replaced.matches("^[1234]+$") && !replaced.contains("11") && !replaced.contains("22") && !replaced.contains("33") && !replaced.contains("44")) {
                answer++;
            }
        }

        return answer;
    }
} 