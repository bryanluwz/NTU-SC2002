#ifndef ANIMAL_H
#define _H
#include "animal.h"
#endif

using namespace std;

/*
Dog class
*/
class Dog : public Mammal
{
protected:
    string _owner;

public:
    Dog(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner)
    {
        cout << "Constructing Dog object " << _name << " " << getColor(_color) << " " << _owner << endl;
    }

    ~Dog()
    {
        cout << "Destructing Dog object " << _name << " " << getColor(_color) << " " << _owner << endl;
    }

    void eat() const
    {
        cout << "Dog eats" << endl;
    }

    void speak() const
    {
        cout << "Woof" << endl;
    }

    void move() const
    {
        cout << "Dog moves" << endl;
    }
};

/*
Cat class
*/
class Cat : public Mammal
{
protected:
    string _owner;

public:
    Cat(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner)
    {
        cout << "Constructing Cat object " << _name << " " << getColor(_color) << " " << _owner << endl;
    }

    ~Cat()
    {
        cout << "Destructing Cat object " << _name << " " << getColor(_color) << " " << _owner << endl;
    }

    void eat() const
    {
        cout << "Cat eats" << endl;
    }

    void speak() const
    {
        cout << "Meow" << endl;
    }

    void move() const
    {
        cout << "Cat moves" << endl;
    }
};

class Lion : public Mammal
{
protected:
    string _owner;

public:
    Lion(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner)
    {
        cout << "Constructing Lion object " << _name << " " << getColor(_color) << " " << _owner << endl;
    }

    ~Lion()
    {
        cout << "Destructing Lion object " << _name << " " << getColor(_color) << " " << _owner << endl;
    }

    void eat() const
    {
        cout << "Lion eats" << endl;
    }

    void speak() const
    {
        cout << "Roar" << endl;
    }

    void move() const
    {
        cout << "Lion moves" << endl;
    }
};
