public class Course {
	//YOU DO THIS
	//Update the class to store students in a ResizeableArray field instead of a Student[] field
	private Student[] roster;

	private ResizeableArray students;

	//you can delete this field
	private int size;
	
	//capacity field can go away
	public Course(int capacity) {
		//YOU DO THIS
		//Update the constructor to use the ResizeableArray field

		roster = new Student[capacity];
		size = 0;
	}
	
	public void addStudent(Student s) {
		//YOU DO THIS
		//Update this method to take a Student object as parameter instead of the name/major/gpa describing a student
		//Further update the method to use your ResizeableArray

		//add s to my ResizeableArray field
	}
	
	public ResizeableArray getStudentsWithMajor(String m) {
		//YOU DO THIS
		//Change this method to be called getStudentsWithMajor
		//Instead of printing students with the given major, create and return a new ResizeableArray of Students
		//matching the search criteria.

		ResizeableArray arr = new ResizeableArray();

		for (int i = 0; i < students.size(); i++) {
			Student cur = (Student) students.get(i);
			if (cur.getMajor().equalsIgnoreCase(m)) {
				arr.add(cur);
			}
		}

		return arr;
	}
	
	public void printHonorRoll() {
		//YOU DO THIS
		//Change this method to be called getHonorRoll
		//Instead of printing students on the honor roll, create and return a new ResizeableArray of Students
		//matching the honor roll criteria.

		for (int i = 0; i < size; i++) {
			if (roster[i].getGPA() >= 3.5) {
				System.out.println(roster[i]); 
			}
		}
	}
}