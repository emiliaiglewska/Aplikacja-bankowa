package src;
public class Konto {
    private int numerKlienta;
    private String imie;
    private String nazwisko;
    private double saldo;

    private int pin;

    Konto(int numerKlienta, String imie, String nazwisko, double saldo, int pin) {
        this.numerKlienta = numerKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.saldo = saldo;
        this.pin = pin;
    }


    public int getNumerKlienta() {
        return numerKlienta;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }

   public void wplata(double gotowka) {
        saldo = saldo + gotowka;
   }
   public void wyplata(double gotowka){
   saldo = saldo - gotowka;
   }


}

