package pkt;

import java.io.File;
import net.sourceforge.jFuzzyLogic.FIS;

public class AsansorKontrol {
    private FIS fis;
    private double trafikTuru;
    private double yolcuSayisi;

    public AsansorKontrol(double trafikTuru, double yolcuSayisi) {
        this.trafikTuru = trafikTuru;
        this.yolcuSayisi = yolcuSayisi; 
    }

    public double asansorKontrol(double trafikTuru, double yolcuSayisi) {
        try {
            // Fuzzy Logic dosyasını yükleyelim
            File dosya = new File(getClass().getResource("asansorKontrol.fcl").toURI());
            fis = FIS.load(dosya.getPath());

            // Girdi değerlerini set edelim
            fis.setVariable("trafikTuru", trafikTuru);
            fis.setVariable("yolcuSayisi", yolcuSayisi);
            fis.evaluate();

            // COG metodu ile sonucu alalım (Durulama metodu otomatik olarak COG olacak)
            return fis.getVariable("asansorKati").getValue(); // COG kullanarak sonucu döndürüyoruz
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Hata durumunda döndürülecek varsayılan değer
        }
    }

    @Override
    public String toString() {
        return "Asansör Katı: " + Math.round(fis.getVariable("asansorKati").getValue()) + ". Kat";
    }
}
