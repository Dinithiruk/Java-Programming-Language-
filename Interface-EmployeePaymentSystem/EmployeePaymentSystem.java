package Interface;

public class EmployeePaymentSystem {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("112121", "Widget", 20, 21.50);
        Employee employee = new Employee(0012345, "Peter Davidson", 40000.0, 7.0f, 30.0);

        //calling the getPaymentAmount method
        double invoicePayment = invoice.getPaymentAmount();
        double employeePayment = employee.getPaymentAmount();

        System.out.println("Invoice Payement : Rs "+ invoicePayment);
        System.out.println("Employee Payement : Rs "+ employeePayment);

    }
}
