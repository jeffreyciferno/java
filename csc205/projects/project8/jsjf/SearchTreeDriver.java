package com.csc205.projects.project8.jsjf;

import com.csc205.projects.project8.jsjf.LinkedBinarySearchTree;
/**Output:
 * Tree : 1 2 3 4 5 6 7 8 9 
 * Min : 1
 * Max : 9
 * 
 * @author Jeffrey Ciferno
 */
public class SearchTreeDriver {

	public static void main(String[] args) {
		LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<>();
		
		tree.addElement(3);
		tree.addElement(7);
		tree.addElement(2);
		tree.addElement(9);
		tree.addElement(5);
		tree.addElement(4);
		tree.addElement(8);
		tree.addElement(1);
		tree.addElement(6);
		
		System.out.print("Tree : ");
		for (Integer integer : tree) {
			System.out.print(""+integer +" ");
		}


		System.out.println("\nMin : "+ tree.findMin());
		System.out.println("Max : "+ tree.findMax());
		
		
	}

}
