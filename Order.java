package mingling;

import java.util.HashMap;

public class Order {
	private int id;
	private HashMap<String,Integer> fruitMap;
	public Order() {
		fruitMap = new HashMap<>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HashMap<String, Integer> getFruitMap() {
		return fruitMap;
	}
	public void setFruitMap(String fruitkind,int quantity) {
		this.fruitMap.put(fruitkind, quantity);
	}
	
	
}
