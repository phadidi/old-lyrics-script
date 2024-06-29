import java.io.*;
import java.util.Scanner; 

public class TwoLyrics {

  public static void main(String[] args) {

    try {
      //BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
	  File f1 = new File("1.txt");
	  BufferedReader f1r = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
	  File f2 = new File("2.txt");
	  Scanner sc1 = new Scanner(f1r);
	  Scanner sc2 = new Scanner(f2);
	  String st1, st2;
      while (sc1.hasNextLine() == true && sc2.hasNextLine() == true) {
    	st1 = sc1.nextLine();
    	st2 = sc2.nextLine();
    	System.out.println(st1);
    	if (st2.compareTo(st1) != 0) {
    		System.out.print("-");
    		System.out.println(st2);
    	}
        //out.write(st1);
		//out.write(st2);
	  }
      sc1.close();
      sc2.close();
      //out.close();

    } catch (FileNotFoundException | UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }
}