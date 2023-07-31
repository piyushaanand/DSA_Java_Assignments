import java.util.Scanner;
public class A3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]str = new String[4];
        System.out.println("Enter the colours !");
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
        try{
            int n = Integer.parseInt(str[0]);
            System.out.println(n);
        }
        catch(NumberFormatException obj){
            System.out.println(obj);
        }
        try{
            System.out.println(str[4]);
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);
        }
        finally{
            System.out.println("The Colours Entered are : ");
            for(int i=0;i<str.length;i++){
                System.out.println(str[i]);
            }
        }
    }
}
