package Kaze.Service;

import java.util.List;

import Kaze.Entity.Product;

public interface ProductServices {
	void delete(Long id);

	Product get(Long id);

	Product save(Product product);

	List<Product> listAll();

}
