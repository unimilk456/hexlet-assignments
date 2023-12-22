package exercise;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        HashSet<String> set = new HashSet<>();
        //intersection
        set.addAll(map1.keySet());
        set.retainAll(map2.keySet());
        for (String item : set) {
            if (map1.get(item).equals(map2.get(item))) {
                result.put(item, "unchanged");
                continue;
            }
            result.put(item, "changed");
        }
        //deleted
        set.clear();
        set.addAll(map1.keySet());
        set.removeAll(map2.keySet());
        for (String item : set) {
            result.put(item, "deleted");
        }
//added
        set.clear();
        set.addAll(map2.keySet());
        set.removeAll(map1.keySet());
        for (String item : set) {
            result.put(item, "added");
        }
        return result;

    }
}

//END
