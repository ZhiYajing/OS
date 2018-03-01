import java.util.Random;

public class GenRanThread extends Thread {
	public void run() {
		GenRandom();
	}

	static void GenRandom() {
		int i, n;
		double mean = 0;
		Random ran = new Random();
		for (i = 1; i <= 1000; i++) {
			n = ran.nextInt(6) + 1;
			mean = mean + n;
		}
		System.out.printf("Mean random value=%f\n", mean / 1000);
	}
}
