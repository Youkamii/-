import java.util.*;

class Solution {
    public int solution(String dartResult) {      
        int[] scores = new int[3];
        int counter = -1;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)){
                counter++;
                if (Character.isDigit(dartResult.charAt(i + 1))) {
                    scores[counter] = 10;
                    i++;
                } else {
                    scores[counter] = c - '0';
                }
            } else if (c == 'S' || c == 'D' || c == 'T') {
                scores[counter] = (int) Math.pow(scores[counter], bonus(c));
            } else {
                if (option(c)) {
                    if (counter > 0) {
                        scores[counter - 1] *= 2;
                    }
                    scores[counter] *= 2;
                } else {
                    scores[counter] *= -1;
                }
                
            }
            
        }

        return scores[0] + scores[1] + scores[2];
    }

    public boolean option(char c){
        return c == '*' ? true : false;
    }
    
    public int bonus(char c) {
        if (c == 'S')
            return 1;
        else if (c == 'D')
            return 2;
        else
            return 3;
    }
}