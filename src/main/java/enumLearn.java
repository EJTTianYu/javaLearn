enum Season{
    春季,夏季,秋季,冬季
}
public class enumLearn {
    public static void main(String[] args){
        for(Season c:Season.values()){
            System.out.print(c+",");
            System.out.print(",");
        }
    }
}
