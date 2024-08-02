import java.util.*;

class Solution {
    public long solution(long n) {
        int lengthNum = 1;
		long tmp = n; 
		long answer = 0;

		for (int i = 0; 0 != (tmp /= 10) ; i++){ lengthNum++; }

		long[] answerArray = new long[lengthNum];

		for (int i = 0; i < lengthNum ; i++ ) {
			if (10 < n)
				answerArray[i] = (n % 10);
			else
				answerArray[i] = n;
			n /= 10;
		}

		long sortTmp = 0;

		for (int i = 0; i < lengthNum; i++) {
			for (int j = 0; j < lengthNum -1; j++) {
				if (answerArray[i] > answerArray[j]) {
					sortTmp = answerArray[i];
					answerArray[i] = answerArray[j];
					answerArray[j] = sortTmp;
				}
			}
		}

		for (long l : answerArray)
			answer = answer * 10 + l;
		return answer;
    }
}