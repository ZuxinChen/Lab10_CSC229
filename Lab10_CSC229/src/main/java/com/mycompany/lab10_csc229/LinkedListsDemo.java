/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab10_csc229;

/**
 *
 * @author user
 */
/*
    Using double linked list, modify the code to add the following three methods:

    1- toArray

    2- indexOf(object)

    3- the sum of the last m elements of list n. 
*/
public class LinkedListsDemo {

    public static void main(String[] args) {
        DoublyLinkedList numList = new DoublyLinkedList();
        Node nodeA = new Node(14);
        Node nodeB = new Node(2);
        Node nodeC = new Node(20);
        Node nodeD = new Node(31);
        Node nodeE = new Node(16);
        Node nodeF = new Node(55);

        numList.append(nodeA);  
        numList.append(nodeB);   
        numList.append(nodeC);   
        numList.append(nodeD);  
        numList.append(nodeE);   
        numList.append(nodeF); 

        // Output list
        System.out.print("List after adding nodes: ");
        numList.printList();
        
        //1. list to array 
        int[] array = numList.toArray();
        System.out.print("list to array: ");
        for(int n:array){
            System.out.print(n+" ");
        }
        
        //2. find index of element
        int num = 14;
        System.out.println("\nindex of "+num+": "+numList.indexOf(num));
        
        //3.sum of last m elements
        int m = 2;
        System.out.println("Sum of last "+m+" elements: "+numList.sumLast(m));
    }
}
/* Output:
    List after adding nodes: 14 2 20 31 16 55 
    list to array: 14 2 20 31 16 55 
    index of 14: 0
    Sum of last 2 elements: 71
*/
