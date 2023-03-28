package carpetcostcalculator;

public class Floor {

    // instance variable

    private double width;
    private double length;
// constructor used
    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
// instance method
    public double getArea() {
        return width * length;
    }
}