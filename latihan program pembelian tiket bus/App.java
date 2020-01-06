import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nama;
        int ruteBus;
        String rute = "";
        int kelas;
        String kelasString = "";
        int jumlahKursi = 0;
        int totalHarga = 0;
        int hargaSatuan = 0;

        for (int i = 0; i < 2; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("PROGRAM PEMBELIAN TIKET BUS");
            System.out.println("Rute tersedia : 1. Jakarta - Bandung");
            System.out.println("                2. Bandung - Jakarta");
            System.out.println("                3. Jakarta - Tasikmalaya");
            System.out.println();
            System.out.print("Nama pemesan : ");
            nama = userInput.nextLine();
            System.out.print("Rute bis : ");
            ruteBus = userInput.nextInt();
            System.out.print("Kelas : [1.AC/2.NA]");
            kelas = userInput.nextInt();
            System.out.print("Jumlah kursi : ");
            jumlahKursi = userInput.nextInt();

            if (ruteBus == 1) {
                rute = "Jakarta - Bandung ";
                if (kelas == 1) {
                    kelasString = "AC";
                    hargaSatuan = 130000;
                    totalHarga = hargaSatuan * jumlahKursi;
                } else if (kelas == 2) {
                    hargaSatuan = 90000;
                    totalHarga = hargaSatuan * jumlahKursi;
                    kelasString = "NON AC";
                } else {
                    System.out.println("Kelas tidak tersedia");
                }

            } else if (ruteBus == 2) {
                rute = "Bandung - Jakarta ";
                if (kelas == 1) {
                    kelasString = "AC";
                    hargaSatuan = 150000;
                    totalHarga = hargaSatuan * jumlahKursi;

                } else if (kelas == 2) {
                    kelasString = "NON AC";
                    hargaSatuan = 70000;
                    totalHarga = hargaSatuan * jumlahKursi;

                } else {
                    System.out.println("Kelas tidak tersedia");
                }
            } else if (ruteBus == 3) {
                rute = "Jakarta - Tasikmalaya ";
                if (kelas == 1) {
                    kelasString = "AC";
                    hargaSatuan = 70000;
                    totalHarga = hargaSatuan * jumlahKursi;

                } else if (kelas == 2) {
                    kelasString = "NON AC";
                    hargaSatuan = 50000;
                    totalHarga = hargaSatuan * jumlahKursi;

                } else {
                    System.out.println("Kelas tidak tersedia");
                }

            } else {
                System.out.println("Rute tidak tersedia");
            }
            System.out.println("Nama Pemesan : " + nama);
            System.out.println("Rute : " + rute);
            System.out.println("Kelas : " + kelasString);
            System.out.println("Harga satuan : " + hargaSatuan);
            System.out.println("Jumlah Kursi : " + jumlahKursi);
            System.out.println("Total Harga : " + totalHarga);
            System.out.println("Terimakasih, Silahkan membayar di alfamart terdekat gan");

        }
    }

}
