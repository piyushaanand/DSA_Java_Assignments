import java.util.Scanner;
class InvalidAgeException extends Exception{
    public  InvalidAgeException(String s){
            super(s);
    }
}
public class CP {

    static void Validate(int age)
        throws InvalidAgeException {
            if(age<18){
              throw new InvalidAgeException("Age is Lower !!!");
            }else{
                System.out.println("Welcome You can cast Vote !!");
            }
        }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int a = sc.nextInt();
        try{
            Validate(a);
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
}
