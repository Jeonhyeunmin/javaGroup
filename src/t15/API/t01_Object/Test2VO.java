package t15.API.t01_Object;

//	to String
//	VO를 만들 때 Getter/Setter 와 toString 꼭 생성하기!
public class Test2VO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
//	이 메소드를 만들지 않으면 주소값으로 출력되니 메소드를 만들어놓음(toString은 선언하지 않아도 자동으로 적용)
	public String toString() {
		return "Test2VO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address=" + address
				+ "]";
	}	
	
}