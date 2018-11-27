import java.util.HashMap;
import java.util.Map;

public class MapLearn {
    public static void  main(String[] args){
        Map<String,Integer> hashmap=new HashMap<String, Integer>();
        hashmap.put("pangtai",100);
        hashmap.put("tianyu",200);
        hashmap.put("tianyu",300);
        hashmap.remove("pangtai");
        System.out.println(hashmap);
    }
}
