package sc2002_tutorial5;

public class Triangle extends Polygon {
    public Triangle(String name, float width, float height) {
        super(name, width, height);
        super.setPolytype(KindOfPolygon.POLY_TRIANG);
    }

    public float calArea() {
        return this.width * this.height / 2;
    }
}
