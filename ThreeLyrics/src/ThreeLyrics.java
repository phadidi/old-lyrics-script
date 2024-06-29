import java.io.*;
import java.util.Scanner; 

public class ThreeLyrics {

  public static void main(String[] args) {

    try {
      //BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
	  File f1 = new File("1.txt");
	  BufferedReader f1r = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
	  File f2 = new File("2.txt");
	  BufferedReader f2r = new BufferedReader(new InputStreamReader(new FileInputStream(f2), "UTF-8"));
	  File f3 = new File("3.txt");
	  BufferedReader f3r = new BufferedReader(new InputStreamReader(new FileInputStream(f3), "UTF-8"));
	  Scanner sc1 = new Scanner(f1r);
	  Scanner sc2 = new Scanner(f2r);
	  Scanner sc3 = new Scanner(f3r);
	  String st1, st2, st3;
      while (sc1.hasNextLine() == true && sc2.hasNextLine() == true && sc3.hasNextLine()) {
    	st1 = sc1.nextLine();
    	st2 = sc2.nextLine();
    	st3 = sc3.nextLine();
    	System.out.println(st1);
    	if (st2.compareTo(st1) != 0)
    		System.out.println(st2);
    	if (st3.compareTo(st1) != 0 && st3.compareTo(st2) != 0) {
    		System.out.print("-");
    		System.out.println(st3);
    	}
        
	  }
      sc1.close();
      sc2.close();
      sc3.close();

    } catch (FileNotFoundException | UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }
}