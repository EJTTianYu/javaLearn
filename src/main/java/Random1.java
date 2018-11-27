import java.util.Random;

public class Random1 {
    public static void main(String[] args){
        Random random=new Random();
        int i=random.nextInt(200);
        double j=random.nextDouble();
        System.out.println(i);
        System.out.println(j);
    }
}
