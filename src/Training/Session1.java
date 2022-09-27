package Training;

public class Session1 {

	public static void main(String[] args) {
		//No 1
		System.out.println("No. 1");
		System.out.println("Welcome to Java, welcome to Computer Science, and Programming is fun");
		
		//No 2
		System.out.println("\nNo. 2");
		for (int i = 0; i < 5; i++) {
			System.out.println("Welcome to Java");
		}
		
		//No 3
		System.out.println("\nNo. 3");
		
		System.out.println("    J      A     V     V     A");
		System.out.println("    J     A A     V   V     A A");
		System.out.println("J   J    AAAAA     V V     AAAAA");
		System.out.println(" J J    A     A     V     A     A");
		
		//No 4
		System.out.println("\nNo. 4");
		System.out.println("a\ta^2\ta^3");
		for (int a = 1; a < 5; a++) {
			System.out.println(a + "\t" + a*a + "\t" + a*a*a);
		}
		
		//No 5
		System.out.println("\nNo. 5");
		System.out.println(((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
		
		//No 6
		System.out.println("\nNo. 6");
		int sum = 0;
		
		for (int i = 1; i < 10; i++) {
			sum += i;
		}
		
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + sum);
		
		//No 7
		System.out.println("\nNo. 7");
		double phi1 = 4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11);
		double phi2 = 4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);
		System.out.println("First phi is " + phi1);
		System.out.println("Second phi is " + phi2);
		
		//No 8
		System.out.println("\nNo. 8");
		double radius = 5.5;
		double perimeter = 2 * radius * phi1;
		double area = radius * radius * phi1;
		
		System.out.println("Perimeter of circle is " + perimeter);
		System.out.println("Area of circle is " + area);
		
		//No 9
		System.out.println("\nNo. 9");
		double width = 4.5;
		double height = 7.9;
		
		double areaRectangle = width * height;
		
		System.out.println("Area of rectangle is " + areaRectangle);
		
		//No 10
		System.out.println("\nNo. 10");
		double track = 14 / 1.6;
		double time = 45.5;
		
		double averageSpeed = track / time;
		
		System.out.println("Average speed of runner is " + averageSpeed + " Miles/Minute");
		
		//No 11
		System.out.println("\nNo. 11");
		int seconds = 31536000 * 5;
		double birth = seconds / 7.0;
		double death = seconds / 13.0;
		double immigrant = seconds / 45.0;
		
		double population = 312032486 + birth - death + immigrant;
		
		System.out.println("Population for the next 5 years is " + population);
	}
}