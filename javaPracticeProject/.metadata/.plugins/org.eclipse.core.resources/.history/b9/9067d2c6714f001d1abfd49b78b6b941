package kodlamaIoProject;

import kodlamaIoProject.business.CategoryManager;
import kodlamaIoProject.business.CourseManager;
import kodlamaIoProject.business.TeacherManager;
import kodlamaIoProject.dataAccess.HibernateCategoryDao;
import kodlamaIoProject.dataAccess.HibernateTeacherDao;
import kodlamaIoProject.dataAccess.JdbcCourseDao;
import kodlamaIoProject.entities.Category;
import kodlamaIoProject.entities.Course;
import kodlamaIoProject.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course = new Course();
		course.setId(1);
		course.setName("C#");
		course.setDescription("C# programming with OOP");
		course.setPrice(19.99);
		
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setFirstName("Engin");
		teacher.setLastName("Demirog");
		teacher.setTitle("Professor");
		
		Category category = new Category();
		category.setId(1);
		category.setName("Programming");
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao());
		courseManager.add(course);
		
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao());
		teacherManager.add(teacher);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
		categoryManager.add(category);
		
		

	}

}
