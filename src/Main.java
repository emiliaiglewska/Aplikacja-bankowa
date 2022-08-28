package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
       Konto konto = new Konto(123456, "Anna", "Kowalska", 1000, 1234);
       //Konto konto2 = new Konto(456789, "Jan", "Nowak", 1500, 2345);
       //Konto kont03 = new Konto(789123, "Katarzyna", "Stonoga", 500, 3456);
       //Konto konto3 = new Konto(147852, "Adam", "Szybki", 5000, 4567);



        System.out.println("Witaj, podaj login oraz pin, aby sie zalogować");
        int login = scanner.nextInt();
        int pin = scanner.nextInt();

        for (int i = 0; i < konto.getNumerKlienta() + konto.getPin(); i++) {
            if (login == konto.getNumerKlienta()) ;
            if (pin == konto.getPin()) {
                System.out.println("Witaj " + konto.getImie() +  konto.getNazwisko() +" na swoim koncie bankowym");
                System.out.println("Wybierz: 1-pokaz szczegoly konta, 2-wyplac gotowke, 3-wplac gotowke, 4-wyjscie");
                break;
            }}
            int metoda = scanner.nextInt();

            System.out.println("Wybrano opcje "+metoda);

            switch (metoda) {
                case 1:
                    System.out.println(konto.getImie() + konto.getNazwisko() + konto.getSaldo());
                    break;
                case 2:
                    System.out.println("Ile chcesz wyplacic");
                    double gotowka = scanner.nextDouble();
                    konto.wyplata(gotowka);
                    System.out.println(konto.getSaldo());
                    break;
                case 3:
                    System.out.println("Ile chcesz wyplacic");
                    double gotowka1 = scanner.nextDouble();
                    konto.wplata(gotowka1);
                    System.out.println(konto.getSaldo());
                    break;
                case 4:
                    System.out.println("Zostales wylogowany");
                    break;

                    }
            }

    }







