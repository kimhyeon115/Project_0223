package Package_2;

import java.util.Scanner;

public class CustomerTest1 {

	public static void main(String[] args) {
		Scanner scn1 = new Scanner(System.in);
		Costurm customerLee = new Costurm();
		System.out.println("아이디 입력");
		int id1 = scn1.nextInt();
		customerLee.setCustomerID(id1);
		System.out.println("이름 입력");
		String name1 = scn1.next();
		customerLee.setCustomerName(name1);

		Scanner scn2 = new Scanner(System.in);
		vipCosturm customerKim = new vipCosturm();
		System.out.println("아이디 입력");
		int id2 = scn2.nextInt();
		customerKim.setCustomerID(id2);
		System.out.println("이름 입력");
		String name2 = scn2.next();
		customerKim.setCustomerName(name2);

		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
