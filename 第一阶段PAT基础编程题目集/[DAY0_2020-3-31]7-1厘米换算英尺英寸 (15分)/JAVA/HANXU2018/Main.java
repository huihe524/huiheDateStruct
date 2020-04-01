import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("测试出现冲突解决");
        Scanner in = new Scanner(System.in);
        System.out.println("尝试改变代码");
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}