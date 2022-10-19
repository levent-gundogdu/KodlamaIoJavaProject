package kodlamaIoProject.dataAccess;

public class JdbcTeacherDao implements TeacherDao{

	@Override
	public void add() {
		System.out.println("Added to 'Teachers' with JDBC Database.");
		
	}

}
