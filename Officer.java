package neebalgurukul.day9;

public class Officer extends Staff{
	private String grade;
	Officer(String codeName,String grade) {
		super(codeName);
		this.grade=grade;
		// TODO Auto-generated constructor stub
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String toString()
    {
        return grade;
    }

	
}
