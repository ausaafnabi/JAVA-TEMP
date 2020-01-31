
public class Commandline {
	public static void main(String args[]) {
		int Sum = 0;
		for(String s:args) {
			Sum += Integer.parseInt(s);
		}
		System.out.println(Sum);
	}
}
