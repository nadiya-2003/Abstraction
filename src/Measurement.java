import java.util.Scanner;
abstract  class Measurement 
{
	Scanner sc=new Scanner(System.in);
	double area;
	static double pi=3.14;
	double radius;
	double length;
	double breadth;
	double height;
	double base;
abstract void collect_Data();
abstract void calculate_Data();
abstract void display();
}

