
public class F1Thread extends Thread{
	public void run() {
		double sum = 0.0;
		 for (int i=1; i<= problem12.N; i++) sum += 1.0 / Math.pow(i, 1.0/3);
		 System.out.printf("F1 = %f\n", sum);
		}
	}

