package xuetang.firstChapter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class strSort {
    /**
     * @param args
     */
    public static void main(String[] args){
        int num;
        System.out.println("请输入数组长度");
        //创建Scanner类的基础语法
        Scanner in=new Scanner(System.in);
        //通过next获取输入
        num=in.nextInt();
        System.out.println("请输入字符串");
        String str[]=new String[num];
        for (int count=0;count<num;count++){
            str[count]=in.next();
            System.out.println(">>>>"+str[count]);

        }
        in.close();
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
