package hw1;

public class hw01 {
	static int pv;
	static int fv;
	static final double interest=0.05;
	static int interval;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pv=300000;
		interval=12;
		
		fv= (int) (pv* Math.pow((1+interest), interval));
		
		System.out.println("My pv is"+ pv+ "and after"+interval+ "year it would be"+fv);
	}

}
