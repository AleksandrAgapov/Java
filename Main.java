

public class Main {
    public static void main(String[] args) {

Employee emp = new Employee();

emp.add("123456", "Иванов");
emp.add("321456", "Васильев");
emp.add("234561", "Петрова");
emp.add("234432", "Иванов");
emp.add("654321", "Петрова");
emp.add("345678", "Иванов");

System.out.println(emp);

System.out.println(emp.findByName("Иванов"));

System.out.println(emp.remove("123456"));

System.out.println(emp.toString());
System.out.println(emp);

}
}