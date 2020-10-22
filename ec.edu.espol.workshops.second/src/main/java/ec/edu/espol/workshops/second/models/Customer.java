package ec.edu.espol.workshops.second.models;

public class Customer {
	private int age;
	private String sex;
	private boolean maritalStatus;
	
	public Customer(int age, String sex, boolean maritalStatus) {
		super();
		this.age = age;
		this.sex = sex;
		this.maritalStatus = maritalStatus;
	}

	public Customer() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "Customer [age=" + age + ", sex=" + sex + ", maritalStatus=" + maritalStatus + "]";
	}
	
	
	
}
