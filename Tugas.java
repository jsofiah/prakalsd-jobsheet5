public class Tugas {
    String nama, nim;
    int thnMasuk, UTS, UAS;

    public Tugas(String nama, String nim, int thnMasuk, int UTS, int UAS) {
        this.nama = nama;
        this.nim = nim;
        this.thnMasuk = thnMasuk;
        this.UTS = UTS;
        this.UAS = UAS;
    }

    public void tampilData() {
        System.out.printf("| %-10s | %-15s | %-10d | %-5d | %-5d |\n", nama, nim, thnMasuk, UTS, UAS);
    }

    public static int[] tinggiRendahUTS(Tugas[] arr, int l, int r) {
        if (l == r) {
            return new int[]{arr[l].UTS, arr[l].UTS};
        }
        int mid = (l + r) / 2;
        int[] hasilKiri = tinggiRendahUTS(arr, l, mid);
        int[] hasilKanan = tinggiRendahUTS(arr, mid + 1, r);
        int tinggiUTS, rendahUTS;

        if (hasilKiri[0] > hasilKanan[0]) {
            tinggiUTS = hasilKiri[0];
        } else {
            tinggiUTS = hasilKanan[0];
        }

        if (hasilKiri[1] < hasilKanan[1]) {
            rendahUTS = hasilKiri[1];
        } else {
            rendahUTS = hasilKanan[1];
        }

        return new int[]{tinggiUTS, rendahUTS};
    }

    public static double rataUAS(Tugas[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].UAS;
        }
        return (double) total / arr.length;
    }
}
