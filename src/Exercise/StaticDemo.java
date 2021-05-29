package Exercise;

class Student {
	int roll_no;
	float marks;
	String name;
	static String Collage_Name="ATT";
}
class StaticDemo{
	public static void main(String [] args) {
		Student sl=new Student();
		sl.roll_no=100;
		sl.marks=46.5f;
		sl.name="ThanZawAou";
		System.out.println(sl.roll_no);
		System.out.println(sl.marks);
		System.out.println(sl.name);
		System.out.println(Student.Collage_Name);
		
		Student  s2=new  Student();
	      s2.roll_no=200;
	      s2.marks=75.8f;
	      s2.name="Nyan";
	      System.out.println(s2.roll_no);
	      System.out.println(s2.marks);
	      System.out.println(s2.name);
	      System.out.println(Student.Collage_Name); 

	}
}

	


