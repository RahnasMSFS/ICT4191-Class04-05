package lk.ac.vau.Model;

public class Student {

	private String Id;
	private String Name;
	private int age;
	private String Degree;
	private double GPA;
	
	public Student()
	{}

	public Student(String id, String name, int age, String degree, double gPA) {
		super();
		Id = id;
		Name = name;
		this.age = age;
		Degree = degree;
		GPA = gPA;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

}
