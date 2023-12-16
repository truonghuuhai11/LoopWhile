package basic.dev;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;

		while (i <= 100) {
			sum += i;
			i++;
		}

		System.out.println("Tổng các số từ 1 đến 100 là: " + sum);
	}
}