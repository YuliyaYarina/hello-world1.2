public class Customer extends Person{
    private int cardNomber;

    public Customer(String name, int age, int phoneNumber, int cardNomber) {
        super(name, age, phoneNumber);
        this.cardNomber = cardNomber;
    }

    public int getCardNomber() {
        return cardNomber;
    }

    public void setCardNomber(int cardNomber) {
        this.cardNomber = cardNomber;
    }
}