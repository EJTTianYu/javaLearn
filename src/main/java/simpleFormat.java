import java.text.SimpleDateFormat;

public class simpleFormat {
    private static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat=new SimpleDateFormat(TIME_FORMAT);
    public static void main(String[] args){
        long now=System.currentTimeMillis();

        System.out.println(now);
        System.out.println(simpleDateFormat.format(now));
    }

}
