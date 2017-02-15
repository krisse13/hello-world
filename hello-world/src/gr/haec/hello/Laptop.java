package gr.haec.hello;
import gr.haec.math.Operations;
import java.util.Scanner;
public class Laptop {
	
	String manufacturer,model,cpu="Intel";
	/**
	 * 
	 */
	int ram = 4 ; 
	float hddCapacity;
	boolean hdd_ssd=false,has_dvd;
	
	
	
		public Laptop(String manufacturer, String model, String cpu) {
		
			this.manufacturer= manufacturer;
			this.model=model;
			this.cpu=cpu;
			
			
			
	}
		public Laptop ()  {
			
		}
		
		void setRAM (int newRam) {
			ram=newRam; 
		}
		void printRAM (){
			String message = "H μνήμη του Laptop είναι ";
			System.out.println(message + ram);
		
		}
		Operations op= new Operations(); {
			
		}
		
		void  addRAM(int extraRAM)	{	
			ram= (int)op.sum (ram , extraRAM); 
			
		}
		void userInsertRAM (){
			int userRAM;
			System.out.println ("Δώσε RAM: ");
			Scanner userInput= new Scanner (System.in); 
			ram= userInput.nextInt();
		}
		

}
