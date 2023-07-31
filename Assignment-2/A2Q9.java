import java.util.Scanner;
class Students{
    int roll ;
    String name ;
    String course;

        void input_Student(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the roll , name and course : ");
                roll = sc.nextInt();
                sc.nextLine();
                name = sc.nextLine();
                course = sc.next();
        }

        void display_Student(){
            System.out.println(roll+"-"+name+"-"+course);
        }
}
class Exam extends Students{
            int mark1;
            int mark2;
            int mark3;

            void input_Marks(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the marks in the three subjects : ");
                mark1 = sc.nextInt();
                mark2 = sc.nextInt();
                mark3 = sc.nextInt();
            }

            void display_Marks(){
                System.out.println("Marks 1 : "+mark1);
                System.out.println("Marks 2 : "+mark2);
                System.out.println("Marks 3 : "+mark3);
            }
}
public class A2Q9 {
    public static void main(String[] args) {
        
        Exam [] exams = new Exam[5];
        for(int i=0;i<exams.length;i++){
            exams[i]= new Exam();
            exams[i].input_Student();
            exams[i].input_Marks();
        }
        for(int i=0;i<exams.length;i++){
            exams[i].display_Student();
            exams[i].display_Marks();
        }
    }
    
}
