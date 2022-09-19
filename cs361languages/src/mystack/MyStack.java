/**
 * 
 */
package mystack;

/**
 * @author Xiaofeng Leng
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T n = theStack.val;
		theStack=theStack.next;
		return n;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode(v,theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(5);
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack pstack = new MyStack();
		pstack.push("Xiaofeng Leng");
		pstack.push("cscharff");
		
	}

}
