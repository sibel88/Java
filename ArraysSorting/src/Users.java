public class Users {
    private String name;
    private String email;
    private String adress;

    Users(String name, String email, String adress) {
        this.name = name;
        this.email = email;
        this.adress = adress;
    }

    public void setName(String name) {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        System.out.println(email);
    }

    public String getEmail() {
        return email;
    }

    public void setAdress(String adress) {
        System.out.println(adress);
    }

    public String getAdress() {
        return adress;
    }
}
