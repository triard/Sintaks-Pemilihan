import java.util.Scanner;
class Umur {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int umur;
		String status;
		
		System.out.print("Masukkan umur Anda\t: ");
		umur = sc.nextInt();
		
		if (umur >= 17) {
			status = "Anda Boleh Berkendara";
		}
		
		else {
			status = "Anda  Tidak Boleh Berkendara";
		}
		
		System.out.println(status);
	}
}