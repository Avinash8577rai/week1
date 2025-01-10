//program to calculate the profit and loss  and percentage on cost price
public class ProfitLossCalculate{
	public static void main(String[] args){
	
	//define the cost price 
	double costPrice =129;
	// define the selling Price
	double sellingPrice =191;
	
	//calculate the profit by  subtracting sellingPrice from costprice 
	double profit= sellingPrice - costPrice;
	//calculate the profit percentage
	 double profitPercentage= (profit/costPrice)*100;
	 //print the all thing in a sinle line
	System.out.println( " The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
			}
			}