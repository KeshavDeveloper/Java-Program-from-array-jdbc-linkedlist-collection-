import java.util.Scanner;
import java.util.Stack;
public class StringBalance {
	public static void main(String[] args)
	{
		Stack stk=new Stack();
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(c=='{'|| c=='['||c=='(')
			{
				stk.push(c);
				
			}
			else
			{
				
				if(stk.isEmpty())
				{
					System.out.println("not balanced");
					return;
				}
				char ch=(char)stk.pop();
				switch(c)
				{
				
				case '}' : if(c!='{')
				{
					
					System.out.println("not balanced");
					return;
				}
				break;
				case ']' : if(c!='[')
				{
					
					System.out.println("not balanced");
					return;
				}
				break;
				
				
				
				case ')' : if(c!=')')
				{
					
					System.out.println("not balanced");
					return;
				}
				
				
				
				
			}
				
				
		}
		
		
		}
	}
}


