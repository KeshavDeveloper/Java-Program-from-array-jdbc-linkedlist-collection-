package org.bufferDemo;
import java.io.*;

public class FileExample 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter f=new FileWriter(" E:/HTMLprogram/Date.txt",true);
		BufferedWriter bw=new BufferedWriter(f);
		bw.write("MY name is keshav raj rajbanshi");
		bw.close();
		
	}

}
