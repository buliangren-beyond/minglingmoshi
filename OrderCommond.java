package mingling;

public class OrderCommond implements Commond {
	private Operator receiver;
	private Order order;
	public OrderCommond(Operator receiver,Order order) {
		this.receiver = receiver;
		this.order = order;
	}
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println(order.getId()+"�Ź˿͵ĳ�Ʒ");
		receiver.MarkFruit(order);
	}

}
