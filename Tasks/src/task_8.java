
public class task_8 {
	public String name;
	public int age;
	public char gender;
	public int year;
	public String course;
	public String university;
	
	public task_8(String name,int age,char gender,int year,String course,String university) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.year=year;
		this.course=course;
		this.university=university;
	}
	
	public void attendLecture() {
		System.out.println(name +" is attending the lecture");
	}
	public void submitAssignment() {
		System.out.println(name+" is submitting assignments");
	}
	public void attendLab() {
		System.out.println(name +" is attending the lab");
	}
}
