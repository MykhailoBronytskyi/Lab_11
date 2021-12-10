package atm;

public class ATM {
    private Bill firstBill;

    public ATM(){
        Bill bill_5 = new Bill_5();
        Bill bill_10 = new Bill_10();
        Bill bill_20 = new Bill_20();

        bill_20.setNext(bill_10);
        bill_10.setNext(bill_5);

        firstBill = bill_20;
    }

    public String process(int amount){
        return firstBill.process(amount);
    }
}
