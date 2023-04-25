package kr.s21.abs;

//추상클래스
abstract class Animal{
	public void breathe() {
		System.out.println("숨을 쉬다");
	}
	//추상메서드
	public abstract void sound();
}
//자식클래스
class Dog extends Animal{
	//부모클래스의 추상메서드를 반드시 구현해야 함
	@Override
	public void sound(){
		System.out.println("개는 멍멍멍~~~");
	}
}
class Cat extends Animal{
	//부모크래스의 추상메서드를 반드시 구현해야 함
	@Override
	public void sound() {
		System.out.println("고양이는 야옹!!");
	}
}
public class AbstractMain03 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breathe();
		d.sound();
		System.out.println("----------");
		
		Cat c = new Cat();
		c.breathe();
		c.sound();
	}
}
