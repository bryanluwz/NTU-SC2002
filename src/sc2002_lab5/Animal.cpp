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

class Animal
{
public:
    Animal() : _name("unknown")
    {
        cout << "Constructing Animal object " << _name << endl;
    }

    Animal(const string n, const COLOR c) : _name(n), _color(c)
    {
        cout << "Constructing Animal object " << _name << " " << _color << endl;
    }

    ~Animal()
    {
        cout << "Destructing Animal object " << _name << endl;
    }
    void speak() const
    {
        cout << "Animal speaks " << endl;
    }
    void move() const {}

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
public:
    Mammal(string name, COLOR color) : Animal(name, color) {}
    ~Mammal() {

    }

    void eat() const
    {
        cout << "Mammal eat " << endl;
    }
};

int main()
{
    // Animal a("Doggo", COLOR::Green);
    // a.speak();
    // cout << "Program exiting .... " << endl;

    Mammal m("Doggo", COLOR::Green);
    m.speak();
    m.eat();
    cout << "Program exiting .... " << endl;
    return 0;
}