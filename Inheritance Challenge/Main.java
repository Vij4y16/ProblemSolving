public class Main {
    public static void main(String[] args) {


        Employee vijay = new Employee("vijay", "16/09/2000"
                , "01/01/2022");

        System.out.println(vijay);
        System.out.println("Age = " + vijay.getAge());
        System.out.println("pay = " + vijay.collectPay());

        SalariedEmployee  mai = new SalariedEmployee("Mai","12/10/2001",
                "01/01/2022",35000);
        System.out.println(mai);
        System.out.println("Mai's Paycheck = Rs" + mai.collectPay());
        mai.retire();
        System.out.println("Mai's Pension check = Rs " + mai.collectPay());
    }
}
