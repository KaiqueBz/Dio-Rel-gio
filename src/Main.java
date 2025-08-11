public class Main {
    public static void main(String[] args) {
        BRLClock brClock = new BRLClock();
        brClock.setHour(15);
        brClock.setMinute(45);
        brClock.setSecond(30);

        System.out.println("Horário Brasileiro: " + brClock.getTime());

        USClock usClock = new USClock();
        usClock.convert(brClock); // converte de BRLClock para USClock
        System.out.println("Horário Americano: " + usClock.getTime());

        // Fazendo o caminho inverso
        BRLClock brFromUS = new BRLClock();
        brFromUS.convert(usClock);
        System.out.println("De volta para BR: " + brFromUS.getTime());
    }
}
