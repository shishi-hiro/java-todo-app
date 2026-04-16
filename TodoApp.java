import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String task;

        System.out.print("タスクを入力してください：");
        task = scanner.nextLine();

        System.out.println("あなたのタスクは：" + task);

        scanner.close();
    }
}