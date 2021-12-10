package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user = User.builder()
            .first_name("Oles")
            .education("UCU")
            .education("UCU bachelor")
            .last_name("Dobosevych")
            .age(20)
            .build();
    @Test
    void testToString() {
        assertEquals("User(first_name=Oles," +
                            " last_name=Dobosevych," +
                            " educations=[UCU, UCU bachelor]," +
                            " age=20," +
                            " weight=0, " +
                            "gender=null)",user.toString());
    }

    @Test
    void builder() {
        user.builder().weight(70).build();
        assertEquals("User(first_name=Oles," +
                " last_name=Dobosevych," +
                " educations=[UCU, UCU bachelor]," +
                " age=20," +
                " weight=70, " +
                "gender=null)",user.toString());
    }
}