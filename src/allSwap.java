import java.util.HashMap;

public class allSwap {
    public static void main(String[] args) {
        String [] string =  allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"});
        for(String str : string){
            System.out.println(str);
        }

    }
    public static String[] allSwap(String [] strings){
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0,1);
            if (map.containsKey(key)) {
                int position = map.get(key);
                String temp = strings[position];
                strings[position] = strings[i];
                strings[i] = temp;

                map.remove(key);

            } else {
                map.put(key, i);
            }
        }

        return strings;

    }
}
