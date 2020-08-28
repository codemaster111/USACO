/**********************************************************
 * Codemaster111
 * USACO February 2020 Bronze #1 - Triangles
 * Completion Status: 10/10		   
 **********************************************************/
#include <bits/stdc++.h>
using namespace std;

ifstream fin("triangles.in");
ofstream fout("triangles.out");

const int MxN = 100;
vector<pair<int, int>> points(MxN);

int main() {
  int n;
  fin >> n;
  for (int i = 0; i < n; i++) {
    fin >> points[i].first >> points[i].second;
  }

  int area = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      for (int k = j + 1; k < n; k++) {
        pair<int, int> a = points[i];
        int x1 = a.first, y1 = a.second;
        pair<int, int> b = points[j];
        int x2 = b.first, y2 = b.second;
        pair<int, int> c = points[k];
        int x3 = c.first, y3 = c.second;
        if ((x1 == x2 || x1 == x3 || x2 == x3) && (y1 == y2 || y1 == y3 || y2 == y3)) {
          int maxX = max(x1, max(x2, x3));
          int minX = min(x1, min(x2, x3));
          int maxY = max(y1, max(y2, y3));
          int minY = min(y1, min(y2, y3));
          int currArea = (maxX - minX) * (maxY - minY);
          area = max(currArea, area);
        }
      }
    }
  }

  fout << area << endl;
}
