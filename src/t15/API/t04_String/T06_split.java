package t15.API.t04_String;

public class T06_split {
	public static void main(String[] args) {
//	split() : 문자열을 특정 문자(열)로 분리시킨 후 > 분리된 각각의 항목이 배열로 지정시켜준다. (or : |)
		
		String tel = "010-1234-5678";
		
//		앞의 전화번호를 '-'으로 분리시킨 후 배열로 저장해보자.
		String telArr[] = tel.split("-");
		System.out.println("지역번호	:	" + telArr[0]);
		System.out.println("국번호	:	" + telArr[1]);
		System.out.println("전화번호	:	" + telArr[2]);
		System.out.println();
		
		String temp = "";
		for(String t : telArr) {
			System.out.println(t);
			temp += t+ "/";
		}
		temp = temp.substring(0, temp.length()-1);
		System.out.println(temp);
		
//		각 이름의 구분자를 '/' 통일해서 출력하시오
		String names = "홍길동/이기자&김말숙:오하늘;소나무고인돌";
		System.out.println(names);
		
		String namesArr[] = names.split("/|&|:|;| ");
		String nameTemp = "";
		for(String name : namesArr) {
			nameTemp += name + "/";
		}
		nameTemp = nameTemp.substring(0, nameTemp.length());
		System.out.println(nameTemp);
		
//		join() : 배열에 분리되어 저장되어 있는 항목들을 특정 문자로 결합처리한다.
		String namejoin = String.join("/", namesArr);
		System.out.println("이름 : " + namejoin);
	}
}