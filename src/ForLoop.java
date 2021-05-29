
public class ForLoop {
	public void SwitchCase() {
		int y=12;
		switch(y) {
		case 10:
			System.out.println("The number of y is "+y);
			break;
		case 11:
			System.out.println("The number of y is "+y);
			break;
		case 12:
			System.out.println("The number of y is "+y);
			break;
		default:
			System.out.println("The default number is 0");
		}
	}

	public static void main(String[] args) {
		
		ForLoop forLoop=new ForLoop();
		forLoop.SwitchCase();
		int i;
		for(i=0;i<5;i++) {
			System.out.println("Hello My Friends!");
		}
		
	}

}
