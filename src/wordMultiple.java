import java.util.*;

public class wordMultiple {
    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
    }
    public static HashMap<String, Boolean> wordMultiple(String [] strings){
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Boolean> result = new HashMap<>();
        for (String str : strings) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }

        }
        for(Map.Entry<String,Integer > m : map.entrySet()){
            if(m.getValue()>=2){
                result.put(m.getKey(),true);
            }else {
                result.put(m.getKey(),false);
            }
        }
        return result;

    }
}
