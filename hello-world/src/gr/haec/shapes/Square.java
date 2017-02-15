package gr.haec.shapes;
public class Square {
	double side;
	
	public Square(double a){
		side=a;
	}
	double area (){
		
		double b = side * side;
		return b;
	}
	void print_area (){
		System.out.println(area());
	}
	public static void main (String[]args){
		Square tetr= new Square (2);
		tetr.print_area();
		tetr.print_getPerimeter();
	}
	double getPerimeter (){
		double perimeter = side*4 ;
		return perimeter;
		
	}
	void print_getPerimeter (){
		System.out.println(getPerimeter());
		
	}
}

