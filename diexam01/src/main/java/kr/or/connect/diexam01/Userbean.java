package kr.or.connect.diexam01;

public class Userbean {
//	1) 기본 생성자를 가지고 있다
//  2) 필드는 private하게 선언한다
//  3) getter, setter 메소드를 가진다. getName setName메소드를 name property라고 한다.
//	4) maven sprint context 검색 후 repository에서 찾기
	private String name;
	private int age;
	private boolean male;
	
	public Userbean() {}
	public Userbean(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	
}
