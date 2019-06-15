package snq;

import java.util.*;

class StackUsingQueues {
	static Queue<Integer> curr = new LinkedList<Integer>();
	static Queue<Integer> next = new LinkedList<Integer>();

	/* The method pop which return the element poped out of the stack */
	static int pop() {
		if (curr.size() > 0) {
			return curr.remove();
		} else {
			return -1;
		}
	}

	/* The method push to push element into the stack */
	static void push(int a) {
		next.add(a);
		while (curr.size() > 0) {
			next.add(curr.remove());
		}
		Queue<Integer> temp = curr;
		curr = next;
		next = temp;

	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if (q == 1) {
				int val = sc.nextInt();
				push(val);
			} else if (q == 2) {
				System.out.println(pop());
			}
		}
	}
}