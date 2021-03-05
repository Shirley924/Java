package HW6;

public class Comparison {
	public String perform(String num1,String num2) {
//		long add=Integer.valueOf(num1)-Integer.valueOf(num2);
//		return String.valueOf(add);
		
		String output;
		int a=num1.length(), b=num2.length();
		if(num1.charAt(0)!='-' && num2.charAt(0)!='-') {
			if(a>b) {
				String N_tmp="";
				for(int i=0;i<a-b;i++) {
					N_tmp+="0";
				}
				N_tmp+=num2;
				num2=N_tmp;
			}else if(b>a) {
				String N_tmp="";
				for(int i=0;i<b-a;i++) {
					N_tmp+="0";
				}
				N_tmp+=num1;
				num1=N_tmp;
			}
			if(num1.compareTo(num2)>0)
				output="larger";
			else if(num1.compareTo(num2)==0)
				output="equal";
			else
				output="smaller";
		}else if(num1.charAt(0)=='-' && num2.charAt(0)=='-') {
			num1=num1.substring(1, a);
			num2=num2.substring(1, b);
			if(a>b) {
				String N_tmp="";
				for(int i=0;i<a-b;i++) {
					N_tmp+="0";
				}
				N_tmp+=num2;
				num2=N_tmp;
			}else if(b>a) {
				String N_tmp="";
				for(int i=0;i<b-a;i++) {
					N_tmp+="0";
				}
				N_tmp+=num1;
				num1=N_tmp;
			}
			if(num1.compareTo(num2)>0)
				output="smaller";
			else if(num1.compareTo(num2)==0)
				output="equal";
			else
				output="larger";
		}else if(num1.charAt(0)=='-')
			output="smaller";
		else
			output="larger";
		
		return output;
	}
}
