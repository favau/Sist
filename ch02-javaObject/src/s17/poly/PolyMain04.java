package kr.s17.poly;

class Product{
	int price; //제품 가격
	int bonusPoint; //제품 구매 시 제공되는 보너스 점수
	//생성자
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	public String getName() {
		return "상품";
	}
}

class Tv extends Product{
	public Tv(){
		//부모클래스의 인자가 있는 생성자 호출
		super(100);
	}
	//메서드 오버라이딩(부모 클래스의 메서드를 재정의)
	@Override
	public String getName() {
		return "Tv";
	}
}

class Computer extends Product{
	public Computer() {
		//부모클래스의 인자가 있는 생성자를 호출
		super(200);
	}
	//메서드 오버라이딩(부모 클래스의 메서드를 재정의)
	@Override
	public String getName() {
		return "Computer";
	}
}

class Audio extends Product{
	public Audio() {
		super(300);
	}
	//메서드 오버라이딩(부모 클래스의 메서드를 재정의)
	@Override
	public String getName() {
		return "Audio";
	}
}

class Buyer{
	private int money = 1000; //구매자 보유 금액
	private int bonusPoint = 0; //보너스 점수
	public void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price; //구매(차감)
		bonusPoint +=p.bonusPoint; //구매(누적)
		
		System.out.println(p.getName() + "을(를) 구입하셨습니다.");
		System.out.println("현재 남은 돈은 " + money + "만원입니다.");
		System.out.println("현재 보너스점수는 " +bonusPoint + "점입니다.");
	}
}

public class PolyMain04 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio au = new Audio();
		
		//구매자가 Tv를 구매
		b.buy(tv); //Tv->Product로 형변환
		//구매자가 컴퓨터를 구매
		b.buy(com); //Computer -> product로 형변환
		//구매자가 오디오를 구매
		b.buy(au); //Audio -> Product로 형변환
	}
}
