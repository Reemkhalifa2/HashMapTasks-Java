import java.util.*;

public class wordAppend {
    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
    }
    public static String wordAppend(String [] strings){
        HashMap<String, Integer> map = new HashMap<>();
        String result = "";
        for (String str : strings) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
            if (map.get(str) % 2 == 0) {
                result += str;
            }
        }
        return result;

    }
}
