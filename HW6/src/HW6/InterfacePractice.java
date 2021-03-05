package HW6;
import java.util.Scanner;

public class InterfacePractice {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String input=keyboard.nextLine();
		String output;
		String[] num=input.split(" ");
		
		output=num[0];
		
		for(int i=1;i<num.length;i+=2) {			
			if(num[i].equals("+")) {					
				if(output.charAt(0)!='-' && num[i+1].charAt(0)!='-') {
					Addition add=new Addition();
					output=add.perform(output, num[i+1]);
				}else if(output.charAt(0)=='-' && num[i+1].charAt(0)=='-') {
					String t="-",t_output=output.substring(1, output.length()),t_n=num[i+1].substring(1, num[i+1].length());
					Addition add=new Addition();
					t+=add.perform(t_output, t_n);
					output=t;
				}else if(output.charAt(0)=='-') {
					Substraction sub=new Substraction();
					String t_output=output.substring(1, output.length());
					output=sub.perform(num[i+1], t_output);
				}else {
					Substraction sub=new Substraction();
					String t_n=num[i+1].substring(1, num[i+1].length());
					output=sub.perform(output, num[i+1]);
				}
			}else if(num[i].equals("-")) {
				if(output.charAt(0)!='-' && num[i+1].charAt(0)!='-') {
					Substraction sub=new Substraction();
					output=sub.perform(output, num[i+1]);
				}else if(output.charAt(0)=='-' && num[i+1].charAt(0)=='-'){
					String t="-",t_output=output.substring(1, output.length()),t_n=num[i+1].substring(1, num[i+1].length());
					Substraction sub=new Substraction();
					output=sub.perform(t_n, t_output);
				}else if(output.charAt(0)=='-') {
					String t_output=output.substring(1, output.length());
					Addition add=new Addition();
					output="-"+add.perform(t_output, num[i+1]);
				}else {
					Addition add=new Addition();
					String t_n=num[i+1].substring(1, num[i+1].length());
					output=add.perform(output, t_n);
				}
				
			}else {
				Comparison com=new Comparison();
				output=com.perform(output, num[i+1]);
				if(num[i].equals("<")) {
					if(output.contentEquals("smaller"))
						output="true";
					else
						output="false";
				}else if(num[i].equals(">")) {
					if(output.contentEquals("larger"))
						output="true";
					else
						output="false";
				}else {
					if(output.contentEquals("equal"))
						output="true";
					else
						output="false";
				}
			}
		}
		System.out.println(output);
	}
}
