public class MainTugas {
    public static void main(String[] args) {
        Tugas[] mahasiswa = {
            new Tugas("Ahmad", "220101001", 2022, 78, 82),
            new Tugas("Budi", "220101002", 2022, 85, 88),
            new Tugas("Cindy", "220101003", 2021, 90, 87),
            new Tugas("Dian", "220101004", 2021, 76, 79),
            new Tugas("Eko", "220101005", 2023, 92, 95),
            new Tugas("Fajar", "220101006", 2020, 88, 85),
            new Tugas("Gina", "220101007", 2023, 80, 83),
            new Tugas("Hadi", "220101008", 2020, 82, 84)
        };

        System.out.println("| Nama       | NIM             | Tahun Masuk | UTS  | UAS  |");
        System.out.println("----------------------------------------------------------");
        for (Tugas m : mahasiswa) {
            m.tampilData();
        }
        System.out.println("----------------------------------------------------------");

        int[] tertinggiTerrendahUTS = Tugas.tinggiRendahUTS(mahasiswa, 0, mahasiswa.length - 1);
        double rerataUAS = Tugas.rataUAS(mahasiswa);

        System.out.println("Nilai UTS Tertinggi: " + tertinggiTerrendahUTS[0]);
        System.out.println("Nilai UTS Terendah: " + tertinggiTerrendahUTS[1]);
        System.out.println("Rata-rata Nilai UAS: " + String.format("%.2f", rerataUAS));
    }
}
