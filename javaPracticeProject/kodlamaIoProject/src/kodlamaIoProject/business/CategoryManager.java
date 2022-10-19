package kodlamaIoProject.business;

import kodlamaIoProject.dataAccess.CategoryDao;
import kodlamaIoProject.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
	
	public void add(Category category) throws Exception {
		
		if (category.getName().equals(category)) {
			throw new Exception("Category name already exists.");
		}
		
		categoryDao.add();
		System.out.println("Category added: " + category.getName());
	}
	
	public void update(Category category) {
		System.out.println("Category updated: " + category.getName());
	}
	
	public void delete(Category category) {
		System.out.println("Category deleted: " + category.getName());
	}
	
	
	
}
