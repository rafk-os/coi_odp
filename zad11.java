public void wyslijSms(String numerTel, String trescSms) {
        smsGateway.send(new Sms(numerTel, trescSms));
}

    @Test
    void exceptionTest() {
        String numer = "796054095";
        String tresc = "cos tam";


        Throwable wyjatek = assertThrows(SMSGatewayException.class, wyslijSms(numer,tresc));
        assertEquals("Bramka przeciążona", wyjatek.getMessage());
    }
