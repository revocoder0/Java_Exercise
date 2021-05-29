package thanzawaou;
class Language{
	Language(int version1, int version2){
		if(version1>version2) {
			System.out.println("The Lasted version is "+version1);
		}else {
			System.out.println("The Lasted version is "+version2);
		}
	}
}
public class Subject extends Language {

	Subject() {
		super(11, 8);
	}

	public static void main(String[] args) {
		Subject sub=new Subject();
	}

}
