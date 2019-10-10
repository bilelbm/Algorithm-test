import java.util.*;

class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : A) {
            if(map.containsKey(value))
                map.remove(value);
            else
                map.put(value, 1);
        }
        return (int)map.keySet().toArray()[0];
    }
}