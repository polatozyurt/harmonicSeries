import java.util.Scanner ;
public class harmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.print("Enter the end number of the harmonic serie : ");
		int x = input.nextInt() ;
		double sum = 0.0 ;
		
		for(int i = 1; i<=x ; i ++) {
			sum += 1.0/i ;
		}
		System.out.print(sum);
		
	}

}
