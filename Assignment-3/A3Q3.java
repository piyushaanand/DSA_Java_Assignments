import java.util.Scanner;

class MarksOutOfBoundsException extends Exception{
    public MarksOutOfBoundsException(String s){
        super(s);
    }
}
class Student{
    String name ;
    int mark;

    public Student(String name , int mark)throws MarksOutOfBoundsException{
        this.name = name;
        if(mark > 100||mark<0){
            throw new MarksOutOfBoundsException("Mark can't be greater than 100 or less than 0 !");
        }else{
            this.mark = mark;
        }
    }

    public String getName(){
        return name;
    }
    public int getMark(){
        return mark;
    }
}
public class A3Q3 {
    public static void main(String[] args) {
       try{
         Student obj = new Student("Rahul",110);
         System.out.println("Name : "+ obj.getName());
         System.out.println("Mark : "+obj.getMark());
       }
       catch(MarksOutOfBoundsException e){
        System.out.println(e);
       }
        }
}
