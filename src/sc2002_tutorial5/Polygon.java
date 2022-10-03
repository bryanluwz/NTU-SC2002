package sc2002_tutorial5;

public abstract class Polygon {
    public enum KindOfPolygon {
        POLY_PLAIN, POLY_RECT, POLY_TRIANG
    };

    protected String name;
    protected float width;
    protected float height;
    protected KindOfPolygon polytype;

    public Polygon(String name, float width, float height) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.polytype = KindOfPolygon.POLY_PLAIN;
    }

    public KindOfPolygon getPolytype() {
        return polytype;
    }

    public void setPolytype(KindOfPolygon polytype) {
        this.polytype = polytype;
    }

    public String getName() {
        return name;
    }

    public abstract float calArea();

    public void printWidthHeight() {
        System.out.println("Wdith = " + width + " Height = " + height);
    }
}
