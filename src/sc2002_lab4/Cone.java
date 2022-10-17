package sc2002_lab4;

public class Cone extends Circle {
    private float hypotenuse;

    public Cone(float radius, float hypotenuse) {
        super(radius);
        this.hypotenuse = hypotenuse;
    }

    public float getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(float hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public float calArea() {
        return super.calArea() + (float) Math.PI * this.getRadius() * this.getHypotenuse();
    }

    @Override
    public void printArea() {
        System.out.printf("Cone of radius %.2f and hypotenuse %.2f has an area of %.3f\n", this.getRadius(), this.getHypotenuse(), this.calArea());
    }
}
