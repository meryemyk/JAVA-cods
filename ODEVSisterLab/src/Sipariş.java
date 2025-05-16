import java.util.ArrayList;
import java.util.List;

public class Sipariş {
    private String musteriAdi;
    private String teslimatAdresi;
    private List<Urun> urunler = new ArrayList<>();
    private String kargoDurumu;

    public Sipariş(String musteriAdi, String teslimatAdresi) {
        this.musteriAdi = musteriAdi;
        this.teslimatAdresi = teslimatAdresi;
        this.kargoDurumu = "Hazırlanıyor";
    }

    public void urunEkle(Urun urun) {
        urunler.add(urun);
    }

    public void kargoDurumunuGuncelle(String durum) {
        this.kargoDurumu = durum;
    }

    public void tumUrunlereIndirimUygula(double indirim) {
        for (Urun urun : urunler) {
            urun.indirimUygula(indirim);
        }
    }

    public void siparisDetaylariniYazdir() {
        System.out.println("Müşteri Adı: " + musteriAdi);
        System.out.println("Teslimat Adresi: " + teslimatAdresi);
        System.out.println("Kargo Durumu: " + kargoDurumu);
        System.out.println("Sipariş Ürünleri:");
        for (Urun urun : urunler) {
            System.out.println(urun);
        }
    }
}
