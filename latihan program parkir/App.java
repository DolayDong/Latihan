import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Plat nomor : ");
            int plat = userInput.nextInt();
            System.out.println("Jenis kendaraan : [1/2]");
            int jenis = userInput.nextInt();
            System.out.println("Jam masuk : ");
            int jamMasuk = userInput.nextInt();
            System.out.println("Jam keluar : ");
            int jamKeluar = userInput.nextInt();

            String jenisKendaraan = "Mobil";
            int lamaParkir = jamKeluar - jamMasuk + 24;
            switch (jenis) {
            case 1:
                jenisKendaraan = "Mobil";
                int jamPertamaMobil = 5000;
                int jamBerikutnyaMobil = 3000;
                int hargaParkirMobil = jamPertamaMobil + (jamBerikutnyaMobil * lamaParkir - jamBerikutnyaMobil);
                System.out.println("Terimakasih telah melakukan transaksi dnengan rincian sebagai berikut");
                System.out.println("Plat nomor : " + plat);
                System.out.println("Jenis kendaraan : " + jenisKendaraan);
                System.out.println("Lama parkir : " + lamaParkir);
                System.out.println("Biaya parkir : " + hargaParkirMobil);
                System.out.println("Semoga pelayanan kami memuaskan");
                break;
            case 2:
                jenisKendaraan = "Motor";
                int jamPertamaMotor = 3000;
                int jamBerikutnyaMotor = 1500;
                int hargaParkirMotor = jamPertamaMotor + (jamBerikutnyaMotor * lamaParkir - jamBerikutnyaMotor);
                System.out.println("Terimakasih telah melakukan transaksi dnengan rincian sebagai berikut");
                System.out.println("Plat nomor : " + plat);
                System.out.println("Jenis kendaraan : " + jenisKendaraan);
                System.out.println("Lama parkir : " + lamaParkir);
                System.out.println("Biaya parkir : " + hargaParkirMotor);
                System.out.println("Semoga pelayanan kami memuaskan");
            default:
                System.out.println("Harap masukkan pilihan dengan benar");
                break;
            }

        }

    }
}