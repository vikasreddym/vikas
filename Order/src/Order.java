import java.util.*;
public class Order {

	String itemName;
	int accBalance;
	String deliveryAddress;
	int totalCost;
	
	
	public Order(String itemName,int accBalance,String deliveryAddress,int totalCost) {
		
		this.itemName = itemName;
		this.accBalance = accBalance;
		this.deliveryAddress = deliveryAddress;
		this.totalCost = totalCost;
	}
	
	public void purchaseitem() {
		
		if(totalCost < accBalance) {
			
			accBalance = accBalance - totalCost;
			System.out.println("Item purchased!");
		
		}
		

		else {
			
			System.out.println("Insufficient funds");
			
		}
		
	}

  public void purchaseitem(int giftcardAmt) {
	  
	  totalCost = this.totalCost - giftcardAmt;
	  System.out.println("TotalCost: " +totalCost);
	  
  }
}

