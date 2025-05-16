abstract class Urun{

        String ad;
        double fiyat;

        public Urun(String ad, double fiyat) {
            this.ad = ad;
            this.fiyat = fiyat;
        }

        public abstract void indirimUygula(double indirim);

        public double getFiyat() {
            return fiyat;
        }

        public String getAd() {
            return ad;
        }
}
