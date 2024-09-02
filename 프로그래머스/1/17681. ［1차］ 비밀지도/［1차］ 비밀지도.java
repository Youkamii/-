import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];        
        
        for (int i = 0; i < n; i++) answer[i] = D2B(n, arr1[i], arr2[i]);
        
        return answer;
    }
    
    public String D2B(int n, int cipher1, int cipher2) {
        StringBuilder code = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            int bit = 1 << (n - 1 - i);            
            if ((cipher1 & bit) != 0 || (cipher2 & bit) != 0) code.append("#");
            else code.append(" ");
        }
        
        return code.toString();
    }
}
    