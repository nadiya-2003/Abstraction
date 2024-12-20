import java.util.Scanner;
public class RectangleArea extends Measurement {
		public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				double length;
			    double breadth;
			    double area;
		}
		@Override
		void collect_Data() {
			System.out.println("Enter length of the Rectangle:");
			System.out.println("Enter height of the Rectangle:");
			length=sc.nextDouble();
			breadth=sc.nextDouble();
		}
		@Override
		void calculate_Data() {
			
			area=breadth*length;
		}
		@Override
		void display() {
			System.out.println("Area of Rectangle is:"+area);
		}
	}


