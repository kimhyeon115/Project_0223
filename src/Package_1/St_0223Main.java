package Package_1;

import java.util.Scanner;

public class St_0223Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		St_0223 st = new St_0223();
		System.out.println("이름 입력");
		st.name = scn.nextLine();
		System.out.println("국어 성적");
		st.kor = scn.nextInt();
		System.out.println("수학 성적");
		st.mat = scn.nextInt();
		
		st.st_0223Show();
		
	}

}