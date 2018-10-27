package br.com.next.class1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Comparator<Product> asc = (Product o1, Product o2) -> o1.getName().compareTo(o2.getName());
		List<Product> list = getProducts();
		list.forEach(System.out::println);
		System.out.println("-------------------------------");

		list.sort(asc);
		list.forEach(System.out::println);
	}

	static List<Product> getProducts() {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("caneta", 10d, 15, 13.5d, new Category("papelaria")));
		list.add(new Product("borracha", 10d, 15, 13.5d, new Category("papelaria")));
		list.add(new Product("banana", 10d, 15, 13.5d, new Category("frutas")));
		list.add(new Product("pneu", 10d, 15, 13.5d, new Category("auto")));
		return list;
	}
	
	//Criar enum com comparators
	//ReverseOrder Java implementar igual para asc e desc -> composition
	//Sort hieraquico recebe uma lista de comparator fazer um for e enquanto não for <> 0 vai para o proximo comparator
	//  
}
