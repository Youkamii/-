import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N];
        double[] fRate = new double[N];
        int[] answer = new int[N];
        int totalUser = stages.length;
        
        for (int i = 0; i < N; i++)
            answer[i] = i + 1;
        
        for (int i : stages) {
            if (i <= N)
                challenger[i - 1]++;
        }

        int reached = totalUser;
        for (int i = 0; i < N; i++) {            
            if (reached > 0 && challenger[i] > 0){
                fRate[i] = (double) challenger[i] / reached;
                reached -= challenger[i];
            } else
                fRate[i] = 0;
        }
        
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                double Dtmp;
                int Itmp;
                if (fRate[j] < fRate[j + 1]) {
                    Dtmp = fRate[j];
                    fRate[j] = fRate[j + 1];
                    fRate[j + 1] = Dtmp;
                    
                    Itmp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j + 1] = Itmp;
                }               
            }
        }             
        
        return answer;
    }
}