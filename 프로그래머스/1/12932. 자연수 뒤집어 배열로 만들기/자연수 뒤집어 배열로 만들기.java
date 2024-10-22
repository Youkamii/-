class Solution {
    public int[] solution(long n) {
        int lengthNum = 1;
		long tmp = n; 

		for (int i = 0; 0 != (tmp /= 10) ; i++){ lengthNum++; }

		int[] answer = new int[lengthNum]; 

		for (int i = 0; i < lengthNum ; i++ ) {

			if (10 < n)
				answer[i] = (int)(n % 10);
			else
				answer[i] = (int)n;
			n /= 10;
		}

		return answer;
	}
}