public class string_manipulation {

	public static void main(String[] args)
	{
		String str = "hEllo WoRld ,I am ARJUN v P.string ManiPulation";
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String sub = str.substring(4,20);
		System.out.println(sub);
		
		String str2 ="   hello   ";
		String trim = str2.trim();
		System.out.println(trim);
		
		String str3 = "hello";
		String str4 = "world";
		System.out.println(str3 + " " +str4);
		
		System.out.println(str3.compareTo("hello")); //0-indicates its same
		
	}
}
