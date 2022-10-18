import java.util.Arrays;
public class Question3 {
    public static void main(String []args){
        String s= "interstellar";
        char []arr= new char[20];
        arr=s.toCharArray();
        Arrays.sort(arr);
        String c= new String(arr);
        System.out.println(c);
    }
}
