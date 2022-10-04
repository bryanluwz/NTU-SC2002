package sc2002_tutorial5;

public class Rectangle extends Polygon {
    public Rectangle(String name, float width, float height) {
        super(name, width, height);
        super.setPolytype(KindOfPolygon.POLY_RECT);
    }

    public float calArea() {
        return this.width * this.height;
    }
}
