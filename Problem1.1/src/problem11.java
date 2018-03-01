import java.util.Date;
public class problem11 {
	public static final int N = 100000000;
	public static void main(String[] args) {

		// Start measuring time
		long begTime = new Date().getTime();

		// Measure the execution time of the following program statements
		F1 f1 = new F1();
		F2 f2 = new F2();
		f1.call();
		f2.call();
		// Compute and print the time elapsed
		double timeElapsed = (new Date().getTime()- begTime) * 0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
		}
}
