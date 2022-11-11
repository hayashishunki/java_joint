package java_joint;

public class Car {
	private int BodyNo;
	private String name;
	
	Car(String name, int BodyNo) {
		this.name = name;
		this.BodyNo = BodyNo;
	}
	
	public int getBodyNo() {
		return this.BodyNo;
	}
	public void setBodyNo(int BodyNo) {
		this.BodyNo = BodyNo;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
