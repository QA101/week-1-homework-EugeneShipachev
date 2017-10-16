
public class LoopsChallenge {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 4; i++) {
		 
		    System.out.println("* * * * * * *"); 
		
		}
System.out.println();
System.out.println();
		
		for (int j = 0; j <= 3; j++) {
			for (int k = 0; k <= j; k++) {
			 
	 	    System.out.print("2 "); 
			}
			System.out.println();
    	}
System.out.println();
System.out.println();
		
		for (int l = 0; l <= 3; l++) {
			for (int m = 0; m <= l * 2; m++) {
			 
	 	    System.out.print("$ "); 
			}
			System.out.println();
	    }
System.out.println();
System.out.println();
		
		for (int n = 0; n <= 3; n++) {
			for (int o = 0; o <= n + 1 * 2; o++) {
			 
	 	    System.out.print("* "); 
			}
			System.out.println();
}
System.out.println();
System.out.println();
		
		for (int p = 0; p <= 3; p++) {
			for (int q = 1; q <= p + 1; q++) {
			 
	 	    System.out.print(q + " "); 
			}
			System.out.println();
}
System.out.println();
System.out.println();
		
		for (int r = 1; r <= 3; r++) {
			for (int s = 0; s <= r *2; s++) {
			 
	 	    System.out.print(s + 1 + " "); 
			}
			System.out.println();
}
System.out.println();
System.out.println();

        for (int t = 1; t <= 1; t++) {
	        for (int u = 1; u <= 4; u++) {
	    	    for (int v = 1; v <= u * 2 - 1 ; v++) {
	       System.out.print(u + " "); 
	       }
	       System.out.println();
        }
	  }
	}
}
