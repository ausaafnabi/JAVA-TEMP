import java.util.Scanner;
public class DesiredSum {
	/**	<h2>To find the sum of any no of integers using CommandLine </h2>
	 * <p></p>
	 * @param noa
	 * 	@author Ausaaf Nabi 
	 * @return sum */
	static int DesiredSum1(int noa) {
		int sum = 0 ;
		Scanner sc = new Scanner(System.in);
		if(noa ==-1) {
			System.out.println("NO command line Arguments Provided!");
			System.out.println("Provide Command Line Arguments from Run Configurations/Arguments!");
		}
		else {
			int m=0;
			for(int i=0;i<noa;i++) {
			

				System.out.print("Enter the "+(i+1)+" number:");
				m = sc.nextInt();
				sum +=m;
				
			}
		}
		sc.close();
		return sum;
	}
	
	public static void main(String args[]) {

		int no_of_args=-1,sum;
		for(String s:args) {
			no_of_args= Integer.parseInt(s);
		}
		sum=DesiredSum1(no_of_args);
		System.out.println("The Sum of the Array is:: " + sum);

	}
}
