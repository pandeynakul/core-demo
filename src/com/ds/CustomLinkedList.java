package com.ds;

public class CustomLinkedList {


    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    //insert/create the list
    public static  CustomLinkedList createTheLinkedList(CustomLinkedList list, int data) {

        Node newNode = new Node(data);

        //add the data to list if its null
        if (list.head == null) {
            //add the data
            list.head = newNode;
        } else {
            //if already data is there then perform add it next
            Node last = list.head;

            while (last.next != null) {
                last = last.next;

            }
            last.next = newNode;

        }

        return list;

    }

    //print the element of CustomLinkedList


    public static void printTheElemnt(CustomLinkedList list) {

        Node currentNode = list.head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }

    }

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();

        createTheLinkedList(customLinkedList,1);
        createTheLinkedList(customLinkedList,2);
        createTheLinkedList(customLinkedList,3);
        createTheLinkedList(customLinkedList,4);

        printTheElemnt(customLinkedList);

    }
}
