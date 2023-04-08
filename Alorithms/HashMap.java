package org.Alorithms;

public class HashMap<K,V> {
    private final int capacity;
    private final Node<K,V>[] buckets;

    private static class Node<K,V>{
        K key;
        V value;
        Node<K, V> next;
        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    public HashMap(int capacity){
        this.capacity = capacity;
        this.buckets = new Node[capacity];

    }
    public void put(K key, V value){
        int bucketIndex = key.hashCode() % capacity;
        Node<K,V> node = buckets[bucketIndex];
        while (node != null){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
            node = node.next;
        }

    }
    public V get(K key){
        int bucketIndex = key.hashCode() % capacity;
        Node<K, V> node = buckets[bucketIndex];
        while(node != null){
            if(node.key.equals(key)){
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
    public void remove (K key){
        int bucketIndex = key.hashCode() % capacity;
        Node<K, V> node = buckets[bucketIndex];
        Node<K, V> prev = null;
        while( node != null){
            if (node.key.equals(key)){
                buckets[bucketIndex] = node.next;
            }
            else{
                prev.next = node.next;
            }
            return;
        }
        prev = node;
        node = node.next;
    }
}
