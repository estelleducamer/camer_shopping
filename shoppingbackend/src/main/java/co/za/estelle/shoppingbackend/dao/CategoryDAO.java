package co.za.estelle.shoppingbackend.dao;

import java.util.List;
import co.za.estelle.shoppingbackend.dto.Category;

public interface CategoryDAO
{
	List<Category> list();

	Category get(int id);
}
