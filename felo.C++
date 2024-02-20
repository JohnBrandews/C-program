#include<iostream>
#include<cmath>
using namespace std;
int main () {
    double a,b,c,x1,x2,discriminant;
    cout << "enter value a" << endl;
    cin>>a;
    cout<< "enter value b" << endl;
    cin>>b;
    cout<< "enter value c" << endl;
    cin>>c;
    discriminant = b*b-4*a*c;
    if(discriminant >= 0)
    {
        x1 = (-b + sqrt(discriminant))/(2*a);
        x2 = (-b - sqrt(discriminant))/(2*a);
        cout<< "the roots are " << x1 <<" and " << x2 <<endl;
    }
    else
    {
        cout<< "the roots are complex" << endl;
    }
    return 0;
}
