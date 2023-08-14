package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.MyFunction;

public class App04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> prodList = new ArrayList<>();
		
		prodList.add(new Product("TV", 900.00));
		prodList.add(new Product("Mouse", 50.00));
		prodList.add(new Product("Tablet", 450.00));
		prodList.add(new Product("HD Case", 80.90));
		
		prodList.forEach(System.out :: println);
		System.out.println("---------------");
		
		List<String> prodNames;
		prodNames = prodList.stream().map(new MyFunction()).collect(Collectors.toList());
		prodNames.forEach(System.out :: println);
		System.out.println("---------------");
		
		List<String> prodNames2;
		prodNames2 = prodList.stream().map(Product :: staticFunctionNames).collect(Collectors.toUnmodifiableList());
		prodNames2.forEach(System.out :: println);
		System.out.println("---------------");
		
		
		
	}

}