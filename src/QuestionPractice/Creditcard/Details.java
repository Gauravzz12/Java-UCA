package QuestionPractice.Creditcard;

enum CreditCardType{
	TRAVEL_CARD,BUISNESS_CARD,REWARD_CARD,SHOPPING_CARD
	
}

enum BankCode{
	HDFC,BOI,BHARAT,AXIS,ICICI,PNB;
}

public abstract class Details implements Front,Back {
	String CCT=CreditCardType.SHOPPING_CARD.toString();
	String BC=BankCode.BHARAT.toString();
	@Override
	public void isCreditCardActive(Boolean isActive) {
		System.out.println("Is Card Active : "+ isActive);
		
	}
	@Override
	public void creditCardLimit(Integer limit) {
		System.out.println("Limit : "+ limit);
		
	}
	@Override
	public void creditCardCVVNumber(Integer CVV) {
		System.out.println("CVV : "+ CVV);
		
	}
	@Override
	public void creditCardSerialNumber(String creditCardSN) {
		System.out.println("Serial Number : "+creditCardSN);
	}
	@Override
	public void creditCardChipNumber(Integer creditCardCN) {
		System.out.println("Chip Number : "+creditCardCN);
	}
	@Override
	public void creditCardValidMonth(String month) {
		System.out.println("Valid Till Month : "+month);
		
	}
	@Override
	public void creditCardValidYear(Integer year) {
		System.out.println("Valid Till Year : "+year);
		
	}
	@Override
	public void creditCardHolderName(String name) {
		System.out.println("Holder Name : "+name);
		
	}
	public abstract void getAllDetails();
}
