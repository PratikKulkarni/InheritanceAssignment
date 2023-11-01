package neebalgurukul.day9;

public class Typist extends Staff{

	private double speed;
	Typist(String codeName,double speed){
		super(codeName);
		this.speed=speed;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String toString()
    {
        return (""+speed);
    }
}
