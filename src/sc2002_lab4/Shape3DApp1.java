package sc2002_lab4;

public class Shape3DApp1 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(10);
        RegularTetrahedron regularTetrahedron = new RegularTetrahedron(10);
        Cube cube = new Cube(10);

        float sphereArea = sphere.calArea();
        float regularTetrahedronArea = regularTetrahedron.calArea();
        float cubeArea = cube.calArea();
        float totalArea = sphereArea + regularTetrahedronArea + cubeArea;

        System.out.println("Area of sphere\t\t\t\t: " + sphereArea);
        System.out.println("Area of regular tetrahedron\t: " + regularTetrahedronArea);
        System.out.println("Area of cube\t\t\t\t: " + cubeArea);
        System.out.println("Area of all shapes\t\t\t: " + totalArea);
    }
}
