package thanzawaou;
class Cat{
	private String catName;
	private int id;
	private String sleep;
	
	
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		 this.catName=catName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getSleep() {
		return sleep;
	}
	public void setSleep(String sleep) {
		this.sleep=sleep;
	}
}
public class Enc {

	public static void main(String[] args) {
		Cat c= new Cat();
		c.setCatName("Pusi");
		c.setId(214);
		c.setSleep("9 hours in a day!");
		System.out.println(c.getCatName());
		System.out.println(c.getId());
		System.out.println(c.getSleep());
	}

}
