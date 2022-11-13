package java_joint.first_test;

public class Humans {
	private String name;
	private int age;
	private String birsday;
	private String[] information = new String[3];
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getBirsday() {
		return this.birsday;
	}
	public void setBirsday(String birsday) {
		this.birsday = birsday;
	}
	
	public String[] getInformation() {
			return this.information;
	}
	public void setInformation(String name, int age, String birsday) {
		this.information[0] = name;
		this.information[1] = Integer.valueOf(age).toString();
		this.information[2] = birsday;
	}
}
