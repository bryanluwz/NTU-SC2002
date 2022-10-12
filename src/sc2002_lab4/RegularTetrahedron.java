package sc2002_lab4;

public class RegularTetrahedron implements Shape2D {
    private float base;

    public RegularTetrahedron(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float calArea() {
        return (float) (Math.sqrt(3) * Math.pow(this.base, 2));
    }
}
