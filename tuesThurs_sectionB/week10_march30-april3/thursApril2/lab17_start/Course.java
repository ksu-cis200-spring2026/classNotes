public class Course {
	//YOU DO THIS
	//Update the class to store students in a ResizeableArray field instead of a Student[] field
	
	private ResizeableArray roster;

	public Course() {
		//YOU DO THIS
		//Update the constructor to use the ResizeableArray field

		roster = new ResizeableArray();
	}
	
	public void addStudent(Student stud) {
		//YOU DO THIS
		//Update this method to take a Student object as parameter instead of the name/major/gpa describing a student
		//Further update the method to use your ResizeableArray

		roster.add(stud);
	}
	
	public ResizeableArray getStudentsWithMajor(String m) {
		//YOU DO THIS
		//Change this method to be called getStudentsWithMajor
		//Instead of printing students with the given major, create and return a new ResizeableArray of Students
		//matching the search criteria.

		ResizeableArray matches = new ResizeableArray();

		for (int i = 0; i < roster.size(); i++) {
			Student cur = (Student)roster.get(i);
			if (cur.getMajor().equalsIgnoreCase(m)) {
				matches.add(cur);
			}
		}

		return matches;
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