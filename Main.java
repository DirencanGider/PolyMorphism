//PolyMorphism: Bir nesnenin birden farklı nesne gibi davranması
class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus() {
        return " Hayvan konuşuyor...";
    }
}
class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    }
}
class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
    }
}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
    }
}
public class Main {
    public static void main(String[] args) {

        Hayvan hayvan1 = new Kedi("Tekir"); /*"Hayvan("Limon");" demiştik en başta. Onu silip yerine
                                                   "Kedi("Tekir");" yazdık ve Java bir problem çıkarmadı.
                                                  Tekrar çalıştırdığımızda, İlk çalıştırmamızda "Hayvan konuşuyor..."
                                                  yazarken, Kedi olarak değiştirince "Tekir miyavlıyor..." yazdı.
                                                  En son hayvan1 olarak değiştirdik. Diğer hayvanaları deneyeceğimizden*/
        Hayvan hayvan2 = new Kopek("Karabaş");
        Hayvan hayvan3 = new At("Gülbatur");

        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());



    }
}
