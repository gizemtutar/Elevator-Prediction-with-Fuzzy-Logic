package pkt;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Scanner nesnesi ile kullanıcıdan giriş almak
        Scanner in = new Scanner(System.in);

        // Trafik Türü girişi (1: Yukarı yoğun, 2: Aşağı yoğun, 3: Dengeli)
        System.out.print("Trafik Türü (1: Yukarı yoğun, 2: Aşağı yoğun, 3: Dengeli): ");
        double trafikTuru = in.nextDouble();

        // Yolcu Sayısı girişi (0-100 arasında)
        System.out.print("Yolcu Sayısı (0-100 arasında): ");
        double yolcuSayisi = in.nextDouble();

        // AsansörKontrol nesnesi oluşturuluyor ve girişler ile işlem başlatılıyor
        // Burada durulamaMetodu'nu sadece COG olarak sabitledik
        AsansorKontrol asansorKontrol = new AsansorKontrol(trafikTuru, yolcuSayisi);
        double asansorKati = asansorKontrol.asansorKontrol(trafikTuru, yolcuSayisi);

        // Sonuç ekrana yazdırılıyor
        System.out.println("Asansör Bekleme Kati: " + Math.round(asansorKati) + ". Kat");
        
        AsansorGrafik.showGrafik();

        // Scanner kaynağını kapatıyoruz
        in.close();
    }
}
