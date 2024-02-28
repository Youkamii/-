import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
		int knightPower;
 
		for (int i = 1; i <= number; i++) {
			
			knightPower = div(i);
			
			if (knightPower > limit) {
				answer += power;
            }
			else {
				answer += knightPower;
            }
		}

		return answer;
	}

	public int div(int number) {
		int count = 0;

		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0){
				count++;
				if (i != number /i)
					count++;
			}
		}
		return count;
	}
}