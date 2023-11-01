package neebalgurukul.day9;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s=new Staff("Code Name 1");
		System.out.println("The Code Name of the staff is "+s.getCodeName());
		Teacher t=new Teacher("Code Name 2","Math");
		System.out.println("The subject taught by the teacher is "+t.getSubject());
		Typist ty=new Typist("Code Name 3",50.0);
		System.out.println("The speed of the typist is "+ty.getSpeed());
		Officer officer1=new Officer("Code Name 4", "Grade 1");
		System.out.println("The grade of the officer is "+officer1.getGrade());
		Regular r=new Regular("Code Name",52.0,25000);
		System.out.println("The salary of the regular is "+r.getSalary() );
		Casual c=new Casual("Code Name 6",55.0,30000);
		System.out.println("The daily wages of the Casual is "+c.getDailyWages());
		
	}

}

