#include <iostream>
using namespace std;

class A
{
public:
    int a, b;

public:
    A(int x = 0, int y = 0)
    {
        a = x;
        b = y;
    }

    virtual void print();
};

class B : public A
{
private:
    float p, q;

public:
    B(int m, int n, float u, float v)
    {
        p = u;
        q = v;
    }

    B() { p = q = 0; }

    void input(float u, float v);

    virtual void print(float);
};

void A::print(void)
{
    cout << "A values: " << a << " " << b << "\n";
}

A operator+(A a, A b)
{
    return A(a.a + b.a, a.b + b.b);
}

void B::print(float)
{
    cout << "B values : " << p << " " << q << "\n";
}

void B::input(float x, float y)
{
    p = x;
    q = y;
}

int doubleIt(A a) { return a.a * a.a; }

int main()
{
    A a1(10, 20), *ptr;
    B b1;
    b1.input(7.5, 3.142);
    ptr = &a1;
    ptr->print();
    ptr = &b1;
    ptr->print();

    A a2(20, 30);
    A a3 = a1 + a2;
    a3.print();
    return 0;
}
