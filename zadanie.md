# Zadania domowe – Instrukcje sterujące, typy proste, String

1. **Wiek i pełnoletność**
    - Wczytaj z konsoli wiek użytkownika.
    - Jeśli wiek jest większy lub równy 18, wypisz: `Jesteś pełnoletni`.
    - W przeciwnym razie wypisz: `Nie jesteś pełnoletni`.

2. **Parzystość liczby**
    - Wczytaj liczbę całkowitą.
    - Ustal, czy liczba jest parzysta, czy nieparzysta i wypisz odpowiedni komunikat.

3. **Kategoryzacja wieku**
    - Wczytaj wiek i wypisz jedną z kategorii:  
      `Dziecko` (< 12), `Nastolatek` (12–17), `Dorosły` (18–64), `Senior` (>= 65).

4. **Ocena temperatury**
    - Wczytaj temperaturę w stopniach Celsjusza.
    - Jeśli jest poniżej 0 – wypisz: `Mróz`.
    - Jeśli jest 0–15 – wypisz: `Chłodno`.
    - Jeśli jest 16–25 – wypisz: `Ciepło`.
    - Jeśli powyżej 25 – wypisz: `Gorąco`.

5. **Dzień tygodnia – klasyczny `switch`**
    - Wczytaj numer dnia tygodnia (1–7).
    - Wypisz jego nazwę w języku polskim (1 = Poniedziałek, …, 7 = Niedziela).
    - Jeśli numer jest spoza zakresu – wypisz: `Nieznany dzień`.

6. **Dzień tygodnia – nowy `switch`**
    - To samo co w poprzednim zadaniu, ale użyj nowej składni `switch` jako wyrażenia (Java 17).

7. **Operator trójargumentowy – pełnoletność**
    - Wczytaj wiek.
    - Ustal i wypisz `Pełnoletni` lub `Niepełnoletni` za pomocą operatora `? :`.

8. **Stawka VAT**
    - Wczytaj kategorię produktu jako tekst (`żywność`, `książki`, `usługi`, `ubrania`, `elektronika`, inne).
    - Wyświetl procent VAT dla tej kategorii (5%, 8% lub 23%) korzystając z `switch`.

9. **Mini–kalkulator**
    - Wczytaj dwie liczby oraz operator (+, -, *, /, %).
    - Wykonaj działanie i wyświetl wynik.
    - Jeśli dzielenie przez zero – wypisz komunikat błędu.

10. **Sprawdzenie hasła**
    - Wczytaj hasło od użytkownika.
    - Jeśli hasło ma mniej niż 8 znaków – wypisz: `Hasło za krótkie`.
    - Jeśli zaczyna się wielką literą – wypisz: `OK`, w przeciwnym razie: `Hasło musi zaczynać się wielką literą`.

11. **Data – rok przestępny**
    - Wczytaj rok.
    - Sprawdź, czy jest przestępny według reguły gregoriańskiej i wypisz odpowiedni komunikat.

12. **Data – poprawność**
    - Wczytaj dzień, miesiąc i rok.
    - Sprawdź, czy data jest poprawna (uwzględnij luty i lata przestępne).
    - Wypisz `Data poprawna` lub `Data niepoprawna`.

13. **Gra: Kamień–Papier–Nożyce (jedna runda)**
    - Wczytaj ruch gracza (`k`, `p` lub `n`).
    - Wylosuj ruch komputera.
    - Wypisz, kto wygrał rundę.