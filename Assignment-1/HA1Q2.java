import java.util.Scanner;
public class HA1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number of lines : ");
        int n =sc.nextInt();
        String []s = new String[n];
        sc.nextLine();
        System.out.println("Enter Lines : ");
        for(int i=0;i<n;i++){
             s[i]=sc.nextLine();
        }  
        System.out.println("Enter lines in Reverse Oreder : "); 
        for(int i=n-1;i>=0;i--){
            System.out.println(s[i]);
        }
        sc.close();
    }
    
}
