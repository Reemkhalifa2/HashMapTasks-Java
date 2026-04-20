import jdk.jshell.EvalException;

import java.util.HashMap;

public class firstChar {
    public static void main(String[] args) {
        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
    }
    public static HashMap firstChar(String [] strings){
        HashMap<String , String> map = new HashMap<>();
        for(String str: strings){
            String key = str.substring(0,1);
            if(map.containsKey(key)){
                map.put(key, map.get(key)+str);
            }else{
                map.put(key,str);
            }
        }
        return map;
    }
}
