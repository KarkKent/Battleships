import java.util.Scanner;
public class GameHelper {
	
	//TODO make a class
	int getUserInput(String promt) {
		System.out.print(promt+": ");
		Scanner scanner=new Scanner(System.in);
		return scanner.nextInt();
	}
}
