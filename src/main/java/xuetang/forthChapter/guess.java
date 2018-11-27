package xuetang.forthChapter;

import java.util.Scanner;

class jundge{
    public static boolean decide1(int a){
        boolean isPrime=true;
        int len=a/2;
        for(int i=2;i<=len;i++){
            if(a%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static boolean decide2(int a,int b){
        return (decide1(a)&&decide1(b));
    }
}
public class guess {
    public static  void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=3;i<num/2;i++){
            if (jundge.decide2(i,num-i)){
                System.out.println(num+"="+i+"+"+(num-i));
            }
        }
    }
}
