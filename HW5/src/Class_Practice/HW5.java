package Class_Practice;
import java.util.Scanner;
import java.util.ArrayList;

public class HW5 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		
		String mode=keyboard.nextLine();
		String data=keyboard.nextLine();
		
		if(mode.contentEquals("A")) {
			HW5 hw=new HW5();
			if(data.contentEquals("Document")) {
				Document D=new Document();
				D.setText(keyboard.nextLine());
				hw.PrintOut(D);
				
			}else if(data.contentEquals("Email")) {
				Email E=new Email();
				E.setSender(keyboard.nextLine());
				E.setRecipient(keyboard.nextLine());
				E.setTitle(keyboard.nextLine());
				E.setText(keyboard.nextLine());
				hw.PrintOut(E);
				
			}else if(data.contentEquals("File")) {
				File F=new File();
				F.setPathname(keyboard.nextLine());
				F.setText(keyboard.nextLine());
				hw.PrintOut(F);
			}
		}else if(mode.contentEquals("B")) {
			if(data.contentEquals("Document")) {
				Document D=new Document();
				D.setText(keyboard.nextLine());
				
				System.out.println(D.text.contains(keyboard.nextLine()));
			}else if(data.contentEquals("Email")) {
				Email E=new Email();
				E.setSender(keyboard.nextLine());
				E.setRecipient(keyboard.nextLine());
				E.setTitle(keyboard.nextLine());
				E.setText(keyboard.nextLine());
				
				System.out.println(E.text.contains(keyboard.nextLine()));
			}else if(data.contentEquals("File")) {
				File F=new File();
				F.setPathname(keyboard.nextLine());
				F.setText(keyboard.nextLine());
				
				System.out.println(F.text.contains(keyboard.nextLine()));
			}
		}else if(mode.contentEquals("C")) {
			if(data.contentEquals("Document")) {
				Document D=new Document();
				D.setText(keyboard.nextLine());
				
				String instance=keyboard.nextLine();
				if(instance.contentEquals("text"))
					D.setText(keyboard.nextLine());
			
				System.out.println(D.toString());
			}else if(data.contentEquals("Email")) {
				Email E=new Email();
				E.setSender(keyboard.nextLine());
				E.setRecipient(keyboard.nextLine());
				E.setTitle(keyboard.nextLine());
				E.setText(keyboard.nextLine());
				
				String instance=keyboard.nextLine();
				if(instance.contentEquals("text"))
					E.setText(keyboard.nextLine());
				else if(instance.contentEquals("sender"))
					E.setSender(keyboard.nextLine());
				else if(instance.contentEquals("recipient"))
					E.setRecipient(keyboard.nextLine());
				else if(instance.contentEquals("title"))
					E.setTitle(keyboard.nextLine());
				
				System.out.println(E.toString());
			}else if(data.contentEquals("File")) {
				File F=new File();
				F.setPathname(keyboard.nextLine());
				F.setText(keyboard.nextLine());
				String instance=keyboard.nextLine();
				if(instance.contentEquals("pathname"))
					F.setPathname(keyboard.nextLine());
				else if(instance.contentEquals("text"))
					F.setText(keyboard.nextLine());
				
				System.out.println(F.toString());
			}
		}

	}
	
	private void PrintOut(Document text) {
		System.out.println(text.toString());
	}

}
