package bank;

public class Account {

    private long balance = 3000;

    public boolean check(long value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        return value < balance;
    }

    public void withdraw(String name, long value) {
        System.out.println(name + " withdraw " + value);

        synchronized (this) {
            if (check(value)) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                balance -= value;
                System.out.println(name + " successful");
            } else {
                System.out.println("Error!!");
            }
        }

        System.out.println(name + " " + balance);
    }
}
