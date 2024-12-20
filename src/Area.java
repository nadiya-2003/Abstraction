
public class Area {
	public static void main(String[] args) {
//		CircleArea c=new CircleArea();
//		c.collect_Data();
//		c.calculate_Data();
//		c.display();
//		TriangleArea t=new TriangleArea();
//		t.collect_Data();
//		t.calculate_Data();
//		t.display();
//		RectangleArea r=new RectangleArea();
//		r.collect_Data();
//		r.calculate_Data();
//		r.display();
		
		Measurement ref=new Measurement()
				{
			void collect_Data() {
				System.out.println("Enter radius of the Circle:");
				radius=sc.nextDouble();
				}
			
			void calculate_Data() {
				
				area=pi*radius*radius;
			}

			@Override
			void display() {
				System.out.println("Area of circle is:"+area);
				
			}
	};
	ref.collect_Data();
	ref.calculate_Data();
	ref.display();
	
	
	Measurement ref1=new Measurement()
	{
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
};
ref1.collect_Data();
ref1.calculate_Data();
ref1.display();

Measurement ref2=new Measurement()
{
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
};
ref2.collect_Data();
ref2.calculate_Data();
ref2.display();
}
}

