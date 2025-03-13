import java.util.Scanner;
public class MainPangkat21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input21.nextInt();

        Pangkat21[] png = new Pangkat21[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1)+ ": ");
            int basis = input21.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1)+ ": ");
            int pangkat = input21.nextInt();
            png[i] = new Pangkat21(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat21 p : png) {
            // System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DEVIDE CONQUER: ");
        for (Pangkat21 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}