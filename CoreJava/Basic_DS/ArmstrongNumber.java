package Basic_DS;
import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int temp=n;
	int sum=0;
	while(n!=0) {
		int digit = n%10;
		sum=sum+(digit*digit*digit);
		n/=10;
	}
	if(sum==temp) {
		System.out.println(temp+" is an Armstrong Number.");
	}else {
		System.out.println(temp+" is not an Armstrong Number.");
	}
}
}
