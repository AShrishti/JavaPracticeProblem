package Day2Problems;

import java.util.Scanner;

public class VovelConsonent {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet");
		char x=sc.next().charAt(0);
		
		switch(x){
		
		case('a'):
			System.out.println("vovel");
		break;
		case('e'):
			System.out.println("vovel");
		break;
		case('i'):
			System.out.println("vovel");
		break;
		case('o'):
			System.out.println("vovel");
		break;
		case('u'):
			System.out.println("vovel");
		break;
		default:
			System.out.println("consonent");
			
		}
		
		
		
	}

}
