package Data_Structure;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();


        map.put("apple", "사과");
        map.put("banana", "바나나");
        map.put("cherry", "체리");

        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
        // 출력 순서: apple → banana → cherry
    }
}
