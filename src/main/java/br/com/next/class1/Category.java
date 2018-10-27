package br.com.next.class1;

public class Category {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + "]";
	}

}
