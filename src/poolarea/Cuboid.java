package poolarea;

public class Cuboid extends Rectangle{

    // instanc evarriable
    private double height;
// constructor with returen
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    // instance method
    public double getHeight() {
        return height;
    }
    // instance method
    public double getVolume() {
        return getArea() * height;
    }
}

