package MyProject;

public class A {
	public static void main(String[] args) {
		System.out.println(" AAA ");

		System.out.println(" Changed A ");

		System.out.println(" devB changed A ");
		
		System.out.println(" devC changed A");

		
		B plus = new B();
		plus.Plus();
		
		C sub = new C();
		sub.Sub();
	}
}
