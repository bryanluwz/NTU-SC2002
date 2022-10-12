package sc2002_lab4;

public class Pyramid extends Triangle implements Shape3D {
    public Pyramid(float height, float base) {
        super(height, base);
    }

    @Override
    public float calArea() {
        return (float) (this.getBase() * this.getBase() + 2 * this.getBase() * Math.sqrt((this.getBase() * this.getBase() / 4) + this.getHeight() * this.getHeight()));
    }

    @Override
    public float calVolume() {
        return this.getBase() * this.getBase() * this.getHeight() / 3;
    }
}
