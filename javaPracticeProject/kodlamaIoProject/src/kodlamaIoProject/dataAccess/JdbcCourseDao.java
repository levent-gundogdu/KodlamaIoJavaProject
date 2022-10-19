package kodlamaIoProject.dataAccess;

public class JdbcCourseDao implements CourseDao{
	
	@Override
	public void add() {
		System.out.println("Added to 'Courses' with JDBC Database.");
		
	}
	
}
