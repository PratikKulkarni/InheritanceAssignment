package neebalgurukul.day9;

public class Teacher extends Staff{
	private String subject;
	Teacher(String codeName,String subject) {
		super(codeName);
		this.subject=subject;
		// TODO Auto-generated constructor stub
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString()
    {
        return subject;
    }
	
}
