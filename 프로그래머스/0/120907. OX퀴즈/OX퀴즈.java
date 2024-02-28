import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        int l = quiz.length;
        String[] answer = new String[l];
        
        for (int i = 0; i < l; i++) {
             String[] st = quiz[i].split(" ");

            if (st[1].equals("-")) {
                if (Integer.parseInt(st[0]) - Integer.parseInt(st[2]) == Integer.parseInt(st[4]))
                    answer[i] = "O";
                else
                    answer[i] = "X";
            } else {
                if ((Integer.parseInt(st[2]) + Integer.parseInt(st[0])) == Integer.parseInt(st[4]))
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
        }
        
        
        return answer;
    }
}