public class splitLearn {
    public static void main(String[] args){
        String s="hello_123_yuban_shangtiao_yifang";
        String test[]=s.split("_");
        System.out.println(Double.parseDouble(test[1]));
    }
}
