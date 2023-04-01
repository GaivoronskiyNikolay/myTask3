public class Main {

    static double ticketPrise = 70.0;
    static double ticketKidsDiscount = 0.5;
    static double tiketDiscount = 0.3;
    static int quantityDefoultTicket = 9;
    static int quantityKidsTicket = 11;
    static int quantityPensionersTicket = 7;

    public static void main(String[] args) {

        double countDefoult = ticketPrise * quantityDefoultTicket;
        double countKids = ticketPrise * (1 -ticketKidsDiscount) * quantityKidsTicket;
        double countPensioners = ticketPrise * (1-tiketDiscount) * quantityPensionersTicket;
        double sumCount = countDefoult + countKids + countPensioners;
        System.out.println("Стоимость билетов для взрослых = " + countDefoult);
        System.out.println("Стоимость билета для детей = "+ countKids);
        System.out.println("Стоимость билетов для пенсионеров = " + countPensioners);
        System.out.println("Общая стоимость = " + sumCount);


    }

}