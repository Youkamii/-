class Solution {
    public int solution(int[] sides) {
        int tmp = 0;
        int abc = sides[0] + sides[1] + sides[2]; 
        
        for (int i = 0; i < 3; i++) {
            if (tmp < sides[i])
                tmp = sides[i];
        }
        
        if (abc - tmp > tmp)
        {
            return 1;
        }

        return 2;

        
    }
}