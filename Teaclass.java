package task10;

public class Teaclass {
public static class Tea {
	    
	    public void prepareTea() {

	            System.out.println("Preparing tea with hot water and tea leaves.");
	    	}
	    public void addMilk() {
	        
            System.out.println("Adding milk to the tea.");
     	}
    
    public void addSugar() {
        System.out.println("Adding sugar to the tea.");
       }
    public static void main(String[] args) {
        Tea tea = new Tea();
        
        tea.prepareTea();
        tea.addMilk(); 
        tea.addSugar(); 
    }
}
}



