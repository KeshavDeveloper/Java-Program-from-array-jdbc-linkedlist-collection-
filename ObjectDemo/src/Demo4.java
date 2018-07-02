import java.util.*;
public class Demo4 
{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(1);
		a.add("keshav rajbanshi");
		a.add("rupak");
		a.add(45.87);
		a.add('a');
		
		
		//System.out.println(a);
	// System.out.println(a.size());
	// System.out.println(a.indexOf("rupak"));
	// Object ab[] =a.toArray();
	 
	 for(Object o:a)
	 {
		 System.out.println(o);
	 }
		
	}

}
