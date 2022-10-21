#include <iostream>
#include <string>

using namespace std;

enum KindOfPolygon
{
    POLY_PLAIN,
    POLY_RECT,
    POLY_TRIANGLE
};

class Polygon
{
protected:
    string name;
    float width;
    float height;
    KindOfPolygon polyType;

public:
    Polygon(string n, float w, float h) : name(n), width(w), height(h)
    {
        setPolytype(KindOfPolygon::POLY_PLAIN);
    }

    ~Polygon() {}

    void setPolytype(KindOfPolygon p)
    {
        polyType = p;
    }

    KindOfPolygon getPolytype()
    {
        return polyType;
    }

    string getName()
    {
        return name;
    }

    virtual float calArea() = 0;

    void printWidthHeight()
    {
        cout << "Width = " << width << " Height = " << height << endl;
    }
};

class Rectangle : public Polygon
{
public:
    Rectangle(string n, float w, float h) : Polygon(n, w, h)
    {
        setPolytype(KindOfPolygon::POLY_RECT);
    }

    ~Rectangle() {}

    float calArea()
    {
        return width * height;
    }
};

class Triangle : public Polygon
{
public:
    Triangle(string n, float w, float h) : Polygon(n, w, h)
    {
        setPolytype(KindOfPolygon::POLY_TRIANGLE);
    }

    ~Triangle() {}

    float calArea()
    {
        return width * height / 2;
    }
};

void printArea(Polygon *p)
{
    string pt;
    switch (p->getPolytype())
    {
    case KindOfPolygon::POLY_PLAIN:
        pt = "PLAIN";
        break;
    case KindOfPolygon::POLY_RECT:
        pt = "Rectangle";
        break;
    case KindOfPolygon::POLY_TRIANGLE:
        pt = "Triangle";
        break;
    default:
        pt = "PLAIN";
        break;
    }
    cout << "Area of " << pt << ": " << p->calArea() << endl;
}

int main()
{
    Rectangle *rect = new Rectangle("Jesus", 10, 10);
    Triangle *triangle = new Triangle("Christ", 10, 10);

    printArea(rect);
    printArea(triangle);
}