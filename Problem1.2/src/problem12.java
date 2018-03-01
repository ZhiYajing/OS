import java.util.Date;

public class problem12 {
	public static final int N = 100000000;
	public static void main(String[] args) throws InterruptedException {

		// Start measuring time
		long begTime = new Date().getTime();

		// Measure the execution time of the following program statements
		F1Thread f1 = new F1Thread();
		F2Thread f2 = new F2Thread();
		f1.start();
		f2.start();
		// Compute and print the time elapsed
		f1.join();
		f2.join();
		double timeElapsed = (new Date().getTime()- begTime) * 0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
		}
}
