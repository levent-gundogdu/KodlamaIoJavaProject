package kodlamaIoProject.dataAccess;

public class HibernateCourseDao implements CourseDao{
	
	@Override
	public void add() {
		System.out.println("Added to 'Courses' with  Hibernate Database.");
		
	}
	
}
