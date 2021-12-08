package javabasics;
class Person{

	   int age;

	}

	 class JBStatic{

	   public static void main(String args[]){

	       Person p1 = new Person();

	       Person p2 = new Person();

	       p1.age = 31;

	       p2.age = 32;

	       System.out.println("P1\'s age is: " + p1.age);

	       System.out.println("P2\'s age is: " + p2.age);

	   }

	}