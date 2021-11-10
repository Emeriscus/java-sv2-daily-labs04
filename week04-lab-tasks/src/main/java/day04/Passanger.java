package day04;

public class Passanger {

    private String name;
    private String ticketIdentifier;
    private int packageAmount;

    public Passanger(String name, String ticketIdentifier, int packageAmount) {
        this.name = name;
        this.ticketIdentifier = ticketIdentifier;
        this.packageAmount = packageAmount;
    }

    public String getName() {
        return name;
    }

    public String getTicketIdentifier() {
        return ticketIdentifier;
    }

    public int getPackageAmount() {
        return packageAmount;
    }

}
