package javaTut;

public abstract class AbstractSample {
	 String text="Method defined inside Abstract class";
	 void printtext()
	{
		System.out.println(text);
	}
	abstract void printtext2(String str);
	abstract void printtext2(String str, String str2);
	}
