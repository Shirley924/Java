package HW4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Babylonian {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("##.##");
		double input=keyboard.nextDouble();
		double guess=input/2,pre_guess=input;
		
		while(guess<pre_guess*0.99) {			
			pre_guess=guess;
			guess=(guess+input/guess)/2;
		}
		System.out.println(df.format(guess));
//		System.out.printf("%2.2f", guess);
	}

}
