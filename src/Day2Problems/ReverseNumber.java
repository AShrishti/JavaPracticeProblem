package Day2Problems;

public class ReverseNumber {
	
	
	
	public static void main(String[] args) {
		int n=231,reverse=0;
	while(n>0) {	
		int r=n%10;
		reverse=reverse*10+r;
		n=n/10;
		//n/=10;
	}
		System.out.println("reverse no is: "+reverse);
		
	
}
}