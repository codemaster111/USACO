/***********************************************************
 * Codemaster111								   
 * USACO December 2019 Bronze #2 - Where Am I?
 * Completion Status: 10/10		   
 ***********************************************************/
import java.io.*;
import java.util.*;

public class whereami {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("whereami.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("whereami.out")));
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    br.close();

    for (int len = 1; len <= n; len++) {
      HashSet<String> set = new HashSet<String>();
      for (int i = 0; i <= n - len; i++) {
        set.add(s.substring(i, i + len));
      }
      if (set.size() == n - len + 1) {
        pw.println(len);
        pw.close();
        System.exit(0);
      }
    }
  }
}
