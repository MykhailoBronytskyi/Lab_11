package atm;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    ATM atm = new ATM();

    @Test
    void process() {
        assertEquals("You can use at max 1 bills of value 5\n" +
                "You can use at max 0 bills of value 10\n" +
                "You can use at max 6 bills of value 20\n", atm.process(125));
    }
    @Test
    void process_error() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            atm.process(126);
        });
    }

}