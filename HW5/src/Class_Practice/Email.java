package Class_Practice;

public class Email extends Document {
	private String sender,recipient,title;
	
	public String toString() {
		return "From: "+sender+"\nTo: "+recipient+"\nTitle: "+title+'\n'+text;
	}
	public void setSender(String message) {
		sender=message;
	}
	public String getSender() {
		return sender;
	}
	public void setRecipient(String r) {
		recipient=r;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setTitle(String t) {
		title=t;
	}
	public String getTitle() {
		return title;
	}

}
