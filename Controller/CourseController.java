package lk.ac.vau.Controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Course;

@RestController
@RequestMapping("course")

public class CourseController {
    
	Map<String, Course> courses = new HashMap<String, Course>();
	
	public CourseController()
	{
		Course it = new Course("IT","Information Technology",3);
		Course asb = new Course("ASB","Applied Science Bio",3);
		Course tech = new Course("ICTS","Technology Information Technology",4);
		
		courses.put(it.getCourseID(), it);
		courses.put(asb.getCourseID(), asb);
		courses.put(tech.getCourseID(), tech);
	}
	
	
	    //Return all courses
		@GetMapping
		public Collection<Course> getAll()
		{
			return courses.values();
		}
		
		
		//Return particular course
		@GetMapping("/{id}")
		public Course getCourse(@PathVariable("id") String id)
		{
			return courses.get(id);
		}
		
		
		//Insert a new course
		@PostMapping
		public void add(@RequestBody Course course)
		{
			courses.put(course.getCourseID(),course);
		}
		
		
		//Delete a course
		@DeleteMapping("/{id}")
		public void delete(@PathVariable("id") String id)
		{
			courses.remove(id);
		}
		
		
		//Update a course
		@PutMapping("/{id}")
		public void update(@PathVariable("id") String id,@RequestBody Course course)
		{
			courses.put(id, course);
		}
	    
}
