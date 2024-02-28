class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
		int end;
		int done = 0;

//		for (int i = 0; i < section.length; i++) {
//			end = section[i] + m - 1;
//			answer++;
//			i = end;
//		}

		while (done < section.length) {
			end = section[done] + m - 1; //칠
			answer++; // 붓 횟수
			while (done < section.length && section[done] <= end)
				done++;
		} 
		return answer;
    }
}