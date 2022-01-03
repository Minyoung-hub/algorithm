package aug25;

import java.util.Scanner;
import java.util.Stack;

public class Q10820 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(); sc.nextLine();

		for(int i = 0; i < cnt; i++) {
			String input = sc.next(); sc.nextLine();
			if (input.contains("push")) {
				int input2 = sc.nextInt(); sc.nextLine();
				stack.push(input2);
			} else if (input.equals("pop")) {
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
			} else if (input.equals("size")) {
				System.out.println(stack.size());
			} else if (input.equals("empty")) {
				System.out.println(stack.isEmpty() ? 1 : 0);
			} else if (input.equals("top")) {
				System.out.println(stack.isEmpty() ? -1 : stack.peek());
			}
		}
		sc.close();
	}
}