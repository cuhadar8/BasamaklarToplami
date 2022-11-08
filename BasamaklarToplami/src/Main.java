import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Lütfen işlem yapmak istdeğiniz sayıyı giriniz : ");
		int sayi = scanner.nextInt();
		int basamakDegeri = 0;
		int toplam = 0;

		while (sayi != 0) {
			basamakDegeri = sayi % 10;
			toplam += basamakDegeri;
			sayi /= 10;
		}

		System.out.print("Basamak toplamı : " + toplam);
	}

}
