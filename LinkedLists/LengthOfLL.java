package LinkedLists;

public class LengthOfLL {
    public static int lengthOfLL(Node head) {
		int length = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		return length;
	}
}
