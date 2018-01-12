package javaTut;

public class EnumExample {

	public enum Colors {
		BLUE, PINK, WHITE, RED
	}

	public static void main(String[] args) {

		Colors c = Colors.BLUE;
		switch (c) {
		case BLUE:
			System.out.println("Blue color");
		case PINK:
			System.out.println();
		}

		System.out.println(c);

	}
}
