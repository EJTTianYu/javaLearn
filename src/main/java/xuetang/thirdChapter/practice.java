package xuetang.thirdChapter;


import java.util.ArrayList;
import java.util.Scanner;

class Person{
    Person(){

    }
}
public class practice {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        ArrayList<String> output=new ArrayList<String>();
        for (int i=0;i<num;i++){
            Scanner it=new Scanner(System.in);
            if(it.hasNextLine()){
                String line=it.nextLine();
                String[] arr=line.split("\\s++");
                ArrayList<Integer> ax=new ArrayList<Integer>();
                for (String s:arr){
                    ax.add(Integer.parseInt(s));
                }
                if (ax.size()==3){
                    output.add("Student"+(ax.get(0)+ax.get(1)+ax.get(2))/3);
                }
                else if(ax.size()==4){
                    output.add("Teacher"+(ax.get(0)+ax.get(1)+ax.get(2)+ax.get(3))/4);
                }


            }
        }
        System.out.println(output);
    }
}
