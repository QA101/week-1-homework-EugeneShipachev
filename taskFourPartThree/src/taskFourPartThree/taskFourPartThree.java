package taskFourPartThree;

public class taskFourPartThree {
	//Write a program that will change values of variables:
	//x=10 and y=5 => swap to make x=5 and y=10
		
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println("before swap x = "+ x);
		System.out.println("before swap y = "+ y);
		
System.out.println();

        int temp;
          temp = x;
          x = y;
          y = temp;
          System.out.println("after swap x = "+ x);
          System.out.println("after swap y = "+ y);

	}

	
}
