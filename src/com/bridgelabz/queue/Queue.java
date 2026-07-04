package com.bridgelabz.queue;

//Creating a node
class Node{
    int data;
    Node next;

    //Constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

//Queue class
public class Queue {
    //Creating front and rear nodes as instances
    Node front;
    Node rear;

    //Constructor
    public Queue(){
        this.rear = null;
        this.front = null;
    }

    //Enqueue method to append the data into the queue
    public  void enqueue(int element){
        Node temp = new Node(element);
        if(rear == null){
            rear = front = temp;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
    }

    //Dequeue method to remove element from first
    public void dequeue(){
        if(front == null){
            return;
        }
        else if(front.next == null){
            front = rear = null;
        }
        else{
            front = front.next;
        }
    }

    //Display method to print the queue
    public void display(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            Node curr = front;
            while(curr.next != null){
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.println(curr.data);
        }
    }

    //Main method
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();
    }

}
