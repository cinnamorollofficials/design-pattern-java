public class User implements  Prototype {
    private String name;
    private int age;
    private String role;

    public User(String name, int age, String role){
        this.name = name;
        this.age = age;
        this.role = role;
    }

    @Override
    public Prototype clone(){
        return new User(this.name, this.age, this.role);
    }

    @Override
    public String toString(){
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';    
    }

}