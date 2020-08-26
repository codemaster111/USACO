/**********************************************************
 * Codemaster111
 * USACO December 2019 Bronze #1 - Cow Gymnastics
 * Completion Status: 10/10		   
 **********************************************************/
import java.util.*;
import java.io.*;
class gymnastics {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    ArrayList<String> aList = new ArrayList<String>();
    int[][] data = new int[k][n];
    for (int i = 0; i < k; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        data[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    br.close();

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        aList.add(data[0][i] + " " + data[0][j]);
        pw.println(aList.get(aList.size() - 1));
      }
    }

    for (int i = 1; i < k; i++) {
      for (int j = 0; j < n; j++) {
        for (int l = j + 1; l < n; l++) {
          String curr = data[i][j] + " " + data[i][l];
          if (aList.contains(data[i][l] + " " + data[i][j])) {
            aList.remove(aList.indexOf(data[i][l] + " " + data[i][j]));
          }
        }
      }
    }
    pw.println(aList.size());
    pw.close();
  }
}
