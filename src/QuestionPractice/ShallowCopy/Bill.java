package QuestionPractice.ShallowCopy;


public class Bill {
private String month;
private double rent;
private double water;
private double mobile;
private double internet;
private double electricity;

private double[] bill;
	public Bill(String month,double[] bill) {
		
		//Shallow-Copy
//		this.month=month;
//		this.bill=bill;
		
		//Deep-Copy
		this.bill=new double[bill.length];
		for(int i=0;i<this.bill.length;i++) {
			this.bill[i]=bill[i];
			
		}
		this.month=month;
		
	}

	public void monthlyBill() {
		System.out.println(month);
		System.out.println("Rent : "+bill[0]);
		System.out.println("Water : "+bill[1]);

		System.out.println("Mobile : "+bill[2]);

		System.out.println("Internet : "+bill[3]);

		System.out.println("Electrcity : "+bill[4]);


	}
}


	


