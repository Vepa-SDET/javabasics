
public class EncapsulateClass {

	public String name;
	public int age;
	public char gender;
	private int year;
	public String course;
	public String university;
	
	public EncapsulateClass(String name,int age,char gender,int year,String course,String university) {
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>=18) {
		this.year = year;
		}else {
		System.out.println("Age must be bigger than 18");	
		}
		}
	

}


