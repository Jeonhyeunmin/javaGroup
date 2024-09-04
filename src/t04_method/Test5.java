package t04_method;

public class Test5 {
	int vol = 0;
	
	public Test5(int vol) {
		this.vol = vol;
	}
	
	void volUp() {
		if(vol < 10) {
		vol++;
		vol();
		}
	}
	void volDown() {
		if(vol > -10) {
			vol--;
			vol();
			}
	}
	void vol() {
		System.out.println("볼륨 : " + vol);
	}
	
}