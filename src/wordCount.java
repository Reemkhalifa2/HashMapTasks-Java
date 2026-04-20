import java.util.HashMap;

public class wordCount {
    public static void main(String[] args) {
        System.out.println(wordCount(new String[]{"a", "b", "a", "c", "b"}));
    }
    public static HashMap wordCount(String [] strings){
        HashMap<String , Integer> map = new HashMap<>();
        for(String str: strings){
            if(map.containsKey(str)){
                map.put(str,map.get(str) + 1);
            }else {
            map.put(str,1);}
        }
        return map;
    }
}
