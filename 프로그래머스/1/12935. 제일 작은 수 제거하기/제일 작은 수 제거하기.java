import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int minPoint = 0;
		List<Integer> tmp = new ArrayList<>();
 
		if (arr.length == 1)
			return new int[]{-1};
 
		minPoint = arr[0];

		for (int i = 0; i < arr.length; i++)
			if (minPoint > arr[i]) minPoint = arr[i];

		for (int i = 0; i < arr.length; i++)
			if (!(minPoint == arr[i])) tmp.add(arr[i]);

		return tmp.stream().mapToInt(i -> i).toArray();
    }
}