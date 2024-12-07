# Bulanık Mantık Projesi - Asansör Bekleme Katı Belirleme

## Proje Tanımı
Bu proje, **Bulanık Mantık ve Yapay Sinir Ağlarına Giriş** dersi kapsamında hazırlanmıştır. Projenin amacı, bir asansörün bekleyeceği katı belirlemek için trafik türü ve katlarda bekleyen yolcu sayısı gibi değişkenlerin bulanık mantık modeliyle değerlendirilmesidir.

---

## Kullanılan Teknolojiler
- **Java**: Uygulama geliştirme için kullanılmıştır.
- **Eclipse IDE**: Kodlama ve geliştirme ortamı.
- **JfuzzyLogic Kütüphanesi**: Bulanık mantık modeli oluşturmak ve çalıştırmak için.

---

## Proje Özellikleri
1. Kullanıcıdan trafik türü (yukarı yoğun, aşağı yoğun, dengeli) ve yolcu sayısı bilgileri alınır.
2. Girdiler, JfuzzyLogic ile hazırlanan bir FCL dosyasına gönderilir.
3. FCL dosyası, bulanık mantık kurallarını kullanarak asansörün bekleyeceği katı belirler.
4. Çıktı, uygulama ekranında gösterilir.

---

## Gerekli Dosyalar
- **Kod Dosyaları**: Java kodları, Eclipse projesi içinde bulunur.
- **FCL Dosyası**: JfuzzyLogic için oluşturulan bulanık model kurallarını içerir.
- **Rapor**: Projenin teorik altyapısını, kullanılan üyelik fonksiyonlarını ve girdiler/çıktılar ile ilgili detaylı açıklamaları içerir.

---

## Proje Yapısı
```
Proje Klasörü:
├── src/
│   ├── Main.java         # Proje ana sınıfı
│   └── AsansorModel.java # Bulanık model sınıfı
├── fuzzy/
│   └── asansor_model.fcl # FCL dosyası
├── rapor.pdf             # Projeye ait detaylı rapor
└── README.md             # Proje tanıtımı
```
