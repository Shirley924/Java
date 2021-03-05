package HW6;

public class Substraction {
	public String perform(String num1,String num2) {
//		long sub=Integer.valueOf(num1)-Integer.valueOf(num2);
//		return String.valueOf(sub);
		
		String tmp="",output="";
		int a=num1.length(), b=num2.length();
		boolean carry=false;
		
		if(a>b) {
			String N_tmp="";
			for(int i=0;i<a-b;i++) {
				N_tmp+="0";
			}
			N_tmp+=num2;
			num2=N_tmp;
			b=a;
		}else if(b>a) {
			String N_tmp="";
			for(int i=0;i<b-a;i++) {
				N_tmp+="0";
			}
			N_tmp+=num1;
			num1=N_tmp;
			a=b;
		}
		if(num1.compareTo(num2)>0) {
			while(a>0 && b>0) {
			a--; b--;
			if(carry==false) {
				if((num1.charAt(a)-num2.charAt(b))>=0) {
					carry=false;
					tmp+=String.valueOf(num1.charAt(a)-num2.charAt(b));
				}
				else {
					carry=true;
					tmp+=String.valueOf(num1.charAt(a)+10-num2.charAt(b));
				}
			}else {
					if((num1.charAt(a)-1-num2.charAt(b))>=0) {
						carry=false;
						tmp+=String.valueOf(num1.charAt(a)-1-num2.charAt(b));
					}
					else {
						carry=true;
						tmp+=String.valueOf(num1.charAt(a)-1+10-num2.charAt(b));
					}
				}
			}
			if(carry==true)
				tmp+="-";
			for(int i=tmp.length()-1;i>=0;i--) {
				output+=String.valueOf(tmp.charAt(i));
			}
		}else if(num1.compareTo(num2)==0)
			output="0";
		else {
			Substraction sub=new Substraction();
			output="-"+sub.perform(num2, num1);
		}
		int k=0;
		for(k=0;k<output.length()-1;k++) {
			if(output.charAt(k)!='0') {
				break;
			}
		}
		output=output.substring(k, output.length());
		
		return output;
	}
}
