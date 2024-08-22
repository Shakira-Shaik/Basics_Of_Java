package stringandarrays;
import java.util.Arrays;
public class Find_SpecialCharacters {
       static int Count_of_Alphabet=0;
		static int Count_of_Numeric=0;
		static int Count_of_Spaces=0;
		static int Count_of_SpecialCharacters=0; 
public static void main(String[] args) {
		String input="#James Bond 007";
		char C1[]=input.toCharArray();
		System.out.println("The array of the given string is: " +Arrays.toString(C1)); 
		//System.out.println("Finding Alphabets: ");
		for(int i=0;i<input.length();i++) {
		boolean Answer=Character.isAlphabetic(C1[i]); 
			if(Answer==true) {
			Count_of_Alphabet++; }
		}
			//System.out.println("The total number of alphabets are: "+ Count_of_Alphabet);
			//System.out.println("Finding Numeric: ");
			for(int i=0;i<input.length();i++) {
			boolean Answer=Character.isDigit(C1[i]); 
				if(Answer==true) {
					Count_of_Numeric++;  	}
			}
			//	System.out.println("The total number of Numeric count is: "+ Count_of_Numeric);
			//System.out.println("Finding Spaces: ");
				for(int i=0;i<input.length();i++) {
				boolean Answer=Character.isSpaceChar(C1[i]); 
					if(Answer==true) { 
						Count_of_Spaces++;  }
					}
				//	System.out.println("The total number of Numeric count is: "+ Count_of_Spaces);	
					System.out.println("Finding Special characters: "); 
					Count_of_SpecialCharacters=(input.length()-(Count_of_Alphabet+Count_of_Numeric+Count_of_Spaces));
					System.out.println("The total no of special characters are: "+Count_of_SpecialCharacters);
	}
}

