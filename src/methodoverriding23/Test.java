package methodoverriding23;

public class Test {

    public static void main(String[] args) {
        Bike2 obj = new Bike2();    // creating object
        obj.run();  // calling instance method from vehicle class
        obj.run1(); // calling method from bike 2 class
    }
}
