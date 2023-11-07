package Lab7;

class Node<T> {
	/**
	 * The data element stored in the node.
	 */
	T element;

	/**
	 * Reference to the next node in the linked list.
	 */
	Node<T> next;

	/**
	 * Constructs a new node with the specified data element.
	 *
	 * @param element The data element to store in the node.
	 */
	Node(T element) {
		this.element = element;
		next = null;
	}

}