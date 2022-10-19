package kodlamaIoProject.dataAccess;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add() {
		System.out.println("Added to 'Categories' with JDBC Database.");
		
	}

}
