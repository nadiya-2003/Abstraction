
abstract class Plane
{
void takeoff()
{
	System.out.println("Plane Takeoff");
}
abstract void fly();
void land()
{
	System.out.println("Plane Landed");
}
}

class Cargoplane extends Plane
{
void fly()
{
	System.out.println("CargoPlane Takeoff");
}
}