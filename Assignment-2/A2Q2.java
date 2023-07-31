import java.util.Scanner;
class Complex{
    int real;
    int img;

    void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary value : ");
        real = sc.nextInt();
        img = sc.nextInt();
    }

    void display(){
        System.out.println(real+"+"+img+"i");
    }

    public Complex add(Complex C1, Complex C2){
        Complex C0 = new Complex();
        C0.real=C1.real + C2.real;
        C0.img = C1.img + C2.img ;
        return C0;
    }

}
public class A2Q2 {
    public static void main(String[] args) {
        Complex C1 = new Complex();
        C1.setData();
        C1.display();
        Complex C2 = new Complex();   
        C2.setData();   
        C2.display();
        Complex C3 = new Complex();
        C3 = C3.add(C1, C2);
        C3.display();

    }
    
}
