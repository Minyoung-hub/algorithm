package aug25;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt(); sc.nextLine();
		for (int i = 0; i < repeat; i++) {
			String input = sc.next();
			String res = "YES";
			Stack<Integer> st1 = new Stack<Integer>();
			Stack<Integer> st2 = new Stack<Integer>();
			Stack<Integer> st3 = new Stack<Integer>();
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == '(') {
					st1.push(1);
				} else if (input.charAt(j) == ')') {
					if (st1.isEmpty()) {
						res = "NO";
						break;
					} else
						st1.pop();
				}
				if (input.charAt(j) == '<') {
					st2.push(1);
				} else if (input.charAt(j) == '>') {
					if (st2.isEmpty()) {
						res = "NO";
						break;
					} else
						st2.pop();
				}
				if (input.charAt(j) == '{') {
					st3.push(1);
				} else if (input.charAt(j) == '}') {
					if (st3.isEmpty()) {
						res = "NO";
						break;
					} else
						st3.pop();
				}
			}
			if (!st1.isEmpty() || !st2.isEmpty() || !st3.isEmpty()) {
				res = "NO";
			}
			System.out.println(res);
		}
		sc.close();
	}
}