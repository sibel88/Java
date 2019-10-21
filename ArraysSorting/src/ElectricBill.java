public class ElectricBill {
    private int memberId;
    private int counter;
    private String name;
    private double billAmount;

    public ElectricBill() {

    }

    public ElectricBill(int memberId, int counter, String name, double billAmount) {
        this.memberId = memberId;
        this.counter = counter;
        this.name = name;
        this.billAmount = billAmount;
    }

    public void setMemberId() {
        this.memberId = memberId;
    }

    public int getMemberId(int memberId) {
        return memberId;
    }

    public void setCounter() {
        this.counter = counter;
    }

    public int getCounter(int counter) {
        return counter;
    }

    public void setName() {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setBillAmount() {
        this.billAmount = billAmount;
    }

    public double getBillAmount(double billAmount) {
        return billAmount;
    }

    public void displayMemberInfo() {
        System.out.println(this.memberId);
        System.out.println(this.counter);
        System.out.println(this.name);
        System.out.println(this.billAmount);
    }

}
