public class ElectricBillMain {
    public static void main(String[] args) {

        ElectricBill myBill = new ElectricBill();
        myBill.setName();
        System.out.println(myBill.getName("Sibel"));
        myBill.setMemberId();
        System.out.println(myBill.getMemberId(12));

        ElectricBill myBill2 = new ElectricBill(1233, 0, "sibel", 0.0);
        myBill2.displayMemberInfo();


    }
}
