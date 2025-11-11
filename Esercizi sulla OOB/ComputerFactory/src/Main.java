public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "254 x 1440");
        Motherboard theMotherboard = new Motherboard("BK-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        // thePC.getMonitor().drawPixelAt(10, 10, "red");
        // il metodo getMonitor() mi serve per accedere all'istanza della classe Monitor che thePC contiene

        // thePC.getMotherboard().loadProgram("Windows OS");
        // thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
