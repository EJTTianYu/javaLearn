package xuetang.secondChapter;

import java.util.Scanner;

class Rectangle {
    private int height;
    private int width;
    Rectangle(int h,int w){
        this.height=h;
        this.width=w;
    }
    public int getArea(){
        return this.height*this.width;
    }
    public int getPerimeter(){
        return (this.width+this.height)*2;
    }

}
public class Rec{
    public static void main(String[] args){
        System.out.println("请输入矩形的长和宽");
        Scanner in=new Scanner(System.in);
        int a=0,b=0;
        if(in.hasNextInt()){
            a=in.nextInt();
            b=in.nextInt();
        }
        Rectangle rectangle=new Rectangle(a,b);
        System.out.println(rectangle.getArea()+" "+rectangle.getPerimeter());
    }
}
