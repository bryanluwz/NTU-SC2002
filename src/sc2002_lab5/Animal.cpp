#ifndef CHILDANIMAL_H
#define _H
#include "childAnimal.h"
#endif

#include <iostream>
#include <string>
using namespace std;

COLOR getColorFromUser()
{
    int colorChoice;
    COLOR color;

    do
    {
        cout << "Please choose a colour:" << endl;
        cout << "1. Green" << endl;
        cout << "2. Blue" << endl;
        cout << "3. White" << endl;
        cout << "4. Black" << endl;
        cout << "5. Brown" << endl;

        cin >> colorChoice;

        switch (colorChoice)
        {
        case 1:
            color = COLOR::Green;
            break;
        case 2:
            color = COLOR::Blue;
            break;
        case 3:
            color = COLOR::White;
            break;
        case 4:
            color = COLOR::Black;
            break;
        case 5:
            color = COLOR::Brown;
            break;
        default:
            cout << "Oops that is not an option :(" << endl
                 << endl;
            break;
        }
    } while (!(0 < colorChoice && colorChoice < 6));

    return color;
}

void printMenu()
{
    cout << "\nSelect an animal to send to the Zoo:" << endl;
    cout << "(1) Dog" << endl;
    cout << "(2) Cat" << endl;
    cout << "(3) Lion" << endl;
    cout << "(4) Move all animals" << endl;
    cout << "(5) Quit" << endl;
}

int main()
{
    // Initialise array for Mammals that are selected to go to the zoo
    // and also other pointers
    Mammal *mammalPtr[3] = {NULL, NULL, NULL};
    Dog *dogPtr;
    Cat *catPtr;
    Lion *lionPtr;

    // Welcome message
    cout << "Welcome user! We will make a dog, a cat and a lion." << endl;

    // Initialise dog, cat and lion with user inputs
    string name, owner;
    COLOR color;

    // Dog
    cout << "Please input the name of the dog: ";
    cin >> name;

    color = getColorFromUser();

    cout << "Please input the owner of the dog: ";
    cin >> owner;

    dogPtr = new Dog(name, color, owner);

    // Cat
    cout << "Please input the name of the cat: ";
    cin >> name;

    color = getColorFromUser();

    cout << "Please input the owner of the cat: ";
    cin >> owner;

    catPtr = new Cat(name, color, owner);

    // Lion
    cout << "Please input the name of the lion: ";
    cin >> name;

    color = getColorFromUser();

    cout << "Please input the owner of the lion: ";
    cin >> owner;

    lionPtr = new Lion(name, color, owner);

    // Main menu for user
    int userChoice;
    do
    {
        printMenu();

        cin >> userChoice;

        switch (userChoice)
        {
        case 1:
            mammalPtr[0] = dogPtr;
            cout << "Selected Dog to move to the zoo" << endl;
            break;

        case 2:
            mammalPtr[1] = catPtr;
            cout << "Selected Cat to move to the zoo" << endl;
            break;

        case 3:
            mammalPtr[2] = lionPtr;
            cout << "Selected Lion to move to the zoo" << endl;
            break;

        case 4:
            cout << "Moving all animals...\n"
                 << endl;
            for (size_t i = 0; i < 3; i++)
            {
                if (mammalPtr[i] != NULL)
                {
                    mammalPtr[i]->move();
                    mammalPtr[i]->speak();
                    mammalPtr[i]->eat();
                    cout << endl;
                }
            }
            break;

        case 5:
            break;

        default:
            cout << "Invalid choice! :3" << endl;
            break;
        }
    } while (userChoice != 5);

    // Destruction
    dogPtr->~Dog();
    catPtr->~Cat();
    lionPtr->~Lion();

    cout << "Bye Bye! :3" << endl;

    return 0;
}

/*
Inputs for the animals thing
Doggo
1
Caesar
Oyen
4
Bobby
Lyon
2
NTU

*/