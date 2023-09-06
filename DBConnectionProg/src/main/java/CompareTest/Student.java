package CompareTest;

@SuppressWarnings("rawtypes")
public class Student implements Comparable{
	private int StudentId;
	private String StudentName;
	private char gender;
	private String grade;
	
	Student(int Id, String Name, char gender, String grade){
		this.StudentId=Id;
		this.StudentName=Name;
		this.gender=gender;
		this.grade=grade;
	}
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String toString() {
		return StudentId+" "+StudentName+" "+gender+" "+grade;
	}

	@Override
	public int compareTo(Object o) {
		
		Student s=(Student)o;
	//	System.out.println("this id :"+this.StudentId+"\t Save object "+s.StudentId);
		return this.StudentId-s.StudentId;
		
	//	return this.StudentName.compareTo(s.StudentName);
		
	//	return this.grade.compareTo(s.grade);
		
	}
	
}
