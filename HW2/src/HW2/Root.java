package HW2;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Root {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		double a=keyboard.nextDouble();
		double b=keyboard.nextDouble();
		double c=keyboard.nextDouble();
		double x1,x2;
		String s=keyboard.next();
		DecimalFormat pat=new DecimalFormat(s);
			
		x1=Math.pow(b, 2.)-4*a*c;
		x1=Math.sqrt(x1);
		x1=((-1)*b+x1)/(2*a);
		x2=Math.pow(b, 2.)-4*a*c;
		x2=Math.sqrt(x2);
		x2=((-1)*b-x2)/(2*a);
		
		System.out.println(pat.format(x1)+'\n'+pat.format(x2));
	}

}
