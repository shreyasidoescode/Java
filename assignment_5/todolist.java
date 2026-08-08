import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        System.out.print("Enter the number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Task " + (i + 1) + ": ");
            tasks.add(sc.nextLine());
        }
        StringBuffer sb = new StringBuffer();
        sb.append("\n----- TO-DO LIST -----\n");
        for (int i = 0; i < tasks.size(); i++) {
            sb.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}