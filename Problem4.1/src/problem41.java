import java.util.Date;
public class problem41{

	public static void main(String[] args) throws InterruptedException {
	// Start measuring time
	long begTime = new Date().getTime();
	
	// Measure the execution time of the following program statements
	for(int i=0;i<100;i++) {
		System.out.println("TTimes:"+(i+1));
		GenRanThread t = new GenRanThread();
		t.start();
		t.join();
	}
	double timeElapsed = (new Date().getTime()- begTime) * 0.001;
	System.out.printf("Time elapsed = %f secs\n", timeElapsed);
	}
}
