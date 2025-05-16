public class ElektronikUrun extends Urun {
    String marka;

    public ElektronikUrun(String ad, double fiyat, String marka) {
        super(ad, fiyat);
        this.marka = marka;
    }

    @Override
    public void indirimUygula(double indirim) {
        fiyat -= fiyat * indirim / 100;
    }

    @Override
    public String toString() {
        return ad + " (" + marka + ") - " + fiyat + " TL";
    }

}
