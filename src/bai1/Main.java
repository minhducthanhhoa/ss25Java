package bai1;

public class Main {
    public static void main(String[] args) {
        Account acc1 = Account.getInstance();
        acc1.setId(1);
        acc1.setName("John Doe");
        acc1.setAge(30);

        Account acc2 = Account.getInstance();
        acc2.setId(2);
        acc2.setName("Alice");
        acc2.setAge(25);

        System.out.println("acc1 hashCode: " + acc1.hashCode());
        System.out.println("acc2 hashCode: " + acc2.hashCode());

        acc1.display();
        acc2.display();
    }
}
