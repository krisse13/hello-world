package gr.haec.math;

public class Operations {
double number1=1;
double number2=2;

	public Operations (double number1, double number2){
	
	this.number1= number1;
	this.number2= number2;
	
} 
	
		public Operations (){
		}
		/**
		 *  επιστρέφει true αν είναι άρτιος
		 * @param k ακέραιος
		 * @return
		 */
		boolean isEVEN (int k){
			if (k%2==0) return true;
			else return false;
	}
		void minMax(int array []){
			int min=array[0];
			int max=array[0];
			for(int i=0; i<array.length; i++){
				if(array[i]<min)
					min=array[i];
				else if(array[i]>max)
					max=array[i];
			}
			String mes1="Ο μεγαλύτερος αριθμός είναι: "+max;
			String mes2="Ο μικρότερος αριθμός είναι: "+min;
			
			System.out.println(mes1);
			System.out.println(mes2);
		}
		
	
	
	public static void main (String[]args){
		
		
	
		double x;
		double y;
		//double z;
		x= 100;
		y= 50;	
		//z=25;
		double answer = (x*x)+(y*y)/(2*x*y);
			String message ="Tο αποτέλεσμα είναι " ;
				System.out.println(message+ answer );
		Operations newOp =new Operations (2, 7)	;
		newOp.sum()	;	
		System.out.println(newOp.sum());
	//Operations newOp=  new Operations (1 , 3);
	//System.out.println(newOp.number1);
		Operations k = new Operations ();
		System.out.println(k.isEVEN(10));
		
		int[]pinakas = {2,8,5,10,9};
		k.minMax(pinakas);
	}
	
		


	double sum (){
		double z= number1+number2;
		return z;
		
		 
	}
	public double sum (double x , double y ){
		double z =  x +  y;
		return z;
	}
	
	
}
