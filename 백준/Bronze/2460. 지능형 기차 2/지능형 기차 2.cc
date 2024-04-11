#include <iostream>
using namespace std;

int main()
{
    int x, y; // x : get out, y : get in
    int sum = 0;
    int max = 0;
    for (int i = 0; i < 10; i++)
    {
        cin >> x >> y;
        sum += y - x;
        if(sum > max)
        {
            max = sum;
        }
    }
    cout << max << endl;
}