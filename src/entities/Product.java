package entities;

public class Product {
	
	public String name; //This three are the attributes of the class//
	public double price;
	public int quantity;
	                   //This four below are the methods of the class//
	public double totalValueInStock() {
		return quantity * price; /*I don't have to write again the name
		of the variable, just write what it needs to return and thats it*/
	}
	public void addProducts(int quantity) { /*Inside the parentheses, u have to declare
	the type of the variable, if need it.*/
		this.quantity += quantity; /*This is a little tricky, but don't worry. The function
		"THIS" is just to differentiate the quantity above, to the variable inside the parentheses.
		The reserved keyword (return) is not need it, in the cases of void. In this case particularly,
		the function won't return nothing, so that's why it's void, and also, the importance
		to declare before the name of the method with "void"*/
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity; /*This line and method is very similar to the above one,
		the difference is that, in this one, it will remove the quantity of the product*/
	}
	public String toString() {
		return "Name: " + name
			   + String.format("%nPrice: $%.2f%n", price)
			   + "Total quantity: " + quantity + " units"
			   + String.format("%nTotal price: $%.2f", totalValueInStock());
	}
}
