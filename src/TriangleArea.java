import java.util.Scanner;
public class TriangleArea extends Measurement {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double base;
		    double height;
		    double area;
		}
		@Override
		void collect_Data() 
		{
			System.out.println("Enter length of the Triangle:");
			System.out.println("Enter height of the Triangle:");
			base=sc.nextDouble();
			height=sc.nextDouble();
		}
		@Override
		void calculate_Data() {
			
			area=(0.5*base*height);
		}
		@Override
		void display() {
			System.out.println("Area of Triangle is:"+area);
		}
	}

