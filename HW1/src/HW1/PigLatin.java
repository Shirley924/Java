package HW1;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<args.length;++j) {
			char[] c=args[j].toCharArray();
			switch(c[0]) {
			case 'A':
				System.out.print(args[j]+"ay ");
				break;
			case 'a':
				System.out.print('A');
				for(int i=1;i<c.length;++i) {
					System.out.print(c[i]);
				}
				System.out.print("ay ");
				break;
			case 'E':
				System.out.print(args[j]+"ay ");
				break;
			case 'e':
				System.out.print('E');
				for(int i=1;i<c.length;++i) {
					System.out.print(c[i]);
				}
				System.out.print("ay ");
				break;
			case 'I':
				System.out.print(args[j]+"ay ");
				break;
			case 'i':
				System.out.print('I');
				for(int i=1;i<c.length;++i) {
					System.out.print(c[i]);
				}
				System.out.print("ay ");
				break;
			case 'O':
				System.out.print(args[j]+"ay ");
				break;
			case 'o':
				System.out.print('O');
				for(int i=1;i<c.length;++i) {
					System.out.print(c[i]);
				}
				System.out.print("ay ");
				break;
			case 'U':
				System.out.print(args[j]+"ay ");
				break;
			case 'u':
				System.out.print('U');
				for(int i=1;i<c.length;++i) {
					System.out.print(c[i]);
				}
				System.out.print("ay ");
				break;
			default:
					System.out.print(Character.toUpperCase(c[1]));
					for(int i=2;i<c.length;++i) {
						System.out.print(c[i]);
					}
					System.out.print(c[0]+"ay ");
					break;
			}
		}
	}

}
