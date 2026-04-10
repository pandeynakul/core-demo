package com.ds;


import lombok.Data;

import java.util.concurrent.ExecutionException;

public class CustomQueueCreation {


    public int length;
    public Node rear;
    public Node front;
    //required front(remove from the front ) and rear FIFO
    @Data
    static class Node {

        Node nextNode;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public CustomQueueCreation() {
        length = 0;
        rear = null;//end
        front = null;//start
    }

    //enqueue operation

    public void enqueueOperation(int data) {
        //set the data to the Node
        Node node = new Node(data);

        //if front is empty then add the data

        if (isEmpty()) {
            front = node;
        }
        //else add to rear
        else {
            rear.setNextNode(node);
        }
        rear = node;
        // System.out.println(front.getData());
        // System.out.println(rear.getData());
        length++;
    }

    //dequeue operation poll it from the from FIFI

    public int dequeueOperation() throws Exception {
        if (isEmpty()) {
            throw new Exception("element are not present ");
        }
        int data = front.getData();
        front = front.getNextNode();
        length--;
        //touched the last node then make rear =null
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    //firstElement
    public int firstElemnt() throws Exception {
        if (isEmpty()) {
            throw new Exception("No elements are present in the Queue");
        }
        return front.getData();
    }

    //isEmpty()
    public boolean isEmpty() {
        return length == 0;
    }

    //size()
    public int size() {
        return length;
    }




    public static void main(String[] args) throws Exception {
        CustomQueueCreation customQueueCreation = new CustomQueueCreation();

        customQueueCreation.enqueueOperation(10);
        customQueueCreation.enqueueOperation(20);
        customQueueCreation.enqueueOperation(30);

        System.out.println(customQueueCreation.dequeueOperation());
        System.out.println(customQueueCreation.dequeueOperation());
       // System.out.println(customQueueCreation.dequeueOperation());
       // System.out.println(customQueueCreation.dequeueOperation());
        System.out.println("first Element :: "+customQueueCreation.firstElemnt());

    }

}
