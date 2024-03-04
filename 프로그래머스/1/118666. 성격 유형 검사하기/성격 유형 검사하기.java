class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
		int[] score = new int[4];

		for (int i = 0; i < survey.length; i++) {
			char c = survey[i].charAt(1);

			switch (c) {
                    
				case 'R' ->	score[0] += choices[i] - 4;
                case 'T' -> score[0] -= choices[i] - 4;
                    
				case 'C' -> score[1] += choices[i] - 4;
                case 'F' -> score[1] -= choices[i] - 4;
                    
				case 'J' -> score[2] += choices[i] - 4;
                case 'M' -> score[2] -= choices[i] - 4;
                    
				case 'A' -> score[3] += choices[i] - 4;
				case 'N' -> score[3] -= choices[i] - 4;
                    
			}
		}

        answer.append(score[0] >= 0 ? "R" : "T");
        answer.append(score[1] >= 0 ? "C" : "F");
        answer.append(score[2] >= 0 ? "J" : "M");
        answer.append(score[3] >= 0 ? "A" : "N");

		return answer.toString();
    }
}