package lk.ac.vau.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Student;

@RestController
@RequestMapping("student")
public class StudentController {
   
	/*Requirements
	 *   store student
	 *   add new student
	 *   update the student
	 *   delete the student
	 *   get a student
	 *   get all students
	 * */
	
	/*List<Student> students = new ArrayList<Student>();
	
	public void add()
	{
		Student james=new Student("2018-ICT-01","James Paul",25,"IT",3.0);
		Student ravi=new Student("2018-ICT-02","Raviram",26,"IT",3.3);
		Student mala=new Student("2018-ICT-03","Malathi",25,"IT",3.6);
		students.add(james);
		students.add(ravi);
		students.add(mala);
	}
	
	//get all student
	@GetMapping
	public List<Student> getAll()
	{
		add();
		return students;
	}
	
	//get a particular student
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") String id)
	{
		add();
		for(Student student:students)
		{
			if(student.getId().equals(id))
			{
				return student;
			}
		}
		return null;
	}
	*/
	
	Map<String, Student> students = new HashMap<String, Student>();
	
	public StudentController()
	{
		Student james=new Student("2018-ICT-01","James Paul",25,"IT",3.0);
		Student ravi=new Student("2018-ICT-02","Raviram",26,"IT",3.3);
		Student mala=new Student("2018-ICT-03","Malathi",25,"IT",3.6);
		students.put(james.getId(), james);
		students.put(ravi.getId(), ravi);
		students.put(mala.getId(), mala);
	}
	
	
	//Return all students
	@GetMapping
	public Collection<Student> getAll()
	{
		return students.values();
	}
	
	
	//Return particular student
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") String id)
	{
		return students.get(id);
	}
	
	
	//Insert a new student
	@PostMapping
	public void add(@RequestBody Student student)
	{
		students.put(student.getId(), student);
	}
	
	
	//Delete a student
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		students.remove(id);
	}
	
	//Update a student
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Student student)
	{
		students.put(id, student);
	}
}
