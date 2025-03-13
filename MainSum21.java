import java.util.Scanner;
public class MainSum21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input21.nextInt();

        Sum21 sm = new Sum21(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input21.nextInt();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
