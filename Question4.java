import java.util.*;
public class Question4 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        System.out.print(k+" ");
        while(k!=1){
            if(k%2==0)
                k/=2;
            else
                k=k*3+1;
            System.out.print(k+" ");
        }
    }
}
