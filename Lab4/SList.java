package Lab4;


public class SList<T> {

	int size;
	Node<T> first;
	Node<T> last;

	SList() {
		size = 0;
		first = null;
		last = null;
	}

	void addFirst(T element) {
		Node<T> newNode = new Node<T>(element);
		newNode.next = first;
		first = newNode;
		size++;
		if (last == null)
			last = first;
	}

	void addLast(T element) {
		// Ex.1 complete the method

        Node<T> newNode = new Node<T>(element);

        if (size == 0){
            first = newNode;
            last = null;
            size++;
        }
        else {
            last.next = newNode;
            last = newNode;
            size++;
        }

	}

	void addAtIndex(int index, T element) {
		// Ex.2 complete the method

        Node<T> newNode = new Node<T>(element);

        if (index == 0) {
            newNode.next = first;
            first = newNode;
            size++;
        }
        else if (index >= size) {
            last.next = newNode;
            last = newNode;
            size++;
        }
        else {
            Node<T> temp = first;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
			newNode.next = temp.next;
			temp.next = newNode;
            size++;
        }
	}

	T removeFirst() {
		if (size == 0)
			return null;
		else {
			Node<T> tmp = first;
			first = first.next;
			size--;
			if (first == null)
				last = null;
			return tmp.element;
		}

	}

	T removeLast() {
		// Ex.3 complete the method
        if (size == 0){
            return null;
        }
        else if (size == 1) {
            Node<T> temp = first;
            first = null;
            last = null;
            return temp.element;
        }
        else {
            Node<T> temp = first;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            last = temp;
			Node<T> originalLast = temp.next;
            temp.next = null;
			size--;
            return originalLast.element;

        }
		
	}

	T removeAtIndex(int index) {
		// Ex.4 complete the method
        if (size == 0) {
            return null;
        }
		else {
			Node<T> temp = first;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			Node<T> remove = temp.next;
			temp.next = remove.next;
			remove.next = null;
			size--;
            return remove.element;
            
        }
	}

	int search(T item) {
		// Ex.5 complete the method
		Node<T> temp = first;
		int i = 0;
		while (i < size) {
			if (temp.element == item) {
				return i;
			}
			else {
				temp = temp.next;
				i++;
			}
		}
		return (-1);

	}

	boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	int getSize() {
		return size;
	}

	void printHorizontal() {
		Node<T> walker = first;
		for (int i = 0; i < size; i++) {
			System.out.print(walker.element);
			System.out.print(" ");
			walker = walker.next;
		}
		System.out.println("\n-----");
	}
}