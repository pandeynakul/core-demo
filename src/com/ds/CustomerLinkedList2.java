package com.ds;

//head->1->2->3->4->null
public class CustomerLinkedList2 {

    Node head;

    static class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

    //add the node to list
    //input will list and data
    public CustomerLinkedList2 insertData(CustomerLinkedList2 list, int data) {


        Node newNode = new Node(data);
        //creating the list so add to the list bro
        if (list.head == null) {
            //add the node
          list.head=newNode;
        }
        else{
            //data alrey there addd to the last
            Node last=list.head;

            while(last.next!=null){
                //add it to the next
               last=last.next;

            }
            last.next=newNode;

        }

        return list;

    }

    //print the data from the node
     public void  printList(CustomerLinkedList2 list){

        while(list.head!=null){
            System.out.println(list.head.data);
            list.head=list.head.next;
        }

      }

    public static void main(String[] args) {

        CustomerLinkedList2  linkedList2=new CustomerLinkedList2();
        linkedList2.insertData(linkedList2,1);
        linkedList2.insertData(linkedList2,2);
        linkedList2.insertData(linkedList2,3);
        linkedList2.insertData(linkedList2,4);

        linkedList2.printList(linkedList2);
    }

}
