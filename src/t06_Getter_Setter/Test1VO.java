package t06_Getter_Setter;

//	Getter 는 리턴값이 있음 : 변수타입 변수명 - 리턴값
//	Setter 는 받아오는 값이 있음 : void 변수명 - this.변수명 = 매게변수 명
// alt  s + enter + r + alt a + alt r 


public class Test1VO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	
	public Test1VO(String name, int age, boolean gender, String job) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
	}
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
		if(age < 1) {
			age = 1;
		}
		else if(age >= 100) {
			age = 100;
		}
		this.age = age - 1;
	}
	
	public String getGender() {
		if(gender){
			return "남자";
		}
		return "여자";
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
}