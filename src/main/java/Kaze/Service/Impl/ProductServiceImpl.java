package Kaze.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kaze.Entity.Product;
import Kaze.Repository.ProductRepository;
import Kaze.Service.ProductServices;

@Service
public class ProductServiceImpl implements ProductServices {
	@Autowired
	private ProductRepository repo;
	
	public ProductServiceImpl (ProductRepository repo) {
		this.repo = repo;
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Product get(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public Product save(Product product) {
		return repo.save(product);
	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
