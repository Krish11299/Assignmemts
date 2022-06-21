package String_Assign;

public class StringReverse {
public static void main(String[] args) {
	String s="This method returns the reversed object on which it was called";
	StringBuffer sb=new StringBuffer(s);
	System.out.println("Orginal String : "+sb);
	System.out.println("Reversed String : "+sb.reverse());
	
}
}
