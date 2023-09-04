package QuestionPractice.Creditcard;


public  class CreditCard extends Details {
	
	@Override
	public void getAllDetails() {
		System.out.println("Bank Code : "+ BC);
		System.out.println("Credit Card Type : "+ CCT);
		
		creditCardChipNumber(654321);
		creditCardSerialNumber("1234-5678-9012-3456");
		creditCardValidMonth("January");
		creditCardValidYear(2033);
		creditCardHolderName("Gaurav Thakur");
		isCreditCardActive(true);
		creditCardLimit(500000000);
		creditCardCVVNumber(456);
	}

}
