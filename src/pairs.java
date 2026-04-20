import java.util.HashMap;

public class pairs {
    public static void main(String[] args) {
        System.out.println(pairs(new String[]{"man", "moon", "main"}));
    }
    public static HashMap pairs(String [] strings){
        HashMap<String , String> map = new HashMap<>();
        for(String str: strings){
            map.put(str.substring(0,1),str.substring(str.length()-1));
        }
        return map;
    }
}
