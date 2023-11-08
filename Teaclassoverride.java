package task10;

public class Teaclassoverride {
public static class BlackTea {
	    
	    public void prepareTea() {
	            System.out.println("Preparing black tea with hot water and black tea leaves.");
	         }
	    }
	
	public static class GreenTea {
	    
	    public void prepareTea() {
	        System.out.println("Preparing green tea with hot water and green tea leaves.");
	     }
	}

	public static class HerbalTea {
	    
	    public void prepareTea() {
	        System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
	     }
	}
	public static void main(String[] args) {
        
        BlackTea blackTea = new BlackTea();
        blackTea.prepareTea();
        
        GreenTea greenTea = new GreenTea();
        greenTea.prepareTea(); 
        
        HerbalTea herbalTea = new HerbalTea();
        herbalTea.prepareTea(); 
	}
}



