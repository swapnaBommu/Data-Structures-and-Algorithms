/* You have been given a linked list of integers. Your task is to write a function
that deletes a node from the given position. 

Note:
1. Assume that the indexing for the linked lists always starts from 0.
2. If the position is greater than or equal to the length of linked list, you should
return the same linked list without any change.

Examples:
1)
Input: 3->4->5->2->6->1->9, position = 3
Output: 3->4->5->6->1->9
2)
Input: 3->4->5->2->6->1->9, position = 0
Output: 4->5->2->6->1->9 

Constraints:
0 <= N <= 10^5
pos >= 0
Time Limit: 1sec

Expected Complexity:
Time Complexity: O(N)
Space Complexity: O(1)

Following is the Node class already written for the Linked List

*/ 
package LinkedLists;
class Node<T> {

	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}
public class DeleteNode {
     //Iterative Approach
     public static Node<Integer> deleteNodeIterative(Node<Integer> head,int position){
        if(head == null){
            return head;
        }
        if(position == 0){  
            return head.next;
        }
        int length = 0;
        Node<Integer> temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        if(position >= length){
            return head;
        }
        int count =0;
        Node<Integer> prev = head;
        while (count < position -1 && prev != null ) {
            prev = prev.next;
            count++;
        }
        if(prev == null || prev.next == null ){
            return head;
        }
        prev.next = prev.next.next;
        return head;
    } 

    //Recursive Approach
    
}
