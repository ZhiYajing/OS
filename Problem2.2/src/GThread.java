
public class GThread extends Thread {
	int a;
	int b;
	double sum = 0.0;
	public GThread(int N1,int N2) {
		this.a=N1;
		this.b=N2;
	}
	public void run() {
		call();
	}
	
	public void call() {
			sum=0;
			 for (int i=a; i<=b; i++) sum += 1.0 / Math.sqrt(i);
			 System.out.printf("G = %f\n", sum);
		}
}
