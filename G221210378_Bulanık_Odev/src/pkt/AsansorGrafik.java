package pkt;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.*;

public class AsansorGrafik {

    public static void showGrafik() {
        // Grafik verilerini hazırlıyoruz
        XYSeries seriesAltKat = new XYSeries("Alt Kat Üyelik Fonksiyonu");

        // Alt kat için üyelik fonksiyonu (Fuzzy Logic) için x-y değerleri ekliyoruz
        seriesAltKat.add(0, 1);  // Kat 0, üyelik değeri 1
        seriesAltKat.add(3, 1);  // Kat 3, üyelik değeri 1
        seriesAltKat.add(5, 0);  // Kat 5, üyelik değeri 0

        // Diğer terimler (orta kat ve üst kat) için de benzer veriler eklenebilir
        // Orta Kat (örnek)
        XYSeries seriesOrtaKat = new XYSeries("Orta Kat Üyelik Fonksiyonu");
        seriesOrtaKat.add(3, 0);
        seriesOrtaKat.add(5, 1);
        seriesOrtaKat.add(7, 0);

        // Üst Kat (örnek)
        XYSeries seriesUstKat = new XYSeries("Üst Kat Üyelik Fonksiyonu");
        seriesUstKat.add(5, 0);
        seriesUstKat.add(7, 1);
        seriesUstKat.add(10, 1);

        // XYSeriesCollection veri kümesini oluşturuyoruz
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(seriesAltKat);
        dataset.addSeries(seriesOrtaKat);
        dataset.addSeries(seriesUstKat);

        // Grafik oluşturuyoruz (PlotOrientation.VERTICAL için)
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Asansör Katı Üyelik Fonksiyonları",  // Başlık
                "Kat",                               // X Eksen Başlığı
                "Üyelik Değeri",                     // Y Eksen Başlığı
                dataset,                             // Veri Kümesi
                PlotOrientation.VERTICAL,            // Grafik yönü (dikey)
                true,                                // Legendi göster
                true,                                // Araç ipuçlarını göster
                false                                // URL'leri gösterme
        );

        // Grafik panelini oluşturuyoruz
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        // JFrame kullanarak grafiği gösteriyoruz
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
