package builder;


public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .first_name("Oles")
                .age(10)
                .education("UCU")
                .education("UCU bachelor")
                .last_name("Dobosevych")
                .build();
        System.out.println();
        user.builder().education("sdfsfd").build();

    }
}
