package thanzawaou;

public class ConstroctorFromOther {

		int sum;
		ConstroctorFromOther(){
			this(4,5);
		}
		ConstroctorFromOther(int args1, int args2){
			this.sum=args1+args2;
		}
		void display() {
			System.out.println("Sum is : "+sum);
		}
	public static void main(String[] args) {
		ConstroctorFromOther con=new ConstroctorFromOther();
		con.display();
	}

}
