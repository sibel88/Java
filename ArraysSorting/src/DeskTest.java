public class DeskTest {
    public static void main(String[] args) {
        Desk officeDesk = new Desk();
        officeDesk.setColor("black");
        officeDesk.setPrice(12.99);
        officeDesk.setQuantity(15);
        System.out.println(officeDesk.toString());

        ProcessDesk process = new ProcessDesk();
        process.desk(officeDesk);
    }
}
