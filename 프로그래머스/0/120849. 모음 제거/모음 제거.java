import java.util.*;

class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
                answer.append(c);
        }

        return answer;
    }
}