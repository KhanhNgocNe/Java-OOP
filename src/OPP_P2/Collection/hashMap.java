package OPP_P2.Collection;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("x", 3);
        hashMap.put("y", 2);
        hashMap.put("z", 1);

        System.out.println(hashMap);

        for(String key: hashMap.keySet()){
            System.out.println("Key is " + key);
        }
        for(int value: hashMap.values()){
            System.out.println("Value is " + value);
        }
    }
}
