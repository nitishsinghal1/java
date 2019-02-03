import java.io.*;
import java.util.*;
class FileDemo
{
	 public static void main (Strings[] args)
 {
	try
 {
	  File f= new File("data.txt");
	  Filewriter foutv = new filewriter(f);
	  Bufferedwriter bout =new bufferedwriter (fout);
	  Scanner sc =new Scanner (System.in);
	  boolean flag =true ;

	  whlile(flag);
	{
	 System.out.print("Enter S.No:");
	 bout .write (Integer.tostring(sc.nextInt()));
	 bout.write(' ');
	 System.out.print("Enter NAME:");
	 bout .write (sc.nextInt());
	 bout.write(' ');
	 System.out.print("Enter CGPA:");
	 bout .write(Float.tostring(sc.nextInt()));
	 bout.write(' ');
	 System.out.print("Enter Grade:(A/B/C/D):");
	 bout .write(sc.nextInt().charAt(0));
	 bout.newline();
	 System.out.print("\n Do you want to continue enter");
	 char c=sc.next().charAt(0);
	 if (c =='n' || c=='N')
	 {
	    flag=false;
     }
    }
bout.close();
Filereader fin =new Filereader (f);
BufferedReadervbin=new BufferedReader(fin);
String sr;
System.out.println("The contents of the file");
while ((sr=bin.readLine())!=null)
     {
     	String[] strs =sr.split (" ");
	    System.out.println((strs[0])+ " " +strs[1]+ " ");
      }
}
catch (Exception e)
  {e.printStackTrace();}
}
}