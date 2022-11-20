public class OgrenciKrediManager extends BaseKrediManager{

    @Override
    public double hesapla(double tutar) {

        return tutar * 1.10;

    }

    // bu sekilde BaseKrediManager deki hesapla operasyon u ezilmis olur .


}
