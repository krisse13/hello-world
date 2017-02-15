package gr.haec.hello;

public class Loops {
int x;
	public static void main (String[]args){
		
		int x =0;
		
		while (x<10){
			System.out.println("while "+x);
			x=x+1;
			
		}
		 x=0;
		do { 
			System.out.println("do"+ x);
			
		x=x+1;
		}while (x<=10);

		for(x=0; x<10; x++){
			System.out.println(x);
		}
	
	for (int z=0, y=10; z<10; z++ , y--){
		System.out.println("z="+z+",y="+y);
	}
	int [] array= {2,4,6,8,10};
	for (int i =0; i < 5; i++){
		if (array[i]<5) 
			// δε χρειάζεται ; στον ελεγχο του if
		System.out.println(array[i]);
		else if ((array[i]>5 )&& (array [i] <8))
		System.out.println(array[i] * array[i]);	
	
	     else 
		System.out.println ( array [i]*array [i]*array [i]);
	}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
