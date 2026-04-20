import java.util.Arrays;
import java.util.HashMap;

public class word0 {
    public static void main(String[] args) {
        System.out.println(word0(new String[]{"a", "b", "c"}));
    }
    public static HashMap word0(String [] arr){
        HashMap<String , Integer> map = new HashMap<>();
        for(String str: arr){
            map.put(str,0);
        }
        return map;
    }
}
