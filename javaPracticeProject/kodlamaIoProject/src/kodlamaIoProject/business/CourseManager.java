package kodlamaIoProject.business;

import kodlamaIoProject.dataAccess.CourseDao;
import kodlamaIoProject.entities.Category;
import kodlamaIoProject.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;

	public CourseManager(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	public void add(Course course) throws Exception {
		
		if (course.getName().equals(course)) {
			throw new Exception("Course name already exists.");
		} else if (course.getPrice() < 0) {
			throw new Exception("Course price cant be below zero.");
		}
		courseDao.add();
		System.out.println("Course added: " + course.getName());
		
	}
	
	public void update(Course course) {
		System.out.println("Course updated: " + course.getName());
	}
	
	public void delete(Course course) {
		System.out.println("Course deleted: " + course.getName());
	}
	
}
