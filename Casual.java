package neebalgurukul.day9;

public class Casual extends Typist{
	private double dailyWages;
	Casual(String codeName, double speed, double dailyWages){
		super(codeName,speed);
		this.dailyWages=dailyWages;
	}
	public double getDailyWages() {
		return dailyWages;
	}
	public void setDailyWages(double dailyWages) {
		this.dailyWages = dailyWages;
	}
	public String toString()
	{
	    return (""+dailyWages);
	}
}
