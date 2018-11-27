package xuetang.firstChapter;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayDup {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Scanner in1=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b= new ArrayList<Integer>();
        System.out.println("请输入第一组数组元素,输入end结束");
        while (in.hasNextInt()){
            a.add(in.nextInt());
            System.out.println("第一组数组元素"+a);
        }
        System.out.println("请输入第二组数组元素，输入end结束");
        while(in1.hasNextInt()){
            b.add(in1.nextInt());
            System.out.println("第二组数组元素"+b);
        }
        int count=0;
        for (int i=0;i<a.size();i++){
            if (b.contains(a.get(i))){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
