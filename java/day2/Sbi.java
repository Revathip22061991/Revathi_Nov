package week3.day2;

public class Sbi implements Rbi{

	 @Override
     public void kyc() {
		 System.out.println("Kyc:");
}
	 
	 public void atmLimit() {
		 System.out.println("500 rs");
}
	 
	 public static void main(String[] args) {
		Sbi sb=new Sbi();
		sb.atmLimit();
		sb.kyc();
		sb.loan();
		//static method
		Rbi.card();
	}

	@Override
	public void atmlimit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}
	}


}
