

/*The program you are given declares LinkedList words write a program to take words as input and add them to linkedlist untill its size isnot equal to 5.
 * then output only those words whose length is more than 4 character.
 * Sample input  java practice is makes perfect
 * sample output 
 * 
 * */
import java.util.LinkedList;
import java.util.Scanner;

public class Linked {
public static void main(String[] args) {
		// TODO Auto-generated method stubs
	Scanner scanner=new 
			Scanner(System.in);
	
	LinkedList<String>words=new
			LinkedList<String>();
	
	while(words.size()<5) {
		String word=scanner.nextLine();
		
	words.add(word);
	
	}
for (String w:words) {
	if(w.length()>4) {
		System.out.println(w);
	}
}
			
	}

}
