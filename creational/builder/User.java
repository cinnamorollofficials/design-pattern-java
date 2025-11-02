public class User {
    private String name;
    private String email;
    private Integer age;
    private String phone;
    private String address;
    private String jobTitle;
    private boolean active;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.jobTitle = builder.jobTitle;
        this.active = builder.active;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

// .... other getter

    

    public static class Builder {
        private String name;
        private String email;

        private Integer age;
        private String phone;
        private String address;
        private String jobTitle;
        private boolean active;

        public Builder(String name, String email){
            this.name = name;
            this.email = email;
        }

        public Builder age(Integer age){
            this.age = age;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder jobTitle(String jobTitle){
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder active(boolean active){
            this.active = active;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}