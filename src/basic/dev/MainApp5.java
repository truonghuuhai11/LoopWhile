package basic.dev;

public class MainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;

		while (n <= 999) {
			int temp = n;
			int sum = 0;

			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}

			if (sum % 3 == 0) {
				System.out.println(n);
			}

			n++;
		}
	}
}