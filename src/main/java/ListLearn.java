import java.util.ArrayList;
import java.util.List;

public class ListLearn {
    public static void main(String args[]){
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("pangtai");
        for(int i=0;i<list.size();i++){
            System.out.println(list);
        }
    }
}

