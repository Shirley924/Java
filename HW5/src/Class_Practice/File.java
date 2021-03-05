package Class_Practice;

public class File extends Document {
	private String pathname;
	
	public String toString() {
		return "Path: "+pathname+'\n'+text;
	}
	public void setPathname(String p) {
		pathname=p;
	}
	public String getPathname() {
		return pathname;
	}

}
