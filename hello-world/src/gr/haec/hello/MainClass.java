package gr.haec.hello;
public class MainClass {
	public static void main (String[]args){
		Laptop newLaptop = new Laptop (); 
		newLaptop.setRAM(16);
		newLaptop.printRAM();
		newLaptop.addRAM(4);
		//newLaptop.printRAM();
		Laptop hp = new Laptop ("hp", "folio","intel" );
		//hp.printRAM();
		hp.userInsertRAM();
		hp.printRAM();
	}
}
