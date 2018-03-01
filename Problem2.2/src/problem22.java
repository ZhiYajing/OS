import java.util.Date;
public class problem22{

	public static void main(String[] args) throws InterruptedException {
	// Start measuring time
	long begTime = new Date().getTime();

	// Measure the execution time of the following program statements
	int n1=1;
	int n2=125000000;
	int n3=250000000;
	int n4=375000000;
	int n5=500000000;
	GThread g1 = new GThread(n1,n2);
	GThread g2 = new GThread(n2,n3);
	GThread g3 = new GThread(n3,n4);
	GThread g4 = new GThread(n4,n5);
	g1.start();
	g2.start();
	g3.start();
	g4.start();
	// Compute and print the time elapsed
	g1.join();
	g2.join();
	g3.join();
	g4.join();
	double result = g1.sum +g2.sum +g3.sum +g4.sum;
	System.out.printf("G= %f \n", result);
	double timeElapsed = (new Date().getTime()- begTime) * 0.001;
	System.out.printf("Time elapsed = %f secs\n", timeElapsed);
	}
}
