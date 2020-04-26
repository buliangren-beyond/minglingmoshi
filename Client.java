package mingling;
//ÃüÁîÄ£Ê½
public class Client {
	public static void main(String args[]) {
		Order order1 = new Order();
		order1.setId(1);
		order1.setFruitMap("Æ»¹û", 1);
		order1.setFruitMap("Àæ×Ó", 2);
		order1.setFruitMap("Ïã½¶", 3);
		
		Order order2 = new Order();
		order2.setId(2);
		order2.setFruitMap("²¤ÂÜ", 4);
		order2.setFruitMap("Î÷ºìÊÁ", 3);
		order2.setFruitMap("ÀóÖ¦", 2);
		
		Operator op=new Operator();
		OrderCommond odc1 = new OrderCommond(op, order1);
		OrderCommond odc2 = new OrderCommond(op, order2);
		WaitorInvoker wi = new WaitorInvoker();
		wi.SetCommond(odc1);
		wi.SetCommond(odc2);
		wi.orderup();
	}
}
