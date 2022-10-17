package sc2002_lab4;

public class RegularTetrahedron implements Shape2D {
    private float length;

    public RegularTetrahedron(float base) {
        this.length = base;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public float calArea() {
        return (float) (Math.sqrt(3) * Math.pow(this.length, 2));
    }

    @Override
    public void printArea() {
        System.out.printf("Regular Tetrahedron of length %.2f has an area of %.3f\n", this.getLength(), this.calArea());
    }
}
