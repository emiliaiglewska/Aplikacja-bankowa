package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Podaj ile nowych kont chcesz dodać?");
        int iloscNowychKont = scanner.nextInt();
        Konto[] tablicaNowychKont = new Konto[iloscNowychKont];
        for (int i = 0; i < tablicaNowychKont.length; i++) {
            tablicaNowychKont[i] = new Konto();
            tablicaNowychKont[i].otworzKonto();
            System.out.println(tablicaNowychKont[i].toString());
        }
        System.out.println("Witaj podaj pin aby sie zalogowac");
        int pin = scanner.nextInt();

        for (int i = 0; i < tablicaNowychKont.length; i++) {
            if (pin == tablicaNowychKont[i].getPin()) {
                int metoda;

                do {
                    System.out.println("Witaj " + tablicaNowychKont[i].getImie() + tablicaNowychKont[i].getNazwisko() + " na swoim koncie bankowym");
                    System.out.println("Wybierz: 1-pokaz szczegoly konta, 2-wyplac gotowke, 3-wplac gotowke, 4-wyjscie");

                    metoda = scanner.nextInt();
                    System.out.println("Wybrano opcje " + metoda);

                    switch (metoda) {
                        case 1:
                            System.out.println(tablicaNowychKont[i].toString());
                            break;
                        case 2:
                            System.out.println("Ile chcesz wyplacic");
                            double gotowka = scanner.nextDouble();
                            tablicaNowychKont[i].wyplata(gotowka);
                            System.out.println(tablicaNowychKont[i].getSaldo());
                            break;
                        case 3:
                            System.out.println("Ile chcesz wyplacic");
                            double gotowka1 = scanner.nextDouble();
                            tablicaNowychKont[i].wplata(gotowka1);
                            System.out.println(tablicaNowychKont[i].getSaldo());
                            break;
                        case 4:
                            System.out.println("Zostales wylogowany");
                            break;

                    }
                } while (metoda != 4);
            }
        }
    }
}

















