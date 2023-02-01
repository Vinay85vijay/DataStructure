package com.dsa;

public class LL {
	Node head;
	private int size;
	LL(){
		this.size=0;
	}
	class Node{		
		String data;
		Node next;
		Node(String data){
			this.data=data;
			Node next = null;
			size++;
		}
	}
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head= newNode;
			return;
		}
		 newNode.next=head;
		 head=newNode;
  		
	}
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currentNode = head;
		 currentNode = currentNode.next;
		 currentNode.next = newNode;
	}
	 public void printList() {
		 if(head==null) {
			 System.out.println("Linked list is Empty");
			 
		 }
		 Node currentNode =head;
		 while(currentNode!=null) {
			 System.out.print(currentNode.data+"--> ");
			 currentNode = currentNode.next;
		 }
		 System.out.println("Null");
		 
	 }
	 public void removeFirst() {
		 
		 if(head==null) {
			 System.out.println("Linked list is Empty");
	 }
		 size--;
		 head=head.next;
		 
	 }
	 public void removeLast() {
		 if(head==null) {
			 System.out.println("Linked list is Empty");
	 }
		 size--;
		 if(head.next==null) {      //if only one node present in the linkedList   
			 head=null;
			 return;
		 }
		 Node secondLastNode=head;
		 Node lastNode= head.next;
		 while(lastNode.next!=null) {
			 lastNode=lastNode.next;
			 secondLastNode=secondLastNode.next;
		 }
		 secondLastNode.next=null;
	 }
	 public int getSize() {
		return size;
		 
	 }
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.addLast("list");
		list.printList();
		list.addFirst("this");
		list.printList();
		list.removeFirst();
		list.printList();
		list.removeLast();
		list.printList();    		
		System.out.println(list.getSize());
	}

}
