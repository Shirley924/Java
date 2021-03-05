package HW3;
import java.util.Scanner;

public class MultipleofPrime {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		MultipleofPrime test=new MultipleofPrime();
		String option=keyboard.next();
		String[] sub=option.split("=");
		
		//check whether x is true
		if(sub[0].contentEquals("X")){
			int x=test.check(Integer.parseInt(sub[1]));
			if(x==1)
				System.out.println("true");
			else
				System.out.println("false");
		}		
		//count the Nth number
		else if(sub[0].contentEquals("Y")) {
			int y=Integer.parseInt(sub[1]);
			int count=0,current=0;
			while(count<y) {
				current++;
				if(test.check(current)==1)
					count++;
			}
			System.out.println(current);
		}
	}
	
	public int check(int input) {
		while(input%2==0)
			input/=2;
		while(input%3==0)
			input/=3;
		while(input%5==0)
			input/=5;
		return input;
	}

}
