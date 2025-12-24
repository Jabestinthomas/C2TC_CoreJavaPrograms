package com.tnsif.multipleinheritance;

interface Walkable{
	void walk();
} 
interface Swimable{
	void swim();
} 
//implement the above 2 interface to another class
class Human implements Walkable,Swimable{
	@Override
	public void walk() {
		System.out.println("He/She is walking");
	}

	@Override
	public void swim() {
		System.out.println("He/She is swimming");
	}
}

public class MultipleInheritanceDemo{

	public static void main(String[] args) {
		Human obj = new Human();
		obj.swim();
		obj.walk();
	}

}