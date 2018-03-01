import java.io.IOException;

public class problem3 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println("Hello Baby!");
		ProcessBuilder Pbuid1 = new ProcessBuilder("notepad","cs_baby.txt");
		ProcessBuilder Pbuid2 = new ProcessBuilder("notepad","is_baby.txt");
		Process p1 = Pbuid1.start();
		Process p2 = Pbuid2.start();
		p1.waitFor();
		p2.waitFor();
		
		System.out.println("Good bye Baby!");
	}
}
