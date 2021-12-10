package atm;

import lombok.Getter;

public class Bill_Base implements Bill{
    @Getter
    private final int divide_value;
    private Bill next_bill;

    public Bill_Base(int value){
        this.divide_value = value;

    }

    @Override
    public void setNext(Bill bill) {
        this.next_bill = bill;
    }

    @Override
    public String process(int amount) {
        String result = "";
        if (next_bill != null){
            result += next_bill.process(amount % divide_value);

        } else if (amount < 0 || amount % divide_value != 0 ){
            throw new IllegalArgumentException();
        }

        int how_many_bills = amount / divide_value;

        result += "You can use at max " + Integer.toString(how_many_bills)
                  + " bills of value " + Integer.toString(divide_value) + "\n";
        return result;
    }
}
