public class KıyafetUrunu extends Urun {
    String beden;

    public KıyafetUrunu(String ad, double fiyat, String beden) {
        super(ad, fiyat);
        this.beden = beden;
    }

    @Override
    public void indirimUygula(double indirim) {
        fiyat -= fiyat * indirim / 100;
    }

    @Override
    public String toString() {
        return ad + " (" + beden + ") - " + fiyat + " TL";
    }
}
