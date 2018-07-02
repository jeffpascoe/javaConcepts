package dataStructures;

import java.util.ArrayList;

public class HashTable {
    ArrayList<ArrayList<HashableObject>> associativeArray;

    public HashTable() {
        this.associativeArray = new ArrayList<>();
        this.associativeArray.add(new ArrayList<>());
        this.associativeArray.add(new ArrayList<>());
    }

    public int addItem(HashableObject hashObj) {
        int key = hashObj.hashCode() % associativeArray.size();
        if(associativeArray.size() <= key) {
            int startIndex = associativeArray.size();
            while(startIndex <= key) {
                associativeArray.add(new ArrayList<>());
                startIndex++;
            }
        }

        associativeArray.get(key).add(hashObj);
        return key;
    }

    public HashableObject retrieveItem(int index) {
        return associativeArray.get(index).get(0);
    }

}
