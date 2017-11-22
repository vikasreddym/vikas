
public class TestOrder {

	public static void main(String[] args) {
		
		Order or = new Order("Shirt",10000,"520 mapple st,ws,64093",300);
		or.purchaseitem();
		or.purchaseitem(100);
		ExchangeItem item = new ExchangeItem("T-Shirt",10000,"520 mapple st,ws,64093",300,200);
		item.exchangeitem(200);
		
	}
	
}
