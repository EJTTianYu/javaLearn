import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args){
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.addFirst("pangtai");
        linkedList.addLast("!");
        System.out.println(linkedList);
    }
}
