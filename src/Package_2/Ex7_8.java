package Package_2;

class Product {									//전반적으로 이해 필요
	int price;
	int bonusPoint;	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class Tv1 extends Product {
	Tv1() {
		super(100);
	}
	public String toString() { return "Tv";}
}
class Computer extends Product {
	Computer() { super(200);}
	
	public String toString() { return "Computer";}
}
class Buyer {
	int money = 1000;
	int bonusPoint = 0;	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}
public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();		
		b.buy(new Tv1());					//product p = new Tv1();      같다 	<업캐스팅>
		b.buy(new Computer());				//product p = new Computer(); 같다	<업캐스팅>
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
	}
}