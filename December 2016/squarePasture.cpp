#include <iostream>
#include <cstdio>
#include <fstream>
#include <string>
#include <algorithm>
#include <cmath>
using namespace std;

int main(int argc, const char * argv[]) {
    // insert code here...
    ifstream cin("square.in");
    ofstream cout("square.out");
    int ax1, ay1, ax2, ay2;
    int bx1, by1, bx2, by2;
    cin >> ax1 >> ay1 >> ax2 >> ay2;
    cin >> bx1 >> by1 >> bx2 >> by2;
    
    int xMin = min(ax1, bx1);
    int xMax = max(ax2, bx2);
    int yMin = min(ay1, by1);
    int yMax = max(ay2, by2);
    
    int square_len = max(xMax - xMin, yMax - yMin);
    cout << square_len * square_len << "\n";
    return 0;
}
