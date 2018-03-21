package main.ds.session3.main.tree;

import java.util.ArrayList;
import java.util.List;

import main.ds.session3.utils.Node;

/**
 * returns the traversed nodes in pre ordered traversal using recursive calling
 * @author Manasi Pandya
 *
 */
public class PreOrder<T> {
	private List<T> traversedPath;
	
	public PreOrder() {
		traversedPath = new ArrayList<>();
	}
	public List<T> preorder(Node<T> root) {
		/*Adds the current node data*/
		traversedPath.add(root.data);
		/*Visits the left subtree recursively*/
		if(root.left != null) {
			preorder(root.left);
		}
		/*Visits the right subtree recursively*/
		if(root.right != null) {
			preorder(root.right);
		}
		return traversedPath;
	}
}