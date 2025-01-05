package Bai33;

public class test {
	public static void main(String[] args) {
		myDate md1 = new myDate(15, 5, 2025);
		myDate md2 = new myDate(11, 1, 2021);
		myDate md3 = new myDate(30, 3, 2030);


		System.out.println(md1); // 15/5/2021
		System.out.println(md2);
		System.out.println(md3);
		System.out.println("to string: "+md1.toString());
	}
}
