public class Question1 {
    public static void main(String []args){
        String s1="coffee";
        String s2="caffeine";
        int i=0;
        while(i<s1.length()&&i<s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
                continue;
            }
            break;
        }
        if(s1.length()<=i&&s2.length()<=i)
            System.out.println(0);
        else if(s1.length()<=i)
            System.out.println(s2.charAt(i)-0);
        else if(s2.length()<=i)
            System.out.println(0-s1.charAt(i));
        else
            System.out.println(s1.charAt(i)-s2.charAt(i));
    }
}
