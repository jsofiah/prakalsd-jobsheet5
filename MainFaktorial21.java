import java.util.Scanner;
public class MainFaktorial21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input21.nextInt();

        Faktorial21 fk = new Faktorial21();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.FaktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " menggunakan DC: " + fk.FaktorialDC(nilai));
    }
}
