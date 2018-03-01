import java.util.Date;
public class problem21 {
	public static final int N = 500000000;
	public static void main(String[] args) {
	// Start measuring time
	long begTime = new Date().getTime();

	// Measure the execution time of the following program statements
	G g1 = new G();
	g1.call();
	
	// Compute and print the time elapsed
	double timeElapsed = (new Date().getTime()- begTime) * 0.001;
	System.out.printf("Time elapsed = %f secs\n", timeElapsed);
	}
}
