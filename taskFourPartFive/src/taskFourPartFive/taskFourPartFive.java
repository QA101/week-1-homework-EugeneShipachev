package taskFourPartFive;

public class taskFourPartFive {
	
		//Write a program that will change values of variables:
		//x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5
		
		public static void main(String[] args) {
			int x = 10;
			int y = 5;
			int z = 12;
			
			System.out.println("before swap x = "+ x);
			System.out.println("before swap y = "+ y);
			System.out.println("before swap z = "+ z);
			
	System.out.println();

	        int temp;
	          temp = x;
	          x = z;
	     	  z = temp;
	     	  z = y;
	     	  y = temp;
	                             
	   	      System.out.println("after swap x = "+ x);
	          System.out.println("after swap y = "+ y);
	          System.out.println("after swap z = "+ z);
   }
}
