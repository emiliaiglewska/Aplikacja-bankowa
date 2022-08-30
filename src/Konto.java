package src;

import java.util.Scanner;

public class Konto {
    private int numerKlienta;
    private String imie;
    private String nazwisko;
    private double saldo;

    private int pin;

    Scanner sc = new Scanner(System.in);

    public void otworzKonto() {
        System.out.print("numer konta: ");
        numerKlienta = sc.nextInt();
        System.out.print("wprowadz imie: ");
        imie = sc.next();
        System.out.print("wprowadz nazwisko: ");
        nazwisko = sc.next();
        System.out.print("jakie saldo: ");
        saldo = sc.nextLong();
        System.out.print("numer pin: ");
        pin = sc.nextInt();
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

        @Override
        public String toString() {
            return "Konto{" +
                    "numerKlienta=" + numerKlienta +
                    ", imie='" + imie + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    ", saldo=" + saldo +
                    ", pin=" + pin +
                    ", sc=" + sc +
                    '}';
        }
    }

