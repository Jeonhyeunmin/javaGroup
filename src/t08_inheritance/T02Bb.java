package t08_inheritance;

//원의 둘레
public class T02Bb extends T02Aa{
	double areaCircle(double radius) {
		return radius * radius * Math.PI;
	}
	
	double lenCircle(double radius) {
		return 2 * Math.PI * radius;
	}
}
