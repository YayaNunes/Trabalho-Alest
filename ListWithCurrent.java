
public class ListWithCurrent {
    // Classe interna Node
    int NumAuxNext;

    private class Node {
        public Integer element;
        public Node next;

        public Node(Integer element) {
            this.element = element;
            next = null;
        }

        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private Node current;
    private int count;

   
    public ListWithCurrent() {
        head = null;
        tail = null;
        count = 0;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        return count;
    }

    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    public void add(Integer element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        count++;
    }

    public void add(int index, Integer element) { 
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException(); 

        Node n = new Node(element);
        count++;

        if (index == 0) { 
            if (head == null) { 
                tail = n;
            } else {
                n.next = head;
            }
            head = n;
            
        } else if (index == count) { 
            tail.next = n;
            tail = n;
        } else { 
            Node ant = head;
            for (int i = 0; i < index - 1; i++)
                ant = ant.next;
            n.next = ant.next;
            ant.next = n;
        }
    }


    public int getNumAuxNext() {
        return NumAuxNext;
    }

    public Integer get(int index) { // O(n)
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == count - 1)
            return tail.element;

        Node aux = head;
        int c = 0;
        while (c < index) {
            aux = aux.next;
            NumAuxNext++;

            c++;
        }
        return (aux.element);
    }

    public Integer removeByIndex(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException(); 
        if (index == 0) {
            Integer elem = head.element;
            head = head.next;
            if (count == 1) 
                tail = null;
            count--; 
            return elem;
        }
        Node aux = head;
        Node ant = null;
        for (int i = 0; i < index; i++) {
            ant = aux;
            aux = aux.next;
            NumAuxNext++;

        }
        if (aux == tail) { 
            tail = ant;
            tail.next = null;
        } else { 
            ant.next = aux.next;
            NumAuxNext++;

        }
        count--;
        return aux.element;
    }

   
}
