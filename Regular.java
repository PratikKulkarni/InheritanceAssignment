package neebalgurukul.day9;

public class Regular extends Typist {
private double salary;
Regular(String codeName,double speed,double salary){
	super(codeName,speed);
	this.salary=salary;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String toString()
{
    return (""+salary);
}
}
