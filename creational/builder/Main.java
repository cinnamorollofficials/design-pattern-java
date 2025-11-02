public  class Main {
    public static void main(String[] args) {
        User user = new User.Builder("Hadi", "hadi@mail.com")
                        .age(25)
                        .phone("09876544567")
                        .jobTitle("IT")
                        .active(true)
                        .build();

        System.out.println("User created: " + user.getName());
    }
}