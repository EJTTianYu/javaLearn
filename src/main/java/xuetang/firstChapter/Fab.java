package xuetang.firstChapter;

import java.util.Scanner;

class Fab1{
    public int fabCal(int N){
        if (N==0||N==1){
            return 1;
        }
        else if (N>1){
            return fabCal(N-1)+fabCal(N-2);
        }
        else return 0;
    }
}
public class Fab {
    public static void main(String[] args){
        System.out.println("请输入所需求的下标");
        Scanner scanner=new Scanner(System.in);
        if (scanner.hasNextInt()){
            int a= scanner.nextInt();

            Fab1 fab1=new Fab1();
            System.out.println(fab1.fabCal(a));
        }
    }
}
