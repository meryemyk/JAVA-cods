public class KıtapUrunu extends Urun {

    String yazar;

    public KıtapUrunu(String ad, double fiyat, String yazar) {
        super(ad, fiyat);
        this.yazar = yazar;
    }

    @Override
    public void indirimUygula(double indirim) {
        fiyat -= fiyat * indirim / 100;
    }

    @Override
    public String toString() {
        return ad + " - " + yazar + " - " + fiyat + " TL";
    }
}
