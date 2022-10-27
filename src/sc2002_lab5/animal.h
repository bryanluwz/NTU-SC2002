#include <iostream>
#include <string>
using namespace std;

enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

string getColor(COLOR color)
{
    switch (color)
    {
    case COLOR::Green:
        return "Green";
    case COLOR::Blue:
        return "Blue";
    case COLOR::White:
        return "White";
    case COLOR::Black:
        return "Black";
    case COLOR::Brown:
        return "Brown";
    default:
        return "No color";
    }
}

/*
Animal class
*/
class Animal
{
public:
    Animal() : _name("unknown")
    {
        cout << "Constructing Animal object " << _name << endl;
    }

    Animal(const string n, const COLOR c) : _name(n), _color(c)
    {
        cout << "Constructing Animal object " << _name << " " << getColor(_color) << endl;
    }

    ~Animal()
    {
        cout << "Destructing Animal object " << _name << " " << getColor(_color) << endl;
    }
    virtual void eat() const {}
    virtual void speak() const {}
    virtual void move() const = 0;

protected:
    string _name;
    COLOR _color;
};

/*
Mammal class
*/
class Mammal : public Animal
{
public:
    Mammal(string name, COLOR color) : Animal(name, color)
    {
        cout << "Constructing Mammal object " << _name << " " << getColor(_color) << endl;
    }
    ~Mammal()
    {
        cout << "Destructing Mammal object " << _name << " " << getColor(_color) << endl;
    }

    void eat() const
    {
        cout << "Mammal eats" << endl;
    }

    void move() const
    {
        cout << "Mammal moves" << endl;
    }
};