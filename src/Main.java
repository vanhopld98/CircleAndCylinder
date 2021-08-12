public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6, "blue");
        System.out.println(circle);
        System.out.println();

        Cylinder cylinder = new Cylinder(circle.getRadius(),"red",8);
        cylinder.setRadius(4);
        System.out.println(cylinder);
    }
}