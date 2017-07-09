package com.suhas.trees;


class Node{
	
	int data;
	Node left,right;
	
	public Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class BinaryTree{
	
	private static Node root;
	
	private static void insert(int data){
		
		Node temp=new Node(data);
		if(root==null){
			root=temp;
			return;
		}
		Node current=root;
		Node parent=null;
		
		while(true){
			parent=current;
			if(data<current.data){
				current=current.left;
				if(current==null){
					parent.left=temp;
					return;
				}
				
			}
			else{
				current=current.right;
				if(current==null){
				parent.right=temp;
				return;
				}
			}
			
		}
	}
	
	private static void display(Node node){
		if(node!=null){
			display(node.left);
			System.out.print(node.data+" ");
			display(node.right);
			//System.out.print(node.data);
		}
		
	}
	public static void main(String args[]){

		BinaryTree b = new BinaryTree();
		b.insert(13);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);
		
	}
}
