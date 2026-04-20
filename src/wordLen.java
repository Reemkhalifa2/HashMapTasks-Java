import java.util.HashMap;

public class wordLen {
    public static void main(String[] args) {
        System.out.println(wordLen(new String[]{"a", "bb", "ccc"}));
    }
    public static HashMap wordLen(String [] strings){
        HashMap<String , Integer> map = new HashMap<>();
        for(String str: strings){
            map.put(str,str.length());
        }
        return map;
    }
}
