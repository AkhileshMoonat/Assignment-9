import java.io.*;
import java.util.*;
class File_paths
{
public static void main(String args[]) throws IOException
 { 
	File f  = new File("abc.txt");
	Scanner scan = new Scanner(f); 
    while (scan.hasNextLine()) 
    System.out.println(scan.nextLine()); 
}
}