package pack1;

import java.util.*;
public class MixOutPut {
	public static void sort()
	{
	int arr[]= {5,5,6,7,9,2,4,3};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length-1;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	     for(int x:arr)
	   {
		  System.out.print(x+" ");
	   }
	}
	public static void reverse()
	{
		String st="Rakesh";
		String str="";
		for(int i=st.length()-1;i>=0;i--)
		{
			str=str+st.charAt(i);
		}
		System.out.println(str);
	}
	static void palindrome()
	{
		String st="mam";
		String str="";
		for(int i=st.length()-1;i>=0;i--)
		{
			str=str+st.charAt(i);
		}
		if(st.equalsIgnoreCase(str))
			System.out.println("palindrom word");
		else System.out.println("Not a palindrom word");
	}
	static void removeDuplicate()
	{
		int arr[]= {2,5,8,4,6,2,1,1,2,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					arr[j]='@';
			}
		}
		for(int x:arr)
		{
			if(x!='@')
				System.out.print(x+" ");
		}
	}
	static void sumOfInteger()
	{
		int a=45278;
		int sum=0,reminder;
		while(a!=0)
		{
			reminder=a%10;
			sum=sum+reminder;
			a=a/10;
		}
		System.out.println(sum);
	}
	static void checkString()
	{
		String arr[]= {"Rakesh","Ramesh","Rahul"};
		String s1=arr[0].substring(0,2);
		String s2=arr[1].substring(0,2);
		String s3=arr[2].substring(0,2);
		
		if(s1.equals(s2) && s2.equals(s3))
			System.out.println(s1);
		else System.out.println("\"\"");
	}
	public static void replaceAltername()
	{
		String st="Rakesh";
		String str="";
		for(int i=0;i<st.length();i++)
		{
			if(i%2==0)
				str=str+"*";
			else str=str+st.charAt(i);
		}
		System.out.println(str);
	}
	public static void removeDuplicateCharacter()
	{
		String str="aabbacdabcd";
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					arr[i]='@';
			}
		}
		for(char x:arr)
		{
			if(x!='@')
				System.out.print(x);
		}
	}
	static void removeCharacter()
	{
		String str="ababcdabaabd";
		char arr[]=str.toCharArray();
		HashSet<Character> hs=new HashSet<Character>();
		for(char ch:arr)
		{
			hs.add(ch);
		}
		for(char x:hs)
			System.out.print(x);
		
	}
	static void alternameCharacterToUperCase()
	{
		String st="Rakesh";
		String str="";
		for(int i=0;i<st.length();i++)
		{
			if(i%2!=0)
				str=str+st.toUpperCase().charAt(i);
			else str=str+st.toLowerCase().charAt(i);
		}
		System.out.println(str);
	}
	static void characterCount()
	{
		String st="count character";
		char arr[]=st.toCharArray();
		Arrays.sort(arr);
		
		int c;
		for(int i=0;i<arr.length;i=i+c)
		{
			c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					c++;
			}
			System.out.print(arr[i]+"= "+c+", ");
		}
	}
	public static void selectionSort()
	{
		int arr[]= {12,25,36,11,20,4,8};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int x:arr)
			System.out.print(x+" ");
	}
	public static void maxElement()
	{
		int arr[]= {120,25,36,11,20,40,80};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
	}
	public static void maxElement2()
	{
		int arr[]= {12,25,36,11,2,4,8};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>max)
					max=arr[j];
			}
		}
		System.out.println(max);
	}
	public static void sortE()
	{
		Integer arr[]= {12,25,36,11,12,2,4,8};
		Integer max=0;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
			
		}
		System.out.println(max);
		Set<Integer> ts=new LinkedHashSet<Integer>(Arrays.asList(arr));
		
		for(int i=0;i<arr.length;i++) {
		ts.add(arr[i]);
		}
		System.out.println(ts.toString());
		System.out.println(arr[arr.length-1]);
	}
	public static void secondMax()
	{
		Integer arr[]= {12,25,36,110,12,2,4,8};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
	public static void elementSort()
	{
		Integer arr[]= {12,25,36,110,12,2,4,8};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void characterCount2()
	{
		String st="Character count";
		char ch[]=st.toCharArray();
		Arrays.sort(ch);
		int c;
		
		for(int i=0;i<ch.length;i=i+c)
		{
			c=0;
			for(int j=i;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
					c++;
			}
			System.out.print(ch[i]+" = "+c+", ");
		}
	}
	public static void removeVowels()
	{
		String arr[]= {"Rakesh","Aryan","Sumit","Prince"};
		for(String str : arr)
		{
			String st=str.toUpperCase();
			for(int i=0;i<st.length();i++)
			{
				if(!(st.charAt(i)=='A' || st.charAt(i)=='E' || st.charAt(i)=='I' ||
						st.charAt(i)=='O' || st.charAt(i)=='U'))
					System.out.print(st.charAt(i));
				//else System.out.print(st.charAt(i));
			}
			System.out.print(" ");
		}
	}
	public static void removeNumeric()
	{
		String []st= {"Ra552he","55rgkg7","0.,.kkgg","548$#kgj"};
		for(String str: st)
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)>=65 && str.charAt(i)<=91 || 
						str.charAt(i)>=97 && str.charAt(i)<=123)
					System.out.print(str.charAt(i));
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		
		//maxElement2();//maxElement();//selectionSort();//sort();
		//elementSort();//secondMax();//sortE();//reverse();
		//removeVowels();//characterCount2();//palindrome();
		removeNumeric();//removeDuplicate();
		//sumOfInteger();
		//checkString();
		//replaceAltername();
		//removeDuplicateCharacter();
		//removeCharacter();
		//alternameCharacterToUperCase();
		//characterCount();
		
	}

}
