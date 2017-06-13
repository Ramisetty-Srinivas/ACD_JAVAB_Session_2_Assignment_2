package session2_assignment2; //package declaration

/*
 * This method is used to print the Alphabets in Diamond Shape 
 *				
 					a			1 
				  a b a			2
				a b c b a		3
				  a b a	 		4
					a			5
					 
 */

public class DiamondPattern {

	public static void main(String[] args) { //Main-Method starts from here
		

		
		int size = 5;   
		int noOfColumns = 1;
		int start = 0;
		int noOfSpaces = 3;
		
		for(int i=1;i<=size;i++){ //using For Loop for Iteration
			
			for(int j=1; j<noOfSpaces;j++){
				System.out.print(" ");
			}
			if(i<(size/2)+1){
				start = i; 
				noOfSpaces = noOfSpaces-1;

			}
			else{
				start = (size+1) - i;
				noOfSpaces = noOfSpaces+1;

			}
			
			for(int j=1;j<=noOfColumns;j++){
				int middleColumn = noOfColumns/2+1;
				System.out.print(start);
				if(j<middleColumn){
				 start--;
				}
				else{
					start++;
				}
					
			}
			System.out.println();
			if(i<(size/2)+1){ 
				noOfColumns = noOfColumns+2;   
			}	
			else{
				noOfColumns = noOfColumns-2;   
			}
				
		}
	}
} // End of the Main-Method
