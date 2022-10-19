package kodlamaIoProject.dataAccess;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add() {
		System.out.println("Added to 'Categories' with  Hibernate Database.");
		
	}

}
