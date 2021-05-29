package Exercise;

class Sum {
	static int a;
	static int b;
	static int c;
	Sum(){
		a=10;
		b=20;
	}
	public static void main(String[] args) {
		Sum s=new Sum();
		c= a + b;
		System.out.println(c);
	}

}
