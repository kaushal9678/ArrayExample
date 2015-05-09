/**
 * 
 */

/**
 * @author kaushlendra
 * 
 *         this program is used to implement record of 3 students in 3 semesters
 *         and 3 tests per semester and display the records.
 *
 */
import java.io.DataInputStream;
import java.io.IOException;

public class ArrayMultiDimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int students = 3;
		int semesters = 3;
		int test = 3;
		int[][][] arrayStudent = new int[students][semesters][test];
		int marks;
		System.out
				.println("manage record of 3 students 3 semester and 3 tests");
		DataInputStream dataInput = new DataInputStream(System.in);

		for (int i = 0; i < students; i++) {

			for (int j = 0; j < semesters; j++) {

				for (int k = 0; k < test; k++) {
					System.out.println("Please enter Marks for test" + " " + k
							+ " " + "Semester" + " " + j + " " + "of Student "
							+ " " + i);
					try {
						marks = Integer.parseInt(dataInput.readLine());
						arrayStudent[i][j][k]=marks;
					} catch (NumberFormatException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		// this loop is used to show result
		for (int i = 0; i < students; i++) {

			for (int j = 0; j < semesters; j++) {

				for (int k = 0; k < test; k++) {
					System.out.println(" Marks for test" + " " + k
							+ " " + "Semester" + " " + j + " " + "of Student "
							+ " " + i);
					System.out.println(arrayStudent[i][j][k]);
				}
			}
		}

	}

}
