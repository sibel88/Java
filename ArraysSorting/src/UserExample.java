public class UserExample {
    private String name;
    private String lastName;
    private int age;
    private String adress;
    private String email;

    public UserExample() {
        this.name = "Asude";
        this.lastName = "Tas";
        this.age = 4;
        this.adress = "Orlando";
        this.email = "asude@gmail.com";
    }

    public UserExample(String name, String lastName, int age, String adress, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setEmai(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
