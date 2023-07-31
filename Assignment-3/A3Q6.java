class Demo<T> {
    public T var;
    void box(T var){
        this.var = var;
    }
    T get(){
        return var;
    }
    void set(T var){
        this.var = var;
    }

}
public class A3Q6 {
    public static void main(String[] args) {
        Demo <String> strobj1 = new Demo <String> ();
        strobj1.box("It is the object of box string");
        Demo <String> strobj2 =strobj1;
        System.out.println("String variable1 contains :" + strobj1.get());
        System.out.println("String variable2 contains :" + strobj2.get());
        strobj1.set("Changed");
        System.out.println("String variable1 contains :" + strobj1.get());
        System.out.println("String variable2 contains :" + strobj2.get());

        Demo <Integer> intobj1 = new Demo <Integer>();
        intobj1.box(5);
        Demo <Integer> intobj2 = intobj1;
        System.out.println("Integer variable1 contains :" + intobj1.get());   
        System.out.println("Integer variable2 contains :" + intobj2.get());
        intobj1.set(10);
        System.out.println("Integer variable1 contains :" + intobj1.get());   
        System.out.println("Integer variable2 contains :" + intobj2.get());
    }
}