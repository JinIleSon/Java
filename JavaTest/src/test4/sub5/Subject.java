package test4.sub5;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student[] students) {
		
	}
	
	public void printSubjectInfo() {
		int i = 0;
		while (students[i] != null) {
			if(i % 2 == 0)
				System.out.println("과목명 : " + students[i]);
			else
				System.out.println("수강생 : ");
			i++;
		}
	}
	
	public String getName() {
		return this.subName;
	}
}
