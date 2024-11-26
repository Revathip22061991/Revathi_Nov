package week3.day2;

public interface Rbi {
	
	//unimplemented methods
	public void kyc();
	
    public void atmlimit();
    
    public void payment();
    //implemented methods
    static void card() {
    	System.out.println("card");
    }
    default void loan() {
    	System.out.println("loan");
    }
    default void carloan() {
    	System.out.println("");
    }
}

