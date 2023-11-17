package LinkedLists;
/* Given a singly linked list, a position and an element, 
the task is to write a program to insert that element in a 
linked list at a given position. 
Input: 3->5->8->10, data = 2, position = 2
Output: 3->2->5->8->10

Input: 3->5->8->10, data = 11, position = 5
Output: 3->5->8->10->11 

Constraints:
1<= t <=10^2
0 <= N <= 10^5
pos >= 0
Time Limit: 1sec

Following is the Node class already written for the Linked List

	
*/ 
class Node<T> {

	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}
public class InsertNodeAtGivenPosition {

    //Iterative Approach
    public static Node<Integer> insertNodeIterative(Node<Integer> head,int position, int data){
        Node<Integer> nodeToBeInserted = new Node<Integer>(data);
        if(position == 0){
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        }
        int count =0;
        Node<Integer> prev = head;
        while (count < position -1 && prev != null ) {
            prev = prev.next;
            count++;
        }
        if(prev != null ){
            nodeToBeInserted.next = prev.next;
            prev.next = nodeToBeInserted;
        }
        return head;
    } 

    //Recursive Approach
    private static Node<Integer> insertNodeRecursive(Node<Integer> head,int position, int data){
        if(head == null){
            return head;
        }
        if(position == 0){
            Node<Integer> nodeToBeInserted = new Node<Integer>(data);
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        }else{
            head.next = insertNodeRecursive(head.next, position-1, data);
            return head;
        }
    }

}