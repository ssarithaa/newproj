package javaTut;

public class VariableSample {
	public String var;
	public static String varstatic;

	public static void main(String[] args) {
		// VariableSample v1 = new VariableSample();
		// VariableSample v2 = new VariableSample();
		// v1.var = "v1 variable";
		// v2.var = "v2 variable";
		//
		// VariableSample.varstatic = "v1 varvariable";
		// VariableSample.varstatic = "v2 varvariable";
		VariableSample[] vobjref = new VariableSample[2];
		vobjref[0] = new VariableSample();
		vobjref[0].var = "v1 variable";
		// vobjref[1].var = "v2 variable";
		System.out.println(vobjref[0].var);
		// System.out.println(v2.var);
		// System.out.println(VariableSample.varstatic);
		// System.out.println(VariableSample.varstatic);
		// int[] nums = new int[9];
		// nums[0] = 10;
		// String str;
		// str = "sss";
		// System.out.println(str + nums[1]);
	}
}
