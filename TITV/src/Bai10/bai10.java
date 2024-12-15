package Bai10;

public class bai10 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// ép kiểu ngầm định
		float c = a;
		float d = b;

		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		//ép kiểu tường minh ==> khai báo rõ
		// khi mà kiểu dữ liệu muốn ép có kích thước bé hơn kích thước ban đầu
		float e =  5.2f;
		float f = 7.2f;
		
		System.out.println("e = " + e);
		System.out.println("f = " + f);	
		
		int g = (int)e;
		int h = (int)f;
		
		System.out.println("g = " + g);
		System.out.println("h= " + h);	
		
		
		// ép kiểu  dữ liệu đối tượng => khi nào học xong phần kế th
		
		
		// ép kiểu giữa nguyên thủy và đối tượng
		
		int x = new Integer(32);
		System.out.println("x = "+x);
		

	}
}
