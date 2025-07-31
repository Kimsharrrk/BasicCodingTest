package Data_Structure;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("apple", "사과");
        map.put("Banana", "바나나");
        map.put("apple", "애플");
        map.put("Sorry", "사과");

        System.out.println(map.get("apple")); //사과가 아닌 애플이 나옴, 유일해야하는 Key가 중복이 되어서 값이 덮어졌다.
        System.out.println(map.get("Sorry"));
        System.out.println(map.get("banana"));//대문자 중요함 -> 이 키가 없으니 값이 없다 그래서 null.
        System.out.println(map.get("Banana"));//대문자 중요함

        //

        System.out.println(map.containsKey("banana")); // false
        System.out.println(map.containsKey("Banana")); //ture

        //

        System.out.println(map.keySet()); //순서가 없음.

        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }


    }
}
