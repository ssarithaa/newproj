package javaTut;

import java.util.ArrayList;

public class MainClass {

	public static void main(String args[]) {
		String str = "Passed str to abstract";
		String str1 = "Poly1";
		String str2 = "Poly2";
		ClasstoImplement c1 = new ClasstoImplement();
		ClasstoImplement c2 = new ClasstoImplement();
		c1.printhello();
		ExtendsAbstract p1 = new ExtendsAbstract();
		p1.printtext();
		p1.printtext2(str);
		p1.printtext2(str1, str2);

		ArrayList<ClasstoImplement> mylist = new ArrayList<ClasstoImplement>();
		mylist.add(c1);
		mylist.add(c2);
		System.out.println(mylist.contains(c1));
	}

}
