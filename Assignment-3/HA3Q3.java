import java.util.Scanner;
public class HA3Q3 {
    public static boolean isPalindrome(String s){
        if(s.length()<=1){
            return true;
        }else if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }else{
            String substr = s.substring(1,s.length()-1);
            return isPalindrome(substr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        boolean res = isPalindrome(s);
        System.out.println("Is String "+s+" a Palindrome ??: "+res);
        
    }
    
}
