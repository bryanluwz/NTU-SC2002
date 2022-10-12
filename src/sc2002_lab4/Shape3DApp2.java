package sc2002_lab4;

public class Shape3DApp2 {
    public static void main(String[] args) {
        Cone cone = new Cone(10, 10);
        Cylinder cylinder = new Cylinder(10, 5);

        float coneArea = cone.calArea();
        float cylinderArea = cylinder.calArea();
        float totalArea = coneArea + cylinderArea;

        System.out.println("Area of cone\t\t: " + coneArea);
        System.out.println("Area of cylinder\t: " + cylinderArea);
        System.out.println("Area of all shapes\t: " + totalArea);
    }
}
