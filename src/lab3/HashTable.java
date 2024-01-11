package lab3;

import java.util.LinkedList;
import java.util.Objects;

class HashTable <K, V> {
    private final LinkedList<Entry<K, V>>[] table;
    private int size;
    public HashTable() {
        table = new LinkedList[256];
        size = 0;
    }

    private static class Entry<K,V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public void put (K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry <K,V> entry : table[index]) {
            if (entry.key.equals(key)){
                entry.setValue(value);
                return;
            }
        }
        table[index].addLast(new Entry<>(key, value));
        size++;
    }

    public V get (K key) {
        int index = hash(key);
        if (table[index] != null) {
            LinkedList<Entry<K, V>> list = table[index];
            for (Entry<K, V> value : list) {
                if (Objects.equals(value.key, key)) {
                    return value.value;
                }
            }
        }
        return null;
    }

    public void remove (K key) {
        int index = hash(key);
        if (table[index] != null) {
            LinkedList<Entry<K, V>> values = table[index];
            for (Entry<K, V> value : values) {
                if (value.getKey().equals(key)) {
                    values.remove(value);
                    size--;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int hash(K key) {
        return key.hashCode() % table.length;
    }

    @Override
    public String toString() {
        String res = "";
        for (LinkedList<Entry<K, V>> list : table) {
            if (list != null && !list.isEmpty()) {
                for (Entry<K, V> entry : list) {
                    res += ("Key: " + entry.getKey() + ", Value: " + entry.getValue() + '\n');
                }
            }
        }
        return res;
    }
}
