package Package_1;

public class St_0223 {
	String name;
	int mat;
	int kor;
	int total;
	int avg;
	public void st_0223Show() {
		total = mat + kor;
		avg = total / 2;
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
	}
}