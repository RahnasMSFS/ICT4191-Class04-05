package lk.ac.vau.Model;

public class Course {

	private String CourseID;
	private String Name;
	private int Duration;
	
	public Course()
	{}

	public Course(String courseID, String name, int duration) {
		super();
		CourseID = courseID;
		Name = name;
		Duration = duration;
	}

	public String getCourseID() {
		return CourseID;
	}

	public void setCourseID(String courseID) {
		CourseID = courseID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}
	
}
