import java.util.Scanner;
public class workerArrayClass {
    String name;
    String id;
    double salary;

    public workerArrayClass(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public static void main(String[] args) {
        workerArrayClass[] workers = new workerArrayClass[100];
        for (int i = 0; i <= 100; i++) {
            System.out.println("Enter q to quite or c to continue");
            Scanner input = new Scanner(System.in);
            String c = input.nextLine();
            if (!c.equals("q") && !c.equals("c")) {
                System.out.println("Enter info for employee :" + i + 1);
                input = new Scanner(System.in);
                workers[i] = new workerArrayClass(input.nextLine(), input.nextLine(), input.nextDouble());
            }
        }
    }

    }
