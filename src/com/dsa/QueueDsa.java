package com.dsa;
import java.util.Scanner;
public class QueueDsa {
	static int size=5;
	static int queue[]= new int[size];
	static int front =0;
	static int rear =0;
	public static void enQueue(int ele) {
		if(isFull()) {
			System.out.println("element cant be added,queue is full");
		}
		else {
			queue[front]=ele;
			front++;
		}
	}
	private static boolean isFull() {
		if(rear==size-1)
		return true;
		else
			return false;
	}
   
    public static void deQueue() {
    	if(isEmpty()) {
    		System.out.println("queue is empty,no elements to remove");
    	}
    	else {
    		for(int i= front;i<rear;i++) {
    			queue[i]=queue[i+1];
    			rear--;
    		}
    	}
    }
	private static boolean isEmpty() {
		if(rear==front)
		return true;
		else 
			return false;
	}
    public static void display() {
    	if(isEmpty()) {
    		System.out.println("nothing to display,queue is empty");
    	}
    	else {
    		for(int i=front;i<rear;i++) {
    			System.out.println(queue[i]);
    		}
    	}
    }
	public static void main(String[] args) {
		  while(true) {
		         System.out.println("1. enQueue");
		         System.out.println("2. deQueue");
		         System.out.println("3. isEmpty?");
		         System.out.println("4. isFull?");
		         System.out.println("5. display");
		         System.out.println(("6. exit"));
		         Scanner sc = new Scanner(System.in);
		         int option=sc.nextInt();
		         switch(option) {
		         case 1: int ele = sc.nextInt();
		                   enQueue(ele);
		                   break;
		         case 2:deQueue();
		                 break;
		         
		         case 3: if(isEmpty()) {
		        	 System.out.println("queue is empty");
		         }
		         else
		        	  System.out.println("queue has space");
		         break;
		         case 4 : if(isFull()) {
		        	 
			            System.out.println("queue is full");
			         }
			         else {
			        	 System.out.println("queue is not full");
			         }
			         break;
		         case 5: display();
		         break;
		         
		         case 6 : System.exit(0);   
		         default :
		        	   System.out.println("invalid number,please check the number and type again");
		         }
		     }
				
			}}


	


