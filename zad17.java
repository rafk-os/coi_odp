private static void checkAge(String pesel){
        int CurrentYear = Calendar.getInstance().get(Calendar.YEAR),personMonth = Integer.parseInt(pesel.substring(2,4));
        int personDay = Integer.parseInt(pesel.substring(4,6)), personYear = Integer.parseInt(pesel.substring(0,2));
        if (personMonth >= 21 && personMonth <= 32) {
            personYear += 2000;
            personMonth -= 20;
        }
        else if (personMonth >= 1 && personMonth <= 12) personYear += 1900;
        else {
            personYear += 1800;
            personMonth -= 80;
        }
        if (CurrentYear - personYear <= 17 ) System.out.println("Brawo nie jesteś  pełnoletni");
        else if( CurrentYear - personYear > 18) System.out.println("Brawo  jesteś  pełnoletni");
        else {
            LocalDate dateOfBirth =  LocalDate.of(CurrentYear,personMonth,personDay);
            LocalDate currentDate = LocalDate.now();
            if (dateOfBirth.isAfter(currentDate)) System.out.println("Brawo nie jesteś  pełnoletni");
            else System.out.println("Brawo  jesteś  pełnoletni");
        }

    }
