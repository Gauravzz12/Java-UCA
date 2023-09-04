package QuestionPractice.ShallowCopy;


public class Pay {

	public static void main(String[] args) {
		
		String month="January";
		double bill[]= {10000.0,100.00,500.00,1000.00,2500.00};
		bill[4]=4500;
		Bill obj=new Bill(month,bill);
		bill[4]=5000.00;
		obj.monthlyBill();

	
	}
}
