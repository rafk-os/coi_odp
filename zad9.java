

    private static boolean checkCharacters(String pierwszyString, String drugiString){
        char[] pierwszaTab = pierwszyString.toLowerCase(Locale.ROOT).toCharArray(), drugaTab = drugiString.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(pierwszaTab);
        Arrays.sort(drugaTab);
        return Arrays.equals(pierwszaTab,drugaTab);
    }




    @Test
    @DisplayName("Podstawowe porównanie które ma zwrócić true")
    void firstPossibility() {
        assertTrue(checkCharacters("rama","mara"));
    }

    @Test
    @DisplayName("Podstawowe porównanie które ma zwrócić false")
    void secondPossibility() {
        assertFalse(checkCharacters("aabba", "babab"));
    }

    @Test
    @DisplayName("Podstawowe porównanie z różnymi wielkościami liter")
    void thirdPossibility() {
        assertTrue(checkCharacters("RaMA","MarA"));
    }
    

