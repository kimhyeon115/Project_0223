package Package_2;

import java.util.Scanner;

public class CustomerTest77 {

	public static void main(String[] args) {
		Costurm customerLee = new Costurm();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Costurm customerKim = new vipCosturm();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
