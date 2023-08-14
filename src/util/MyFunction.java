package util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import entities.Product;

public class MyFunction implements Function<Product, String> {

	@Override
	public String apply(Product p) {

		return p.getName().toUpperCase();
	}


	
	

}
