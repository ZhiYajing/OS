import java.io.IOException;
import java.util.Date;

public class problem42 {
	public static void main(String[] args) throws IOException, InterruptedException {
		// Start measuring time
		long begTime = new Date().getTime();
		
		// Measure the execution time of the following program statements
		for(int i=0;i<100;i++) {
			System.out.println("PTimes:"+(i+1));
			ProcessBuilder PBuild = new ProcessBuilder("java","-cp","C:\\eclipse\\workspace\\Problem4.2\\bin","GenRan");
			PBuild.inheritIO();
			Process p = PBuild.start();
			p.waitFor();
		}
		double timeElapsed = (new Date().getTime()- begTime) * 0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
		}
}
