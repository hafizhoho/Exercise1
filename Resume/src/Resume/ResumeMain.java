package Resume;

public class ResumeMain {
	

	public static void main(String[] args) {

		
		System.out.println("Resume\n");
		
		Biodata bio = new Biodata(); 
		Result r = new Result();
		CGPA cg = new CGPA();
		WorkExp w = new WorkExp();
		Skill s = new Skill();
		
		
		System.out.println("Name: " + bio.name + "\nAge : " +  bio.age + "\nGender : " + bio.gender + "\nBirthday : " + bio.birthday  + "\nMarital Status : " + bio.marital_status + "\nCitizenship : " + bio.citizenship + "\nAddress : " + bio.address + "\nPhone Number : " + bio.Phone_Number);
		System.out.println("\nExam Result" + "\nSubject : " + r.subject + "\nGrade : " + r.grade);
		cg.displayCGPA();
		System.out.printf("Final CGPA is %.2f" , cg.calculateCGPA());
		System.out.println("\n\nWork Experiences :" + "\n\t1. " + w.exp);
		System.out.println("\nProfessional SKills :" + "\n\t1. " + s.sf1 + "\n\t2. " + s.sf2);
	}

	
}
