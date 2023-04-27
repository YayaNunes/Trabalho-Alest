
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
    private int count;
    private Node current; 

   
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

    public void addcurrent(Integer element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
            current = n;
        } else {
            tail.next = n;
            current = n;
        }
        tail = n;
        current =n;
        count++;
    }

    public void addcurrent(int index, Integer element) { 
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException(); 

        Node n = new Node(element);
        count++;

        if (index == 0) { 
            if (head == null) { 
                tail = n;
                current = n;
            } else {
                n.next = head;
            }
            head = n;
            current = n;

        } else if (index == count) { 
            tail.next = n;
            tail = n;
            current = n;
             } else { 
            Node ant = head;
            for (int i = 0; i < index - 1; i++){
                ant = ant.next;
                NumAuxNext++;
            }
            n.next = ant.next;
            ant.next = n;
            current = n;

        }
    }

    public int getNumAuxNext() {
        return NumAuxNext;
    }

    public Integer getcurrent(int index) { // O(n)
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == count - 1){//index igual ao tamanho -1(ou seja index vai para a tail)
            current = tail;
            return tail.element;}

        Node aux = head;
        int c = 0;
        while (c < index) {
            aux = aux.next;
            NumAuxNext++;
            c++;
            current = aux;
        }
        return (aux.element);
    }

    public Integer removeByIndexcuent(int index) {
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
            current = aux;
            aux = aux.next;
            NumAuxNext++;

        }
        if (aux == tail) { 
            tail = ant;
            tail.next = null;
        } else { 
            ant.next = aux.next;
            NumAuxNext++;
            current = aux.next;
            NumAuxNext++;

        }
        count--;
        return aux.element;
    }

   
}
