public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * getHeight();
    }

    public double getTotalArea() {
        return (2 * Math.PI * Math.pow(getRadius(), 2)) + getArea();
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder {"
                + " Radius = " + getRadius()
                + " , Height = " + getHeight()
                + " , Color = " + getColor()
                + " , Area = " + getArea()
                + " , Total Area = " + getTotalArea()
                + " , Volume = " + getVolume()
                +" }"
                ;
    }
}