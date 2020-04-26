package mingling;

public class Operator {
	public void MarkFruit(Order order) {
		String str = "";
		for(String key:order.getFruitMap().keySet()) {
			str+=key+order.getFruitMap().get(key);
		}
		System.out.println("ºÚ°µ»ìºÏÖ­:"+str);
	}
}
