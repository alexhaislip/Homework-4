import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


/**
 * Code for HW4
 * This class process univ_ranking.txt
 * @author
 */
public class UnivRank {

	public static void main(String[] args) {
		
		System.out.println("###################################################");
		System.out.println("#####         University Ranking DB        ########");
		System.out.println("###################################################");
		System.out.println("-------------------------------------------");
		System.out.println("(W)rite all university names to a text file");
		System.out.println("(R)anking search: print all university rankings, names, city, and states with ranking <= X");
		System.out.println("(S)tate search: print all university rankings and names with state = Y");



		Scanner console = new Scanner(System.in);
		boolean continueProgram = true;
		
		// Four arraylists are provided. 
		// Hint: At the same index, information for the same university should be stored.
		// For example, UniversityRankings.get(i) is the ranking of name=UniversityNames.get(i), 
		// located at city=UniversityCities.get(i), state=UniversityStates.get(i)


		ArrayList<Integer> UniversityRankings = new ArrayList<Integer>();

		ArrayList<String> UniversityNames = new ArrayList<String>();

		ArrayList<String> UniversityCities = new ArrayList<String>();

		ArrayList<String> UniversityStates = new ArrayList<String>();

		
		
		System.out.print("Reading data file \"univ_ranking.txt\"...  ");

		// Insert code to read univ_ranking.txt and store the information into the array lists.
		// Your work for text file reading starts here. Do not change the codes above.
		
		
		// User input required
		// x : uni ranking (less than the number)
		// s : state search, will retur
		// y : name of the state abbrivation. Etc. (IA, AL)
		// q : program termination
		
		
		
		
		
		
		// Your work for text file reading ends here. 
		
		System.out.println("data file loaded! \n\n");
		
		
		
		while(continueProgram) {
			System.out.println("-------------------------------------------");
			System.out.println("(W)rite all university names to a text file"); // Type "W" for write option
			System.out.println("(R)anking search: print all university rankings, names, city, and states with ranking <= X");
			System.out.println("(S)tate search: print all university rankings and names with state = Y");
			System.out.println("(Q)uit program"); // Type "Q" to quit the program
			System.out.println("-------------------------------------------");
			System.out.print("Select menu: ");
			
			String option = console.next();
			if(option.equals("W")) { 
				// Complete W option to write names.txt
				// Your work for this method starts here. Do not change the codes above of this method.
				
				
				
				
				
				
				
				
				
				// Your work for this method ends here.
				System.out.println();
			}else if(option.equals("R")) {
				// Complete R option. You can assume that the user will provide a valid integer X.

				System.out.print("Enter X between 1 and 300: ");
				int X = console.nextInt();
				System.out.println("[Message] Printing....");
				
				// Your work for this method starts here. Do not change the codes above of this method.
				
				
				
				
				
				
				
				
				

				// Your work for this method ends here.

				System.out.println("[Message] Output names, cities, and states printed. \n");
				System.out.println();
				System.out.println();
			}else if(option.equals("S")){
				// Complete S option. You can assume that the user will a valid state name.
				System.out.println("Use abbreviated state names");
				System.out.print("Enter State:");
				String Y = console.next();
				System.out.println("[Message] Printing....");
				// Your work for this method starts here. Do not change the codes above of this method.
				
				
				
				
				
				
				
				
				
				// Your work for this method ends here.
				
				System.out.println("[Message] Output names printed. \n");
				System.out.println();
				System.out.println();
			}else if(option.equals("Q")){
				// Q option is complete. You do not need to update. 
				System.out.println("[Message] Terminating program. \n\n");
				System.out.println();
				System.out.println();
				continueProgram = false;
			}else { // "wrong menu" option is choice. You do not need to update. 
				System.out.println("[Message] Incorrect menu choice. Select W, R, S, or Q. \n\n");
				System.out.println();
				System.out.println();
			}
		}
		
		console.close();
	}

}
