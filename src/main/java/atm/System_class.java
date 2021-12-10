package atm;

import java.util.ArrayList;

public class System_class {
    public ArrayList getBill(int what_bill){
        ArrayList<Bill> arr = new ArrayList<Bill>();
        if (what_bill>50){
            arr.add(new Bill_20());
            return arr;
        }else if (what_bill>10){
            arr.add(new Bill_10());
            return arr;
        }else{
            arr.add(new Bill_5());
            return arr;
        }
    }
}
