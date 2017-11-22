import java.util.*;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Hello! How are you? How about meeting tomorrow?");
		String[] words = s.split(" ");
		StringTokenizer st = new StringTokenizer(s);
		int count = 0;
		for(int i=0;i<st.countTokens();i++) {
			
			for(int j=i+1;j<st.countTokens();j++) {
				
				if(words[i].toLowerCase().equals(words[j].toLowerCase())) {
					
					count++;
				}
			}
		}

		System.out.println(count);
		
	}

}
