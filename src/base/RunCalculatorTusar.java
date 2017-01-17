package base;

public class RunCalculator {
	public static void main(String []args){
		Calculator calNewName = new Calculator();
		
		System.out.println(calNewName.getSum(20, 30) );
		System.out.println(calNewName.getSubtract(50, 30) );
		System.out.println(calNewName.getMultiply(5, -6) );
		System.out.println(calNewName.getDivision(-15, 1));
		System.out.println(calNewName.abc);
	}

}
