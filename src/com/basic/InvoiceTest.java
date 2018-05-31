package com.basic;
class Invoice {
	String partNumber,partDesc;
	int quantity;
	double price;
		
public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0)
		{
			quantity=0;
		}
		else {
		this.quantity = quantity;
	}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0)
		{
			price=0;
		}else {
		this.price = price;
	}
} 
	public double getInvoiceAmount()
	{
		double invoiceAmount=price*quantity;
		return invoiceAmount;
	}
}
	
	
	
public class InvoiceTest{
	

	public static void main(String s[])
	{
	      Invoice in1=new Invoice();
	      in1.setPartNumber("a123");
	      in1.setPartDesc("net");
	      in1.setPrice(100);
	      in1.setQuantity(10);
	      System.out.println("invoice amount is : "+in1.getInvoiceAmount());
	      
		
		
	}
}

	
		
	


