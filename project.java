package file_handling;
import java.io.*;
//import java.io.FileNotFoundException;
import java.util.*;
public class project  {
public static void fun(String a,ArrayList<String> arr)
{try {
	File f=new File(a);
	String s[]=f.list();
	
	for(int i=0;i<s.length;i++)
	{
		//System.out.println("dsed");
		File n=new File(a+"/"+s[i]);
		if(n.isDirectory())
		{
			fun(a+"/"+s[i],arr);
		}
		else
			{arr.add(s[i]+"     ,"+a+"/"+s[i]);
			System.out.println(s[i]+"     "+a+"/"+s[i]);
			}
	}
}
catch(Exception e)
{
	System.out.println(e);
}
}
public static void fun1() throws IOException
{File f=new File("F:/xyz.txt");
ArrayList<String> arr=new ArrayList();

	FileReader r=new FileReader(f);
	BufferedReader b=new BufferedReader(r);
	String s=b.readLine();
	while(s!=null)
	{
		fun(s,arr);
		s=b.readLine();
	}
	File fr=new File("F:/abc.csv");
	fr.createNewFile();
	FileOutputStream w=new FileOutputStream(fr);
	PrintStream p=new PrintStream(w);
	p.println(arr);
}
public static void main(String args[]) throws IOException
{
	fun1();
}

}
