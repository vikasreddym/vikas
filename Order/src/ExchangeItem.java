
public class ExchangeItem extends Order{
	
	int exitemCost;
	
	public ExchangeItem(String itemName,int accBalance,String deliveryAddress,int totalCost,int exitemCost){
		
		super(itemName,accBalance,deliveryAddress,totalCost);
		this.exitemCost = exitemCost;
		
	}
	
	public void exchangeitem(int remAmt) {
		
		if(totalCost>=exitemCost) {

			remAmt = this.totalCost - exitemCost;
			System.out.println("Remaining Amt is refunded");
		
		}
		
		if(totalCost < exitemCost) {
			
			remAmt = exitemCost - this.totalCost;
			System.out.println("Remaining amt is deducted");
			
	 }
   
	}	
		
}
