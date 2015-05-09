import java.io.DataInputStream;
import java.io.IOException;

/**
 * 
 */

/**
 * @author mac
 * This 2d array program demonstrate to create a table from 1to 10
 *
 */
public class Array2DExample {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/**
	 * By passing row and column statically
	 */
		int row=10;
		int column=10;
		int[][] arrayNum=new int[row][column];
		DataInputStream dataInput=new DataInputStream(System.in);
		System.out.println("Print table");
		for(int i=0;i<row;i++){// multiply index to print table upto 10
			for(int j=0;j<column;j++){
				arrayNum[i][j]=i*j;
			}
		}
		/* this loop is used to print output */
		System.out.println("your table for number upto "+""+row+""+column );
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print( arrayNum[i][j]+" "+" ");
				
			}
			System.out.println(" ");
		}
		
		dynamicallYGenarateTable();
	}
	
	public static void dynamicallYGenarateTable(){
		System.out.println("===========method call for dynamically enter size of array=========");
		System.out.println("Please enter rows and column to generate table");
		DataInputStream dis=new DataInputStream(System.in);
		int row;
		int column;
		int [][]arrayNum;
		try{
			row=Integer.parseInt(dis.readLine());
			column=Integer.parseInt(dis.readLine());
			arrayNum=new int[row][column];
			for(int i=0;i<row;i++){// multiply index to print table upto 10
				for(int j=0;j<column;j++){
					arrayNum[i][j]=i*j;
				}
			}
			/* this loop is used to print output */
			System.out.println("your table for number upto 10");
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					System.out.print( arrayNum[i][j]+" "+" ");
					
				}
				System.out.println(" ");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
