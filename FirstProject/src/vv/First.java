package vv;

import java.util.Scanner;


class Animal{
	void run() {
		System.out.println("Running...");
	}

}

class Dog extends Animal{
	void bark() {
		System.out.println("Barking...");
	}
}

class cat extends Dog{
		void meow() {
			System.out.println("Cat is drinking...");
		}
	}



 class First  {


		public static void main(String[] args) {
			//cat c1=new cat();
			StudentInfo s1=new StudentInfo();	
			s1.bark();
			s1.run();
			s1.meow();
			s1.play();
			

		}

	}
