
package com.mycompany.lab10_csc229;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;
   private int size;
    
   public DoublyLinkedList() {
      head = null;
      tail = null;
      size = 0;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      size++;
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
      size++;
   }
   
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
      size++;
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
      size--;
   }
   public int size(){

       return size;
   }
   public void PrintRevList(){
      Node node = tail;
      while (node != null) {
         
         System.out.print(node.data + " ");
          node = node.previous;
      }
      System.out.println();
   }
   public int max(){
      Node node = head.next;
      int max = head.data;
      while (node != null) { 
         if(max < node.data){
             max = node.data;
         }
         node = node.next;
      }
      return max;
   }
   public int min(){
      Node node = head.next;
      int min = head.data;
      while (node != null) { 
         if(min > node.data){
             min = node.data;
         }
         node = node.next;
      }
      return min;
   }
   
   public int[] toArray(){
       Node node = head;
       int[] array = new int[size];
       int i =0 ;
       while(node != null){
           array[i++] = node.data;
           node = node.next;
       }
       return array;
   }
   
   public int indexOf(int x){
       Node node = head;
       int i =0 ;
       while(node != null){
           if(x == node.data)
               return i;
           node = node.next;
           i++;
       }
       return -1;
   }
   public int sumLast(int m){
       Node node = tail;
       int sum = 0;
       for(int i=0;i<m;i++){
           sum+=node.data;
           node = node.previous;
       }
       return sum;
   }
}
