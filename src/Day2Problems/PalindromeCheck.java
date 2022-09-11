package Day2Problems;

public class PalindromeCheck {
	

	public static void main(String[] args) {
		int n=122,rev=0,rem;
	
	for(;n!=0;n=n/10)
	{
		rem=n%10;
		rev= rev*10+rem;
		}
	
	if(rev==n)
		System.out.println("Number is Palindromre");
	else
		System.out.println("Number is not Palindrome");
	}
}
