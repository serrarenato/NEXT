package br.com.next.class1;

public class Product {
	String name;
	Double price;
	Integer volume;
	Double weight;
	Category category;
	

	public Product(String name, Double price, Integer volume, Double weight, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.weight = weight;
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		assert (price > 0);
		this.price = price;

	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		assert (volume > 0);
		this.volume = volume;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		assert (weight > 0);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", volume=" + volume + ", weight=" + weight
				+ ", category=" + category + "]";
	}

}
