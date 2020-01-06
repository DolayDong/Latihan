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
            if (jamKeluar > 24) {
                System.out.println("Jam keluar tidak valid");
            } else if (jamMasuk > 24) {
                System.out.println("Jam masuk tidak valid");
            } else {

                String jenisKendaraan = "Mobil";
                int lamaParkir = jamKeluar - jamMasuk + 24;
                switch (jenis) {
                case 1:
                    int hargaParkirMobil;
                    jenisKendaraan = "Mobil";
                    int jamPertamaMobil = 5000;
                    int jamBerikutnyaMobil = 3000;
                    hargaParkirMobil = jamPertamaMobil + (jamBerikutnyaMobil * lamaParkir - jamBerikutnyaMobil);
                    System.out.println("Terimakasih telah melakukan transaksi dnengan rincian sebagai berikut");
                    System.out.println("Plat nomor : " + plat);
                    System.out.println("Jenis kendaraan : " + jenisKendaraan);
                    System.out.println("Lama parkir : " + lamaParkir);
                    System.out.println("Biaya parkir : " + hargaParkirMobil);
                    System.out.println("Semoga pelayanan kami memuaskan");
                    break;
                case 2:
                    int hargaParkirMotor;
                    jenisKendaraan = "Motor";
                    int jamPertamaMotor = 3000;
                    int jamBerikutnyaMotor = 1500;
                    hargaParkirMotor = jamPertamaMotor + (jamBerikutnyaMotor * lamaParkir - jamBerikutnyaMotor);
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
}