package sc2002_lab4;

public class Shape3DApp {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(10);
        RegularTetrahedron regularTetrahedron = new RegularTetrahedron(10);
        Cube cube = new Cube(10);

        Cone cone = new Cone(10, 10);
        Cylinder cylinder = new Cylinder(10, 5);

        sphere.printArea();
        regularTetrahedron.printArea();
        cube.printArea();

        cone.printArea();
        cylinder.printArea();
    }
}
