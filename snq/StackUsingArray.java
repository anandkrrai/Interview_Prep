package snq;

import java.util.*;

class StackUsingArray {

	static class MyStack {
		int top;
		int arr[] = new int[1000];

		MyStack() {
			top = -1;
		}

		/*
		 * The method push to push element into the stack
		 */
		void push(int a) {
			top++;
			arr[top] = a;
		}

		/*
		 * The method pop which return the element poped out of the stack
		 */
		int pop() {
			if (top != -1) {
				int rv = arr[top];
				top--;
				return rv;
			} else {
				return -1;
			}
		}
	}

	// Dont make changes here
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		MyStack obj = new MyStack();
		int Q = sc.nextInt();
		while (Q > 0) {
			int QueryType = 0;
			QueryType = sc.nextInt();
			if (QueryType == 1) {
				int a = sc.nextInt();

				obj.push(a);

			} else if (QueryType == 2) {
				System.out.print(obj.pop() + " ");
			}
			Q--;
		}
	}

}