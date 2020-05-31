package javaprojects;

public class MathUtils {
	
	public MathUtils(){
		System.out.println("Inside Appliaction");
	}
	
	public static void main(String[] args){
		System.out.println("Starting Appliaction");
		MathUtils mathUtils = new MathUtils();
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
}
