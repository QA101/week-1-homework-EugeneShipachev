package teskFourPartFour;

public class teskFourPartFour {
	
	//Write a program that will change values of variables:
	//x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5
	
	public static void main(String[] args) {
		double x = 2.5;
		double y = 7.5;
		System.out.println("before swap x = "+ x);
		System.out.println("before swap y = "+ y);
		
System.out.println();

        double temp;
          temp = x;
          x = y;
          y = temp;
          System.out.println("after swap x = "+ x);
          System.out.println("after swap y = "+ y);

	   }
	
	}


