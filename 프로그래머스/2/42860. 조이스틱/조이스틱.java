import java.util.*;

class Solution {
    public int solution(String name) {
        char[] targetNameArray = name.toCharArray();
		int totalMoveCount = 0;
		int nameLength = targetNameArray.length;
		int minLeftRight = nameLength - 1;
 
		for (int i = 0; i < nameLength; i++) {
			totalMoveCount += joystickMoveCounter(targetNameArray[i]);

			int nextIndex = i + 1;
			while (nextIndex < nameLength && targetNameArray[nextIndex] == 'A')
				nextIndex++;

			minLeftRight = Math.min(minLeftRight, i + nameLength - nextIndex + Math.min(i, nameLength - nextIndex));
		}

		totalMoveCount += minLeftRight;

		return totalMoveCount;
}

public int joystickMoveCounter(char c) {
    return Math.min(c - 'A', 'Z' - c + 1);
}

}