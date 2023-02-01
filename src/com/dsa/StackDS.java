package com.dsa;

import java.util.Scanner;

public class StackDS {
	static int size=5;
	static int stack[]= new int [size];
	static int top=-1;
	public static void push(int ele) {
		if(isFull()) {
			System.out.println("stack is full");
		}
		else {
			top++;
			stack[top]=ele;
			System.out.println(stack[top]+" element added successfully ");
		}
	}

	private static boolean isFull() {
		if(top==size-1) {
		return true;
	} else {
		return false;
	}
		
	} 
	public static void pop() {
		if(isEmpty()) {
			System.out.println("no elments are present to remove ,stack is empty");
		}
		else {
			System.out.println(stack[top]+"Last entered  element removed");
			 top--;
		}
	}

	private static boolean isEmpty() {
		if(top==-1) {
		return true;
	}
		else {
			return false;
		}
	}
	public static void display() {
		if(isEmpty()) {
			System.out.println("no elments are present to display,stack is empty");
		}
		else {
			for(int i=top;i>=0;i--) {
				 System.out.println(stack[i]);
				 System.out.println();
			}
		}
	}
	public static void peek() {
		if(isEmpty()) {
			System.out.println("no peek value to present ,stack is empty");
		}
		else {
			System.out.println(stack[top]);
		}
	}
	public static void main(String[] args) {
    while(true) {
         System.out.println("1. push");
         System.out.println("2. pop");
         System.out.println("3. peek");
         System.out.println("4. display");
         System.out.println("5. isEmpty?");
         System.out.println("6. isFull?");
         System.out.println(("7. exit"));
         Scanner sc = new Scanner(System.in);
         int option=sc.nextInt();
         switch(option) {
         case 1: int ele = sc.nextInt();
                   push(ele);
                   break;
         case 2:pop();
                 break;
         case 3: peek();
         break;
         case 4: display();
         break;
         case 5 : if(top==-1)
         {
        	 System.out.println("stack is empty");
         }
         else {
        	 System.out.println("stack has some elements");
         }
         break;
         
         case 6:if(top==size-1) {
        	 
            System.out.println("stack is full");
         }
         else {
        	 System.out.println("stack is not full");
         }
         break;
         case 7: System.exit(0);
          
         default :
        	   System.out.println("invalid number,please check the number and type again");
         }
     }
		
	}

}
