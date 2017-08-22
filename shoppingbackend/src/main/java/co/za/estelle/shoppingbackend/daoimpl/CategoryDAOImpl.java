package co.za.estelle.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.za.estelle.shoppingbackend.dao.CategoryDAO;
import co.za.estelle.shoppingbackend.dto.Category;

@Repository("categoryDA0")
public class CategoryDAOImpl implements CategoryDAO
{
	//I miss out ArrayList and it scru everything
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		//Adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		
		categories.add(category);
		
        category = new Category();
		
		//Adding second category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile!");
		category.setImageURL("CAT_2.png");
		category.setActive(true);
		
		categories.add(category);
		
        category = new Category();
		
		//Adding third category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageURL("CAT_3.png");
		category.setActive(true);
		
		categories.add(category);
		
        category = new Category();
		
		//Adding fourth category
		category.setId(4);
		category.setName("Fridge");
		category.setDescription("This is some description for fridge!");
		category.setImageURL("CAT_4.png");
		category.setActive(true);
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list()
	{
		return categories;
	}

	@Override
	public Category get(int id)
	{
		//enhanced for loop...in categories
		for(Category category : categories){
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
