package atm;

public interface Bill {
    void setNext(Bill bill);
    String process(int amount);
}
