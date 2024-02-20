#include <iostream>
#include <string>
 int main() {
    std:: string name;

    std:: cout << "enter your name: ";
    std:: getline(std::cin, name);

    //reverse name
    std:: string reversedName(name.rbegin(), name.rend());

    std:: cout << "Reversed name:" << reversedName << std::endl;
     return 0;
 } 