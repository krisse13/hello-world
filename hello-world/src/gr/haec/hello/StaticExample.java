package gr.haec.hello;

public class StaticExample {
	static int count;
	public StaticExample (int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	static void printCount (){
		System.out.println(count);
	}

	public static void main (String[]args){
		StaticExample se1 =new StaticExample (12);
		StaticExample se2 =new StaticExample (5);
		StaticExample se3 =new StaticExample (13);
		
		StaticExample.printCount();
		StaticExample.printCount();
		StaticExample.printCount();
		
		
	}
	

}
