//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, String> book = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			String phone=String.valueOf(in.nextInt());
			in.nextLine();
            book.put(name,phone);
		}
        for (int i = 0; i < n; i++) {
            if(in.hasNext())
            {
                String name = in.nextLine();
                System.out.println(book.get(name)==null? "Not found": (String.format("%s=%s",name,book.get(name))));
            }
        }
		
	}
}



