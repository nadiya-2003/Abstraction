import java.util.Scanner;
class CircleArea extends Measurement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double area;
	    double pi;
		double radius;
	}
	static
	{
		pi=3.14;
	}
	@Override
	void collect_Data() {
		System.out.println("Enter radius of the Circle:");
		radius=sc.nextDouble();
	}
	@Override
	void calculate_Data() {
		
		area=pi*radius*radius;
	}
	@Override
	void display() {
		System.out.println("Area of circle is:"+area);}}
		
