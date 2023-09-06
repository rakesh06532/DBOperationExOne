package CollectionDemo;

import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("Rakesh");
		st.push("Aryan");
		st.push("Prince");
		st.push("Sohani");
		st.push("Lilam");
		st.push("Rakesh");
		st.push("Aryan");
		
		st.pop();
		
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(st.size());
	}

}
