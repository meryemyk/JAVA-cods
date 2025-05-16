public class Main {
    public static void main(String[] args){

        Sipariş siparis = new Sipariş("Ahmet Yılmaz", "Burdur, Türkiye");


        ElektronikUrun laptop = new ElektronikUrun("Laptop", 5000, "Dell");
        KıyafetUrunu tshirt = new KıyafetUrunu("T-Shirt", 100, "M");
        KıtapUrunu kitap = new KıtapUrunu("Java Programlama", 50, "John Doe");

        siparis.urunEkle(laptop);
        siparis.urunEkle(tshirt);
        siparis.urunEkle(kitap);


        siparis.tumUrunlereIndirimUygula(10);


        siparis.siparisDetaylariniYazdir();


        siparis.kargoDurumunuGuncelle("Gönderildi");
        System.out.println("\nGüncellenmiş Sipariş Detayları:");
        siparis.siparisDetaylariniYazdir();
    }
}
