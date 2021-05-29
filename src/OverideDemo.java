class Person {
	String name;

	void sleep(String name) {
		this.name = name;// global name
		System.out.println(this.name + "is sleeping+8hr/day");
	}

	void walk() {
		System.out.println("this is walk()");
		System.out.println("-----------------");
	}
}

class Student extends Person {
	void writExams() {
		System.out.println("only student write the exam");
	}

	void sleep(String name) {
		super.name = name;// extends name
		System.out.println(super.name + "is sleeping 6hr/day");
		System.out.println("------------------");
	}
}

class Developer extends Person {
	public void designProj() {
		System.out.println("Design the project");
	}

	void sleep(String name) {
		super.name = name;
		System.out.println(super.name + "is sleeping 4hr/day");
		System.out.println("------------------");
	}
}

class OverideDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.writExams();
		s1.sleep("student");
		s1.walk();
		Developer d1 = new Developer();
		d1.designProj();
		d1.sleep("developer");
	}
}
