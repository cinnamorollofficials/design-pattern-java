public class Main {
    public static void main(String[] args) {
        User adminTemplate = new User("Admin", 25, "ADMIN");

        User admin1 = (User) adminTemplate.clone();
        User admin2 = (User) adminTemplate.clone();

        System.out.println(admin1);
        System.out.println(admin2);
    }
}