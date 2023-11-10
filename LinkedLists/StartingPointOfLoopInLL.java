package LinkedLists;
/*
Problem Statement: 
    You are given a singly linked list that may or maynot contain a cycle. You are
supposed to return the node where the cycle begins,if a cycle exists,else return 
null.

A cycle occures when a node's next pointer returns to a previous node in the list.

Example:
1 2 3 4 -1 (linked List)
1 (postion in the linked list where the tail connects to.If the position is -1 then
there is no cycle in the linked list)
output:
1
Explanation:
In the given linked list, there is a cycle starting at position 1, 
hence we return 1.
*/ 
// class Node<T> {

// 	T data;
// 	Node<T> next;
// 	Node(T data){
// 		this.data = data;
// 	}
// }
public class StartingPointOfLoopInLL {
    public static Node<Integer> firstNodeOfLoop(Node<Integer> head){
        if(head == null || head.next == null){
            return null;
        }
        Node<Integer> slow = head, fast = head, startingNode = head;
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(slow != startingNode){
                    slow = slow.next;
                    startingNode = startingNode.next;
                }
                return slow;
            }
        }
        return null;
    }
}
