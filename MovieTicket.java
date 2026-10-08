import java.util.Scanner;
 class MovieTicket{
    String movieName;
    double ticketPrice;
    int numberOfTickets;


    MovieTicket(String movieName, double ticketPrice, int numberOfTickets){
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    double calculateTotalPrice(){
        return ticketPrice * numberOfTickets;
    }
    
    double calculateDiscount(){
        if (numberOfTickets >= 5) {
            return calculateTotalPrice() * 0.10; 
        } else {
            return 0; 
        }
    }
    double calculateFinalAmount(){
        return calculateTotalPrice() - calculateDiscount();
    }
    void displaybill(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: Rs" + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Price: Rs" + calculateTotalPrice());
        System.out.println("Discount: Rs" + calculateDiscount());
        System.out.println("Final Amount to Pay: Rs" + calculateFinalAmount());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.println("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        System.out.println("Enter Number of Tickets: ");
        int numberOfTickets = sc.nextInt();

        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);
        ticket.displaybill();
    }
    
}

