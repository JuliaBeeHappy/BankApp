public class BankAppMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1, "10.01.1977");
        Accountant accountant1 = new Accountant("Mary Jones", 2, "07.08.2000");
        Clerk clerk1 = new Clerk("Ivan Petrov", 3, "05.08.1999");

        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(clerk1.toString());

        manager.fireEmployee("Ivan Petrov");
        accountant1.createReport();
        clerk1.makeCall("Petr Ivanov");

        accountant1.setName("Mary Petrov");
        System.out.println(accountant1.toString());

    }
}
