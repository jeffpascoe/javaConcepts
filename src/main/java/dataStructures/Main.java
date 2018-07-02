package dataStructures;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        HashableObject hashObj = new HashableObject("Jeff", 10);
        HashableObject hashObj2 = new HashableObject("Jane", 10);
        HashableObject hashObj3 = new HashableObject("Joel", 10);
        hashTable.retrieveItem(1);
    }

}
