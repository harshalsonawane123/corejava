package Polymorphism;

public class Poly {
	void add(int a) {
		System.out.println("sum :"+(a++));
	}
	void add(int a,int b) {
		System.out.println("sum of :"+a+"+"+b+":+"+(a+b));
	}
	void add(int a,float b) {
		System.out.println("sum of :"+a+"+"+b+":+"+(a+b));
	}
	void add(float a,float b) {
		System.out.println("sum of :"+a+"+"+b+":+"+(a+b));
	}

	public static void main(Result[] args) {
		// TODO Auto-generated method stub
       Poly c=new Poly();
       c.add(10);
       c.add(2,3);
       c.add(2,5.2f);
       c.add(2.3f,5.2f);
	}

}
