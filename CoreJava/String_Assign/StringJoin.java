package String_Assign;

import java.util.StringJoiner;

public class StringJoin {
public static void main(String[] args) {
	StringJoiner s=new StringJoiner(" ");
	s.add("Hello");
	s.add("How are you?");
	System.out.println(s.toString());
	
}
}
