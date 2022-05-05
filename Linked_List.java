import java.util.*;

class Linked_List{
	Scanner sc=new Scanner(System.in);
	 static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	void add(){
		System.out.println("Enter value");
		int data=sc.nextInt();
		Node n=new Node(data);
		Node temp=head;
		if(head==null){
			head=n;
		}else{
			while(temp.next != null){
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	
	void disp(Node temp){
		
		while(temp != null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	Node revers(Node head){
		Node LinkedListNode=null;
		Node pointer=head;
		Node temp=null;
		while(LinkedListNode != null){
			temp=LinkedListNode.next;
			LinkedListNode.next=pointer;
			pointer=LinkedListNode;
			LinkedListNode=temp;
		}
		head=pointer;
		return head;
		
		
		}
	
	public static void main(String args[]){
		Linked_List L=new Linked_List();
		
		L.add();
		L.add();
		L.add();
		L.add();
		L.add();
		
		head=L.revers(head);
		L.disp(head);
	}
}