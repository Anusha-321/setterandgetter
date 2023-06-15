package setterandgetter;

public class SetterAndGetterDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setFullName("annn");
        employee.setEmployeeId(200);
        System.out.println("Name::"+ employee.toString());
    }
}
