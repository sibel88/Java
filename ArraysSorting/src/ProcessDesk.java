public class ProcessDesk {
    private Admin admin;
    private Mail mail;

    public void desk(Desk desk) {
        desk.toString();
        System.out.println("your orders sucsessfuly");
        admin = new Admin();
        admin.setName("sibelgulerfl@gmai.com");
        admin.setName("sibel");
        admin.setLastName("Tas");
        mail = new Mail();
        mail.deskemail(admin);

    }
}
