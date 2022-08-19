
public class ArraysNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {1,2,3,4,5,1,2,3,4,5,4,0,0,0,0,0};
		int counter=0;
		int newcounter=0;
		for (int i =0; i<arr.length; i++) {
			
			
			if (arr[i]==1) {
				
				counter++;
				
			}
			
			else if(arr[i]==0){
				
				newcounter++;
				
				
			}
			
			
		}
		
		if (counter>newcounter) {
			
			System.out.println("true");
			}
			
			else {
				
				System.out.println("fasle");
			}
		}
		
		
		
		
	}


