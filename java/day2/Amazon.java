package week3.day2;

public class Amazon extends CanaraBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a = new Amazon();
		a.cardPayments();
		a.upiPayments();
		a.cashOnDelivery();
		a.InternetBanking();
		Amazon.recordPaymentDetails();
	}

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("cashOnDelivery");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("upiPayments");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("cardPayments");
		
	}

	@Override
	public void InternetBanking() {
		// TODO Auto-generated method stub
		System.out.println("InternetBanking");
		
	}

}
