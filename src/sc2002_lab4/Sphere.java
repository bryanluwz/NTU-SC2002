package sc2002_lab4;

public class Sphere extends Circle implements Shape3D {
    public Sphere(float radius) {
        super(radius);
    }

    @Override
    public float calArea() {
        return 4 * super.calArea();
    }

    @Override
    public float calVolume() {
        return (float)(4.0 / 3.0 * Math.PI * this.getRadius() * this.getRadius() * this.getRadius());
    }
}
