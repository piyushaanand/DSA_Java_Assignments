import java.util.Scanner;
class Distance{
    int metres;
    int centimetres;

    Distance(int metres,int centimetres){
        if(centimetres>=100){
            metres += centimetres/100;
            centimetres = centimetres%100;
        }
        this.metres = metres;
        this.centimetres = centimetres;
    }
    public void display(){
        System.out.println(metres+" m "+""+centimetres+" cm ");
    }

    Distance sum(Distance D1 , Distance D2){  
        int m  = D1.metres+D2.metres;
        int cm = D1.centimetres+D2.centimetres;
        return new Distance(m, cm);
    }
}
public class HA2Q3 {
    public static void main(String[] args) {
        Distance D1 = new Distance(5,70);
        Distance D2 = new Distance(3, 30);
        Distance D3 = D1.sum(D1, D2);
        D1.display();
        D2.display();
        System.out.println("The sum of D1 and D2 : ");
        D3.display();
        
    }
    
}
