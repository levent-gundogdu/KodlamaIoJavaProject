package kodlamaIoProject.dataAccess;

public class HibernateTeacherDao implements TeacherDao{
	
	@Override
	public void add() {
		System.out.println("Added to 'Teachers' with  Hibernate Database.");
		
	}
	
}
