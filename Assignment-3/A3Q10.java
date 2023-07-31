import java.util.Scanner;
public class A3Q10 {
    public static String reverseString(String s ){
        if(s.isEmpty()){
            return s;
        }else{
            char lastChar = s.charAt(s.length()-1);
            String remainaingChar = s.substring(0,s.length()-1);
            return lastChar + reverseString(remainaingChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        String res = reverseString(s);
        System.out.println("The reverse of "+s+" is "+res);
    }
    
}
