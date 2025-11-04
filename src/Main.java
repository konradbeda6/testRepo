import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        System.out.println(dayOfWeek()); // task6;
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
        task13();

    }

    private static void task13(){
        Random random = new Random();
        System.out.println("Kamień (k), papier (p) czy nożyce (n)?");
        String player = sc.nextLine();
        String computer = null;
        computer = getComputerMove(random);

        if (player.equals(computer)){
            System.out.println("Gracz " + player + " vs " + computer + " Komputer" + " = Remis");
        } else if (player.equals("k") && computer.equals("p")) {
            System.out.println("Gracz " + player + " vs " + computer + " Komputer" + " = Komputer wygrał");
        } else if (player.equals("n") && computer.equals("p")) {
            System.out.println("Gracz " + player + " vs " + computer + " Komputer" + " = Gracz wygrał");
        } else if (player.equals("p") && computer.equals("k")) {
            System.out.println("Gracz " + player + " vs " + computer + " Komputer" + " = Gracz wygrał");
        }else if (player.equals("p") && computer.equals("n")){
            System.out.println("Gracz " + player + " vs " + computer + " Komputer" + " = Komputer wygrał");
        } else if (player.equals("k") && computer.equals("n")) {
            System.out.println("Gracz " + player + " vs " + computer + " Komputer" + " = Gracz wygrał");
        } else if (player.equals("n") && computer.equals("k")) {
            System.out.println("Gracz " + player + " vs " + computer + " Komputer" + " = Komputer wygrał");
        }
    }

    private static String getComputerMove(Random random) {
        String computer;
        int num = random.nextInt(3);
        if (num == 0){
            computer = "k";
        } else if (num == 1) {
            computer = "p";
        } else {
            computer = "n";
        }
        return computer;
    }

    private static void task12(){
        System.out.println("Podaj dzień miesiąca:");
        int day = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj miesiąc:");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj rok:");
        int year = sc.nextInt();
        sc.nextLine();
        boolean b = task12YearCheck(year);
        if(b && month == 2 && day > 0 && day <=29){
            System.out.println("Data " + year + "-" + month + "-" + day + " jest poprawna");
        } else if (!b && month == 2 && day > 0 && day <= 28){
            System.out.println("Data " + year + "-" + month + "-" + day + " jest poprawna");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12
                && day > 0 && day <=31) {
            System.out.println("Data jest poprawna");
        }else if (month == 4 || month == 6 || month == 9 || month == 11  && day > 0 && day <=30) {
            System.out.println("Data jest poprawna");
        } else {
            System.out.println("Data jest niepoprawna");
        }

    }
    private static boolean task12YearCheck(int yearToCheck){
        if(yearToCheck % 4 != 0 ){
            return false;
        } else if (yearToCheck % 100 != 0){
            return true;
        } else if (yearToCheck % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    private static void task11(){
        System.out.println("Podaj rok do sprawdzenia ");
        int year = sc.nextInt();
        sc.nextLine();
        if(year % 4 != 0 ){
            System.out.println("Rok nie jest przestępny");
        } else if (year % 100 != 0){
            System.out.println("Rok jest przestępny");
        } else if (year % 400 == 0) {
            System.out.println("Rok jest przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
        }

    }

    private static void task10(){
        System.out.println("Podaj hasło:");
        String password = sc.nextLine();
        int passwordLength = password.length();
        char c = password.charAt(0);
        boolean upperCase = Character.isUpperCase(c);
        if ( upperCase && passwordLength >= 8){
            System.out.println("OK");
        } else if (upperCase) {
            System.out.println("Hasło za krótkie");
        } else if (passwordLength >=8) {
            System.out.println("Hasło musi zaczynać się wielką literą");
        }
    }

    private static void task9(){
        System.out.println("Podaj pierwszą liczbę");
        double number1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Jakie działanie chcesz wykonać? (+, -, *, /, %)");
        String operator = sc.nextLine();
        System.out.println("Podaj drugą liczbę");
        double number2 = sc.nextDouble();
        double result = switch(operator){
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            case "%" -> number1 % number2;
            default -> 0;
        };
        if (result == 0){
            System.out.println("Podałeś nieprawidłowy operator");
        } else {
            System.out.println("Wynik działania to " + result);
        }
    }

    private static void task8(){
        System.out.println("Podaj kategorię produktu:");
        String productCategory = sc.nextLine();
        int vat = switch (productCategory){
            case "Żywność" -> 5;
            case "Książki" -> 5;
            case "Usługi" -> 23;
            case "Ubrania" -> 23;
            case "Usługa gastronomiczna" -> 8;
            default -> 0;
        };
        if (vat == 0){
            System.out.println("Nieznana kategoria produktów");
        } else {
            System.out.println("Stawka vat to: " + vat + "%");
        }
    }

    private static void task7 (){
        System.out.println("Ile masz lat?");
        int number = sc.nextInt();
        sc.nextLine();
        String s = number >= 18 ? "pełnoletni" : "niepełnoletni";
        System.out.println(s);
    }

    private static String dayOfWeek(){
        System.out.println("Podaj numer dnia tygodnia:");
        int number = sc.nextInt();
        sc.nextLine();
        return switch(number){
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nieznany dzień";
        };
        // Z pomocą chata - wytłumaczył o co chodzi z tym wyrażeniem. Kod oczywiście napisałem sam.
        // Przyznaje, że albo nie było tego w kursie albo totalnie mi wyleciało co znaczy i kiedy używać tego wyrażenia.
    }

    private static void task5(){
        final String monday = "Poniedziałek";
        final String tuesday = "Wtorek";
        final String wednesday = "Środa";
        final String thursday = "Cwartek";
        final String friday = "Piątek";
        final String saturday = "Sobota";
        final String sunday = "Niedziela";
        System.out.println("Podaj numer dnia tygodnia:");
        int number = sc.nextInt();
        sc.nextLine();

        switch (number){
            case 1:
                System.out.println(monday);
                break;
            case 2:
                System.out.println(tuesday);
                break;
            case 3:
                System.out.println(wednesday);
                break;
            case 4:
                System.out.println(thursday);
                break;
            case 5:
                System.out.println(friday);
                break;
            case 6:
                System.out.println(saturday);
                break;
            case 7:
                System.out.println(sunday);
                break;
            default:
                System.out.println("Nieznany dzień tygodnia");

        }


    }

    private static void task4(){
        final int frost = 0;
        final int cold = 16;
        final int warm = 25;
        System.out.println("Podaj temperaturę w °C:");
        double temp = sc.nextDouble();
        sc.nextLine();
        if(temp < frost){
            System.out.println("Mróz");
        } else if (temp < cold) {
            System.out.println("Chłodno");
        } else if (temp <= warm) {
            System.out.println("Ciepło");
        } else {
            System.out.println("Gorąco");
        }

    }
    private static void task3(){
        final int kid = 12;
        final int teenager = 18;
        final int adult = 65;
        System.out.println("Podaj swój wiek:");
        int age = sc.nextInt();
        sc.nextLine();

        if ( age < kid){
            System.out.println("Dziecko");
        } else if (age < teenager) {
            System.out.println("Nastolatek");
        } else if (age < adult) {
            System.out.println("Dorosły");
        } else {
            System.out.println("Senior");
        }
    }

    private static void task2(){
        System.out.println("Podaj liczbę:");
        int number = sc.nextInt();
        sc.nextLine();
        if (number % 2 == 0 ){
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }

    private static void task1() {
        final int majority = 18;
        System.out.println("Podaj wiek:");
        int age = sc.nextInt();
        sc.nextLine();

        if (age >= majority){
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
    }
}