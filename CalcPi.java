// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int NumberCalls =  Integer.parseInt(args[0]);
		double pi = Math.PI;

		switch (NumberCalls) {
			case 0:	System.out.println("pi according to Java: "+pi);
					System.out.println("pi, approximated:		");

			case 1: System.out.println("pi according to Java: "+pi);
					System.out.println("pi, approximated:		"+4);

			default: 
			double sum = 1;
			double denominator = 1;
			//int times = 1; //debuger times
			for (int i = 2; i <= NumberCalls; i++){
			//times += i; //debuger times
			denominator += 2;
			if(i%2 == 0){
				sum -= 1/denominator;
			}
			else {
				sum += 1/denominator;
			}
		   }
		   //System.out.println(times+"\n"); //debuger times
		   //System.out.println(denominator); //debuger
		   System.out.println("pi according to Java: "+pi);
		   double approximatedPi = sum*4 ;
		   System.out.println("pi, approximated:     "+approximatedPi);
		}
		
	}
}
		

	    
