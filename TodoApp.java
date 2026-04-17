import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 複数のタスクを保存するリスト
        ArrayList<String> tasks = new ArrayList<>();

        // タスクを2回入力
        for (int i = 0; i < 2; i++) {
            System.out.print("タスクを入力してください：");
            String task = scanner.nextLine();
            tasks.add(task);
        }

        // 一覧表示
        System.out.println("\nタスク一覧：");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }

        scanner.close();
    }
}