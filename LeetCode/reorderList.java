input: 1 -> 2 -> 3 -> 4 -> 5 -> 6

output: 1 -> 6 -> 2 -> 5 -> 3 -> 4 -> 4

Node reorderList(Node head){
	Node slow = head;
	Node fast = head;

	while(fast != null && fast.next != null){
		slow = slow.next;
		fast = fast.next.next;
	}
	Stack<Node> stack = new Stack<Node>();
	while(slow != null){
		stack.push(slow);
		slow = slow.next;
	}
	Node middleNext = slow.next;
	slow = head;

	while(!(stack.isEmpty()){
		Node temp = slow.next;
		slow.next = stack.pop();
		slow.next.next = temp;
		slow = temp;
	}
	if (slow == middleNext){		// Even
		slow = null;
	}
	else{						// Odd
		slow.next = null;  
	}

	return head;
}

