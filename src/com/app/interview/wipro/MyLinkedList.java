package com.app.interview.wipro;

//making the custome linked list
public class MyLinkedList {
    Node head = null;

    static class Node {
        Node next;
        int data;

        //make the constructor
        //if node ==null then assign the element or move to the next
        Node(int data) {

            this.data = data;
            next = null;
        }

    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //insert the node
        insertTheNode(myLinkedList, 1);
        insertTheNode(myLinkedList, 2);
        insertTheNode(myLinkedList, 3);
        insertTheNode(myLinkedList, 4);
        //print the node
        printTheNode(myLinkedList);
    }

    public static MyLinkedList insertTheNode(MyLinkedList list, int data) {
        //
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            //iterate the list attached to last !!
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        return list;

    }

    //print the node -Algorithm
    public static void printTheNode(MyLinkedList list) {
        Node currentNode=list.head;
        System.out.println("linked list ::");
        while (currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }

    }

}
