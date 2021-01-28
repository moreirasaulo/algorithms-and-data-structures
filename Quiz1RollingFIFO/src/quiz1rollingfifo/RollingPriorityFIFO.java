package quiz1rollingfifo;

public class RollingPriorityFIFO {

    private class Item {
        // add constructor of your choice

        public Item() {
        }

        Item next;
        boolean priority;
        String value;
    }

    private Item tail, head; // enqueue at tail, dequeue at head
    int itemsTotal, itemsCurrUsed;

    /* Parameter itemsTotal must be 5 or more, otherwise IllegalArgumentException
   * is thrown. Items are allocated and connected via next pointer only
   * once - here, in the constructor. After that they are re-used.
     */
    public RollingPriorityFIFO(int itemsTotal) {
        this.itemsTotal = itemsTotal;
        if (itemsTotal < 5) {
            throw new IllegalArgumentException("Error: it has to be 5 or more items");
        }
    }

    // Places value in the next available Item. If FIFO is full throws exception.
    public void enqueue(String value, boolean priority) throws FIFOFullException {

        if (itemsTotal == itemsCurrUsed) {
            throw new FIFOFullException();
        }
        Item item = new Item();
        item.value = value;
        item.priority = priority;

        if (size() == 0) {
            head = item;
            item.next = null;
            tail = item;
        } else {
            tail.next = item;
            tail = tail.next;
        }
        itemsCurrUsed++;
    }

    /* returns null if fifo is empty, if it is not empty then
   * priority=true items are sarched first
   * if none is found then non-priority item is returned
     */
    public String dequeue() {
        if (size() == 0) {
            return null;
        }

        Item item = head;
        Item previousItem = null;
        for (int i = 0; i < size(); i++) {
            if (item.priority == true) {
                if (item == head) {
                    head = head.next;
                    itemsCurrUsed--;
                    return item.value;
                }
                if (item == tail) {
                    tail = previousItem;
                    itemsCurrUsed--;
                    return item.value;
                }
                String value = item.value;
                item = item.next;
                item.next = tail.next;
                tail.next = null;
                itemsCurrUsed--;
                return value;
            }
            previousItem = item.next;
            item = item.next;
        }
        String value = head.value;
        head = head.next;
        itemsCurrUsed--;
        return value;
    }

    public int size() {
        return itemsCurrUsed;
    } // current FIFO size

    public int sizeMax() {
        return itemsTotal;
    } // maximum FIFO size

    // Returns array of Strings of all items in FIFO (following next references).
    public String[] toArray() {
        String[] array = new String[size()];
        Item item = head;
        for (int i = 0; i < size(); i++) {
            array[i] = item.value;
            item = item.next;
        }
        return array;
    }

    // Returns array of String only of priority items in FIFO.
    public String[] toArrayOnlyPriority() {
        String[] tempArray = new String[size()];
        Item item = head;
        int j=0;
        for(int i = 0; i < size(); i++)
        {
            if(item.priority == true)
            {
                tempArray[j] = item.value;
                j++;
            }
            item = item.next;
        }
        String[] array = new String[j];
        int n = 0;
        for(int i = 0; i < array.length; i++ )
        {
            array[n] = tempArray[i]; 
        }
        return array;
    }

    // Items with priority=true have "*" appended, e.g. "[Jerry*,Maria,Tom*];
    // Items with priority=true have "*" appended, e.g. "[Jerry*,Maria,Tom*];
    // Items about to be dequeue()'d are listed first, items recently enqueue()'d last
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Item item = head;
        int j =0;
         for (int i = 0; i < size(); i++) {
             if(item.value != null)
             {
                sb.append((j ==0)?"" : ",");
                sb.append(item.value);
                sb.append((item.priority == true) ? "*" : "");
                j++;
             }
             item = item.next;
         }
         sb.append("]");
         return sb.toString();
    }
}
