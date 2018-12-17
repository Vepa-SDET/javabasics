
public class Main {

	public static void main(String[] args) {
		task_8 student1= new task_8("Mike", 25, 'M', 2018, "Java", "CyberTek");
		student1.name="Mike";
			
		student1.attendLecture();
		student1.attendLab();
		student1.submitAssignment();

		task_8 student2= new task_8("Smith", 22, 'F', 2018, "JavaScript", "CyberTek");
		student2.name="Smith";
			
		student2.attendLecture();
		student2.attendLab();
		student2.submitAssignment();

	}

}
