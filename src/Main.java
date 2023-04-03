import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		// negatif bir sayı girilene kadar kullanıcıdan alınan veriyi kabul eden ve girilen sayıları
		// toplayan program

		int enteredValue,sum = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Sayı Girin:");
			enteredValue = sc.nextInt();
			if (enteredValue % 2 == 1) {
				sum += enteredValue;
			}

		}while (enteredValue > 0);

		System.out.println("Toplam :" + sum);

	}
}