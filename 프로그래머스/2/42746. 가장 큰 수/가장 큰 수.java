import java.util.*;

class Solution {
    public String solution(int[] numbers) {
       String[] strArray = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++)
			strArray[i] = String.valueOf(numbers[i]);

		Arrays.sort(strArray, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
        
        if (strArray[0].equals("0")) {
			return "0";
        }

		StringBuilder answer = new StringBuilder();
		for (String s : strArray) {
			answer.append(s);
		}

		return answer.toString();
    }
}