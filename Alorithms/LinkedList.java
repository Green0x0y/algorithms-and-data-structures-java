package org.Alorithms;

public class LinkedList {
    private static Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            else{
                Node current = head;
                while (current.next != null){
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        public void remove(int data){
            if(head == null){
                return;
            }
            if(head.data == data){
                head = head.next;
                return;
            }
            Node current = head;
            while(current.next != null){
                if(current.next.data == data){
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }

        }
        public void printList(){
            Node current = head;
            while(current != null){
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void reverse(){
            Node prev = null;
            Node current = head;
            Node next = null;

            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }
}
