// 380. Insert Delete GetRandom O(1)

// ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
// [[], [1], [2], [2], [], [1], [2], []]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RandomizedSet {
    List<Integer> listSet;
    Map<Integer, Integer> map;
    public RandomizedSet() {
        listSet = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        else {
            listSet.add(val);
            map.put(val, listSet.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)) {
            int idx = map.get(val);
            listSet.add(idx, listSet.get(listSet.size()-1));
            map.put(listSet.get(listSet.size()-1), idx);
            listSet.remove(idx+1);
            listSet.remove(listSet.size()-1);
            map.remove(val);
            return true;
        }
        else {
            return false;
        }
    }
    
    public int getRandom() {
        int randomNum = (int) (Math.random() * listSet.size());
        return listSet.get(randomNum);
    }
}

public class Question380 {
    public static void main(String[] args) {
        
    }
}
