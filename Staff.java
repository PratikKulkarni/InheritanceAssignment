package neebalgurukul.day9;

public class Staff {

	private String codeName;
	Staff(String codeName){
		this.codeName=codeName;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String toString()
    {
        return codeName;
    }
}
