#include <iostream>
// #include <algorithm>
using namespace std;

string reverseStr(string str){
    int n = str.length();
    for(int i = 0; i<n/2; i++)
    {
        swap(str[i], str[n-i-1]);
    }
    return str;
}

int main()
{
    string a, b;
    cin >> a >> b;

    a = reverseStr(a);
    b = reverseStr(b); 

    int a_rev = stoi(a);
    int b_rev = stoi(b);

    if(a_rev > b_rev)
        cout << a_rev << endl;
    else
        cout << b_rev << endl;
}