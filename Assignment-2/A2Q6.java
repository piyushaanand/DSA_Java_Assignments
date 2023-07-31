import java.util.Scanner;
abstract class Shape{
    public abstract double area();
}

class Square extends Shape{
   public double area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        int s = sc.nextInt();
        return (double)s*s;
    }
}
    
    class Rectangle extends Shape{
        public double area(){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the length : ");
           int l = sc.nextInt();
           int b = sc.nextInt();

           return (double) l*b;
        }
    }

        class Triangle extends Shape{
            public double area(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Base and Height : ");
                int base = sc.nextInt();
                int Height = sc.nextInt();

                return (double)(base*Height)/2.0;
            }
        }

        class Circle extends Shape{
            public double area(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the radius of the circle : ");
                int r = sc.nextInt();

                return (double)Math.PI*Math.pow(r,2);
            }
        }

public class A2Q6 {
    public static void main(String[] args) {
        Shape obj = new Square();
        System.out.println("Area of Square : "+obj.area());
        obj = new Rectangle();
        System.out.println("Area of Rectangle : "+obj.area());
        obj = new Triangle();
        System.out.println("Area of Triangle : "+obj.area());
        obj = new Circle();
        System.out.println("Area of Circle : "+obj.area());
    }
    
}
