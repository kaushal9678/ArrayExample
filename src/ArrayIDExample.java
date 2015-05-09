
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
/**
 * 
 */

/**
 * @author mac
 *
 */
public class ArrayIDExample {

	/**
	 * @param args
	 */
	static	int[] arrayNum = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0,i;
	
		System.out.println("Please enter size of array ");
		DataInputStream dis=new DataInputStream(System.in);
		try {
			
			size=Integer.parseInt(dis.readLine());
			arrayNum=new int[size];
			System.out.println("Please enter array elements"+" "+size+"\n");
			
			for(i=0;i<size;i++){
			arrayNum[i]=Integer.parseInt(dis.readLine());
			
		}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Your entered array elements are:\n");
		for(int j=0;j<size;j++){
			System.out.println(arrayNum[j]);
		}
		
		/**
		 *   this method is called to print a sorted array by using system method of sorting
		 */
		printArray();
	}
	/**
	 * this method is used to display the output
	 */
	public static void printArray(){
		System.out.println("=========Sorting an array=======");
		 // sorting array
		   Arrays.sort(arrayNum);// use system method sort of Array Class
		  
		   // let us print all the elements available in list
		   System.out.println("The sorted int array is:");
		   for (int number : arrayNum) {
		   System.out.println("Number = " + number);
		   }
		   
		System.out.println("Please enter num to be search in an array:");
		DataInputStream dataInput=new DataInputStream(System.in);
		int number;
		try{
		number=Integer.parseInt(dataInput.readLine());	
		 System.out.println("=========Searching in an array=======");
		 // sorting array
		   Arrays.binarySearch(arrayNum, number);// use system method for search an element in an Array Class
		
		   System.out.println("number found  "+"" +Arrays.binarySearch(arrayNum, number));
		   
		}catch (Exception e){
			
		}
		  
			  
		   
	}
	

}
