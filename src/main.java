import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double tutar  ,kdvTutar ,kdvliTutar ,kdvOran ;

        Scanner input = new Scanner (System.in);
        System.out.println("Ucret Tutarını Giriniz :");
        tutar = input.nextDouble();


        boolean tutarFiyati ;
        tutarFiyati = (tutar > 0) && (tutar < 1000);

        kdvOran = tutarFiyati ? 0.18 : 0.08 ;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutarı :" + kdvliTutar);


    }
}
