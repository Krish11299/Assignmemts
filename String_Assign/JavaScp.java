package String_Assign;

public class JavaScp {
public static void main(String[] args) {
	String s="Java String pool refers to the collection of Strings which are stored in heap memory";
	String sLower=s.toLowerCase();
	System.out.println(sLower);
	String sUpper=s.toUpperCase();
	System.out.println(sUpper);
	String strreplace=s.replace('a', '$');
	System.out.println(strreplace);
	System.out.println(s.contains("collection"));
	String compare="java string pool refers to collection of strings which are stored in heap memory";
	System.out.println(s.equals(compare));
	System.out.println(s.equalsIgnoreCase(s));
}
}
