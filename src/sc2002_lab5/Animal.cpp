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
        cout << "Constructing Animal object " << _name << " " << _color << endl;
    }

    ~Animal()
    {
        cout << "Destructing Animal object " << _name << endl;
    }
    virtual void speak() const {}
    virtual void move() const = 0;

private:
    string _name;
    COLOR _color;
};

/*
Mammal class
*/
class Mammal : public Animal
{
public:
    Mammal(string name, COLOR color) : Animal(name, color) {}
    ~Mammal() {}

    void eat() const
    {
        cout << "Mammal eat " << endl;
    }

    void move() const
    {
        cout << "Mammal move" << endl;
    }
};

/*
Dog class
*/
class Dog : public Mammal
{
private:
    string _owner;

public:
    Dog(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {}

    void speak() const
    {
        cout << "Woof" << endl;
    }

    void move() const
    {
        cout << "Dog move" << endl;
    }
};

int main()
{
    // Part 1
    /*
    // Animal object
    // Animal animal("Animal", COLOR::Green);
    // animal.speak();

    // system("PAUSE");

    // Mammal object
    Mammal mammal("Mammal", COLOR::Brown);
    // mammal.speak();
    mammal.eat();
    mammal.move();

    system("PAUSE");

    // Dog object
    Dog dog("Dog", COLOR::Brown, "Bob");
    dog.speak();
    dog.eat();
    dog.move();

    system("PAUSE");

    cout << "Program exiting .... " << endl;
    */

    Animal *animalPtr = new Dog("Lassie", COLOR::White, "Andy");
    animalPtr->speak();
    animalPtr->move();

    animalPtr->~Animal();

    return 0;
}