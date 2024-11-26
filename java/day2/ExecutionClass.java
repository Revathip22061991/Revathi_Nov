package week3.day2;

public class ExecutionClass extends SbiChennai{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ExecutionClass ec=new ExecutionClass();
   ec.atmlimit();
   ec.cardLimit();
   ec.kyc();
   ec.loan();
   Rbi.card();
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		System.out.println("PAN card");
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("1000Rs);
		
	}

	@Override
	void cardLimit() {
		// TODO Auto-generated method stub
		System.out.println("45");
		
	}

}
