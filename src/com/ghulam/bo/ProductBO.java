package com.ghulam.bo;

import java.util.ArrayList;

import com.ghulam.product.Product;

public class ProductBO {
	private ArrayList<Product> products;

	public ProductBO() {
		products = new ArrayList<>();
	}

	public ArrayList<Product> getAirConditioner() {
		products.clear();
		products.add(new Product("Voltas", 32999));
		products.add(new Product("LG", 41499));
		products.add(new Product("Blue Star", 30999));
		products.add(new Product("Hitachi", 25999));
		return products;
	}

	public ArrayList<Product> getCamera() {
		products.clear();
		products.add(new Product("Canon", 16999));
		products.add(new Product("Sony", 18999));
		products.add(new Product("Nikon", 12999));
		products.add(new Product("Noise", 3199));
		return products;
	}

	public ArrayList<Product> getHeadphones() {
		products.clear();
		products.add(new Product("Apple AirPods", 1700));
		products.add(new Product("Bolt", 499));
		products.add(new Product("Philips", 299));
		products.add(new Product("Samsung", 499));
		return products;
	}

	public ArrayList<Product> getKurtas() {
		products.clear();
		products.add(new Product("Peter England", 826));
		products.add(new Product("Made in the Shade", 499));
		products.add(new Product("Sanwara", 299));
		products.add(new Product("Namaskar", 399));
		return products;
	}

	public ArrayList<Product> getLaptops() {
		products.clear();
		products.add(new Product("Apples", 50000));
		products.add(new Product("HP", 45000));
		products.add(new Product("Dell", 38000));
		products.add(new Product("Lenovo", 40000));
		return products;
	}

	public ArrayList<Product> getLc() {
		products.clear();
		products.add(new Product("Kedar Fab", 999));
		products.add(new Product("V SALES", 1049));
		products.add(new Product("Divastri", 1209));
		products.add(new Product("Shree Creation", 869));
		return products;
	}

	public ArrayList<Product> getMobiles() {
		products.clear();
		products.add(new Product("Apple", 45000));
		products.add(new Product("Samsung", 9999));
		products.add(new Product("MI", 12999));
		products.add(new Product("Nokia", 18999));
		products.add(new Product("Huawei", 14999));
		return products;
	}

	public ArrayList<Product> getFictionBooks() {
		products.clear();
		products.add(new Product("Around the Moon", 184));
		products.add(new Product("The Humans", 326));
		products.add(new Product("I, Robot", 396));
		return products;
	}

	public ArrayList<Product> getNovelBooks() {
		products.clear();
		products.add(new Product("Sherlock Holmes", 1005));
		products.add(new Product("Frankenstein", 124));
		products.add(new Product("The Mummy Mystery", 129));
		products.add(new Product("The White Sky", 135));
		return products;
	}

	public ArrayList<Product> getEBooks() {
		products.clear();
		products.add(new Product("Akame Ga Kill!", 657));
		products.add(new Product("Akira", 2121));
		products.add(new Product("Alone Everywhere", 1039));
		products.add(new Product("Fight to Finish", 450));
		return products;
	}

	public ArrayList<Product> getRefrigerator() {
		products.clear();
		products.add(new Product("Whirlpool", 13249));
		products.add(new Product("Samsung", 16499));
		products.add(new Product("LG", 30458));
		products.add(new Product("Godrej", 24499));
		return products;
	}

	public ArrayList<Product> getMicrowaves() {
		products.clear();
		products.add(new Product("LG", 5299));
		products.add(new Product("Samsung", 6299));
		products.add(new Product("Whirlpool", 5399));
		products.add(new Product("Bajaj", 4599));
		return products;
	}

	public ArrayList<Product> getSareeList() {
		products.clear();
		products.add(new Product("Kanjivaram", 1299));
		products.add(new Product("Mysore", 699));
		products.add(new Product("Banarasi", 719));
		products.add(new Product("Bandhani", 551));
		return products;
	}

	public ArrayList<Product> getShirts() {
		products.clear();
		products.add(new Product("Arrow", 699));
		products.add(new Product("Raymond", 1234));
		products.add(new Product("Peter England", 799));
		products.add(new Product("Puma", 945));
		return products;
	}

	public ArrayList<Product> getSuits() {
		products.clear();
		products.add(new Product("Arrow", 699));
		products.add(new Product("Raymond", 1234));
		products.add(new Product("Peter England", 2999));
		products.add(new Product("Indian Terrain", 3134));
		return products;
	}

	public ArrayList<Product> getTvs() {
		products.clear();
		products.add(new Product("Apple AirPods", 1700));
		products.add(new Product("Bolt", 499));
		products.add(new Product("Philips", 299));
		products.add(new Product("Samsung", 399499));
		return products;
	}

	public ArrayList<Product> getTshirts() {
		products.clear();
		products.add(new Product("ADIDAS", 584));
		products.add(new Product("Jack & Jones", 594));
		products.add(new Product("Roadster", 699));
		products.add(new Product("Allen Solly", 604));
		return products;
	}

	public ArrayList<Product> getwMachines() {
		products.clear();
		products.add(new Product("Samsung", 13400));
		products.add(new Product("Whirlpool", 16400));
		products.add(new Product("LG", 9499));
		products.add(new Product("Haier", 11699));
		return products;
	}
}