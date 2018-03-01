
public class F2Thread extends Thread{
	public void run() {
		double sum = 0.0;
		 for (int x=1; x<= problem12.N; x++) sum += 1.0 / Math.pow(x, 1.0/4);
		System.out.printf("F2 = %f\n", sum);
	}
}
