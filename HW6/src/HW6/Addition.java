package HW6;

public class Addition implements IOperation {
	public String perform(String num1,String num2) {
		String tmp="",output="";
		int a=num1.length(), b=num2.length();
		int carry=0;
		while(a>0 && b>0) {
			a--; b--;
			tmp+=String.valueOf((num1.charAt(a)-48+num2.charAt(b)-48+carry)%10);
			carry=(num1.charAt(a)-48+num2.charAt(b)-48+carry)/10;
		}
		if(a>0) {
			while(a>0) {
				a--;
				tmp+=String.valueOf((num1.charAt(a)-48+carry)%10);
				carry=(num1.charAt(a)-48+carry)/10;
				
			}
		}else if(b>0) {
			while(b>0) {
				b--;
				tmp+=String.valueOf((num2.charAt(b)-48+carry)%10);
				carry=(num2.charAt(b)-48+carry)/10;
			}
		}
		if(carry>0)
			tmp+=String.valueOf(carry);
		for(int i=tmp.length()-1;i>=0;i--) {
			output+=String.valueOf(tmp.charAt(i));
		}
		return output;
		
//		if(num1.charAt(0)!='-' && num2.charAt(0)!='-') {
//			if(a>b) {
//				String t="";
//				for(int i=0;i<a-b;i++) {
//					t+="0";
//				}
//				t+=num2;
//				num2=t;
//			}else if(b>a) {
//				String t="";
//				for(int i=0;i<b-a;i++) {
//					t+="0";
//				}
//				t+=num1;
//				num1=t;
//			}
//		}
		
	}
}
