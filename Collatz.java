// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N =  Integer.parseInt(args[0]);
		String mode =  args[1];
		//System.out.println(mode.equals("c")); //debuger
		
		switch (mode) {
			case "v": //verbose mode
		for (int i = 1; i <= N; i++) {
			int sum = i;
			int count = 1 ;
			String sequence = Integer.toString(i);

		do { 				//reaches to 1						
			if (sum%2 == 0){
				sum = sum/2 ;
				sequence += " "+Integer.toString(sum);
				count++ ;
			}
			else {
				sum = sum*3 + 1 ;
				sequence += " "+Integer.toString(sum);
				count++ ;
			}
		} while (sum != 1) ;
		System.out.println(sequence+" ("+count+")");
	}
			case "c": //concise mode
			System.out.println("Every one of the first "+N+" hailstone sequences reached 1");

}
}
}
