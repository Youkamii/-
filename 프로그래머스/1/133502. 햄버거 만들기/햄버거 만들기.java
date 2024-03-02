import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int goodBugger = 0;
        List<Integer> dishIngredient = new ArrayList<>();

        for (int i : ingredient) {
            dishIngredient.add(i);

            if (dishIngredient.size() > 3) {
                if (dishIngredient.get(dishIngredient.size() - 1) == 1
                        && dishIngredient.get(dishIngredient.size() - 2) == 3
                        && dishIngredient.get(dishIngredient.size() - 3) == 2
                        && dishIngredient.get(dishIngredient.size() - 4) == 1) 
                {
                    goodBugger++;

                    for (int j = 0; j < 4; j++) {
                        dishIngredient.remove(dishIngredient.size() - 1);
                    }
                }
            }
        }
        return goodBugger;
    }
}
